package Question;


public class Question_Runner {


    public static void main(String[] args) {


    Question_objects objects = new Question_objects();

    Question question  =  objects.create_question_objects();

    question.print_question(question.getMultiple_choice_questions());














    }





}
