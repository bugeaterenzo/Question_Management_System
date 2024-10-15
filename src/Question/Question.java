package Question;

import java.util.*;

public class Question
{
    private static int count_question_objects;
    private static Map<StringBuilder, StringBuilder> multiple_choice_questions = new LinkedHashMap<>();
    private static Map<StringBuilder, ArrayList<String>> question_to_answers_map = new LinkedHashMap<>();
    private static Map<StringBuilder, String> right_answers = new LinkedHashMap<>();
    private StringBuilder question = new StringBuilder();
    private StringBuilder answers = new StringBuilder();
    private StringBuilder right_answer = new StringBuilder();
    private String user_answer;
    private static Map<StringBuilder, String> user_answer_to_each_question_map = new LinkedHashMap<>();



    private int player_point;

    // Constructor
    public Question(String question , String A, String B, String C, String D , String right_answer)
    {
        count_question_objects++;
        setQuestion(question);
        setAnswers(A, B, C, D);
        setRight_answer(right_answer);
        setMultiple_choice_questions(this.question, this.answers); // Create a key-value pair of Questions with multiple choices
        setRight_answers(this.question, right_answer);
        setPlayer_point(0);
        setQuestionToAnswersMap( this.question ,  A,  B,  C,  D  );
    }


    // Getter and Setter for QuestionToAnswersMap

    private static void setQuestionToAnswersMap(StringBuilder question, String A, String B, String C, String D) {
        ArrayList<String> answers = new ArrayList<>();
        answers.add(A);  // Add option A
        answers.add(B);  // Add option B
        answers.add(C);  // Add option C
        answers.add(D);  // Add option D

        question_to_answers_map.put(question, answers);  // Add question and its answers to the map
    }

    public Map<StringBuilder, ArrayList<String>> getQuestionToAnswersMap() {
        return question_to_answers_map;
    }



    // Setters
    private void setQuestion(String question) { this.question.append(question); }
    private void setAnswers(String A, String B, String C, String D) { this.answers.append(A).append(B).append(C).append(D); }
    public StringBuilder getRight_answer() { return this.right_answer; }
    private void setRight_answer(String right_answer) { this.right_answer.append(right_answer); }

    // Player Points
    public int getPlayer_point() { return player_point; }
    public void setPlayer_point(int player_point) { this.player_point = player_point; }

    // Create a key-value pair of Questions with multiple choices
    private static void setMultiple_choice_questions(StringBuilder question, StringBuilder answers)
    {
        Question.multiple_choice_questions.put(question, answers);
    }

    public Map<StringBuilder, StringBuilder> getMultiple_choice_questions ()
    {
        return this.multiple_choice_questions;
    }

    // Set The Right Answer For Each Question
    private static void setRight_answers(StringBuilder question, String right_answer)
    {
        right_answers.put(question, right_answer);
    }

    public Map<StringBuilder, String> getRight_answers ()
    {
        return this.right_answers;
    }

    // User Answer
    public String getUser_answer() { return this.user_answer; }
    public void setUser_answer(String user_answer) { this.user_answer = user_answer; }

    private static void setUser_answer_to_each_question_map(StringBuilder question, String user_answer)
    {
        user_answer_to_each_question_map.put(question, user_answer);
    }

    private Map<StringBuilder, String> getUser_answer_to_each_question_map ()
    {
        return this.user_answer_to_each_question_map;
    }

    public void check_answer(Map<StringBuilder, String> right_answers, Map<StringBuilder, String> user_answer_to_each_question_map) {
        // Loop through each right answer entry
        for (Map.Entry<StringBuilder, String> entry : right_answers.entrySet()) {
            StringBuilder question = entry.getKey();  // Get the question (StringBuilder)
            String right_answer = entry.getValue();   // Get the correct answer for the question

            System.out.println();
            System.out.print("Right answer: " + right_answer + "  ");

            // Retrieve the corresponding user answer using the question
            String user_guess = user_answer_to_each_question_map.get(question); // Get the user's answer
            System.out.print("User answer: " + user_guess + "  ");

            // Compare the correct answer and user answer
            String result = (right_answer.equalsIgnoreCase(user_guess)) ? "True" : "False";
            System.out.println("Result: " + result);

            // Increment points if the answer is correct
            if (result.equals("True")) {
                this.player_point++;
            }
        }

    }

    public void print_question(Map<StringBuilder, StringBuilder> question) {
        Scanner input = new Scanner(System.in);
        ConsoleReset reset = new ConsoleReset();

        for (Map.Entry<StringBuilder, StringBuilder> entry : question.entrySet()) {
            System.out.println("\nChoose the correct answer for the following question:\n");

            System.out.println(entry.getKey());
            System.out.println(entry.getValue());



            // Loop until a valid input is provided
            while (true)
            {
                System.out.print("Your Choice: ");
                String answer = input.nextLine().toUpperCase();

                // Check if the input is null or empty
                if (answer == null || answer.isEmpty()) {
                    System.out.println("Null or empty value! Please give a proper value.");
                }
                // Check if the input contains only valid characters (A, B, C, D)
                else if (!(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D"))) {
                    System.out.println("Invalid input! Only A, B, C, or D are allowed.");
                }
                // If the input passes validation, break out of the loop
                else {
                    setUser_answer(answer);  // Store the valid answer
                    break;  // Valid input found, exit the loop
                }
            }


            setUser_answer_to_each_question_map(entry.getKey(), getUser_answer());

            reset.wait_a_minute_who_are_you(2000);
            reset.resetConsole();
        }

        check_answer(getRight_answers(), getUser_answer_to_each_question_map());

        print_player_point();

        print_right_answers_for_each_wrong_question
                (

                        getRight_answers(),
                        getUser_answer_to_each_question_map(),
                        getQuestionToAnswersMap()
                );


    }


    public void print_right_answers_for_each_wrong_question
            (
                    Map < StringBuilder, String > right_answers,
                    Map < StringBuilder, String > user_answer_to_each_question_map,
                    Map < StringBuilder, ArrayList < String >> QuestionToAnswersMap
            )
    {

        String message = "Here is the correct answers for the incorrect results : \n";

        // Loop through each right answer entry
        for (Map.Entry<StringBuilder, String> entry : right_answers.entrySet()) {
            StringBuilder question = entry.getKey();  // Get the question (StringBuilder)
            String right_answer = entry.getValue();   // Get the correct answer for the question

            // Retrieve the corresponding user answer using the question
            String user_guess = user_answer_to_each_question_map.get(question); // Get the user's answer

            // Compare the correct answer and user answer
            String result = (right_answer.equalsIgnoreCase(user_guess)) ? "True" : "False";

            if (!result.equals("True")) System.out.println(message);

            if (!result.equals("True")) {

                // Retrieve the list of answers for this question from the map
                ArrayList<String> answersList = QuestionToAnswersMap.get(question);

                // Determine the actual right answer value based on the answer key (A, B, C, or D)
                String actual_right_answer_value = "";
                switch (right_answer.toUpperCase()) {
                    case "A":
                        actual_right_answer_value = answersList.get(0);
                        break;
                    case "B":
                        actual_right_answer_value = answersList.get(1);
                        break;
                    case "C":
                        actual_right_answer_value = answersList.get(2);
                        break;
                    case "D":
                        actual_right_answer_value = answersList.get(3);
                        break;
                }
                System.out.print(question);
                System.out.println(actual_right_answer_value);
            }

        }


    }


    public void print_player_point ()
    {
        System.out.println("Total Points: " + getPlayer_point() + "/" + count_question_objects + "\n");
    }

    public void print_right_answers (Map < StringBuilder, String > right_answers)
    {
        for (Map.Entry<StringBuilder, String> entry : right_answers.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

