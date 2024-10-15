package Question;

public class Question_objects {


    public Question create_question_objects()
    {
        Question obj_question_1 = new Question(
                "Q1: What is programming?\n",
                "A. A way to write songs and music for computers to play.\n",
                "B. A process of instructing a computer to perform tasks by writing code.\n",
                "C. A method of designing clothes using mathematical formulas.\n",
                "D. A system to organize books in a library using a specific code.\n",
                "B"
        );

        Question obj_question_2 = new Question(
                "Q2: What is Java?\n",
                "A. A type of coffee grown in tropical regions.\n",
                "B. A scripting language used only for web development.\n",
                "C. A popular high-level, object-oriented programming language used for building applications.\n",
                "D. A hardware component used in computer processors.\n",
                "C"
        );

        Question obj_question_3 = new Question(
                "Q3: What is an object in object-oriented programming?\n",
                "A. A physical device used to store data.\n",
                "B. An instance of a class that can have attributes and behaviors.\n",
                "C. A collection of various programming functions.\n",
                "D. A term for temporary variables used inside methods.\n",
                "B"
        );

        Question obj_question_4 = new Question(
                "Q4: What is Inheritance in object-oriented programming?\n",
                "A. The ability of a class to inherit properties and behaviors from another class.\n",
                "B. A process where an object can take multiple forms.\n",
                "C. A way to define a collection of methods without their implementation.\n",
                "D. The practice of hiding internal details of a class and exposing only essential features.\n",
                "A"
        );

        Question obj_question_5 = new Question(
                "Q5: What is a class in object-oriented programming?\n",
                "A. A blueprint for creating objects.\n",
                "B. A special function that can only be used once.\n",
                "C. A method for managing memory in a program.\n",
                "D. A variable that holds multiple values of the same type.\n",
                "A"
        );

        Question obj_question_6 = new Question(
                "Q6: What is polymorphism in object-oriented programming?\n",
                "A. The ability of a function to change its form based on input.\n",
                "B. The process where one class can acquire the properties of another class.\n",
                "C. A feature that allows a class to have multiple methods with the same name but different parameters.\n",
                "D. A way to hide implementation details from the user.\n",
                "C"
        );

        Question obj_question_7 = new Question(
                "Q7: What is encapsulation in object-oriented programming?\n",
                "A. The process of combining data and the methods that operate on that data into a single unit or class.\n",
                "B. The concept of allowing multiple methods to have the same name.\n",
                "C. The method of deriving new classes from existing ones.\n",
                "D. A way to format code for readability.\n",
                "A"
        );

//
//        Question obj_question_8 = new Question(
//                "Q8: What does 'method overloading' mean?\n",
//                "A. Writing multiple methods with the same name but with different parameters.\n",
//                "B. Writing a method in a subclass with the same signature as in the parent class.\n",
//                "C. Writing more code in a method than required.\n",
//                "D. A method that calls itself repeatedly.\n",
//                "A"
//        );
//
//        Question obj_question_9 = new Question(
//                "Q9: What is the purpose of a constructor in a class?\n",
//                "A. To initialize an object when it is created.\n",
//                "B. To clean up resources when an object is destroyed.\n",
//                "C. To define methods for an object.\n",
//                "D. To overload other methods in the class.\n",
//                "A"
//        );
//
//        Question obj_question_10 = new Question(
//                "Q10: What is an interface in Java?\n",
//                "A. A class that implements multiple methods from a superclass.\n",
//                "B. A blueprint of a class that contains abstract methods and constants.\n",
//                "C. A collection of constants and variables used within a class.\n",
//                "D. A method that can only be used by one object.\n",
//                "B"
//        );

//        Question obj_question_11 = new Question(
//                "Q11: What is abstraction in object-oriented programming?\n",
//                "A. The process of hiding the implementation details and showing only functionality to the user.\n",
//                "B. The method of reducing the size of a program.\n",
//                "C. The way that an object can change its behavior based on its class.\n",
//                "D. The act of inheriting properties from one class to another.\n",
//                "A"
//        );
//
//        Question obj_question_12 = new Question(
//                "Q12: Which of the following is a feature of object-oriented programming?\n",
//                "A. Structured programming.\n",
//                "B. Inheritance, encapsulation, and polymorphism.\n",
//                "C. Recursion and iteration.\n",
//                "D. Memory allocation and garbage collection.\n",
//                "B"
//        );
//
//        Question obj_question_13 = new Question(
//                "Q13: What is the difference between an abstract class and an interface?\n",
//                "A. An abstract class can have both abstract and concrete methods, while an interface can only have abstract methods (before Java 8).\n",
//                "B. An interface can only be implemented by one class.\n",
//                "C. Abstract classes can be instantiated directly, while interfaces cannot.\n",
//                "D. Abstract classes cannot have constructors, but interfaces can.\n",
//                "A"
//        );
//
//        Question obj_question_14 = new Question(
//                "Q14: What is the main purpose of the 'this' keyword in Java?\n",
//                "A. To refer to the current object instance.\n",
//                "B. To reference the parent class.\n",
//                "C. To define a constant variable.\n",
//                "D. To indicate a static method in a class.\n",
//                "A"
//        );
//
//        Question obj_question_15 = new Question(
//                "Q15: What is method overriding?\n",
//                "A. Defining a method with the same name and signature in both a subclass and its superclass.\n",
//                "B. Writing two methods with the same name but different parameters.\n",
//                "C. Writing a method inside a loop for efficiency.\n",
//                "D. Creating a method that has no return type.\n",
//                "A"
//        );
//
//        Question obj_question_16 = new Question(
//                "Q16: What is a static method in Java?\n",
//                "A. A method that belongs to the class, rather than to any object of the class.\n",
//                "B. A method that can only be called inside a loop.\n",
//                "C. A method that can modify instance variables of a class.\n",
//                "D. A method that cannot be called outside its class.\n",
//                "A"
//        );
//
//        Question obj_question_17 = new Question(
//                "Q17: What is the purpose of the `super` keyword in Java?\n",
//                "A. To call a method from the parent class.\n",
//                "B. To create a new superclass.\n",
//                "C. To refer to the current class instance.\n",
//                "D. To invoke a static method from another class.\n",
//                "A"
//        );
//
//        Question obj_question_18 = new Question(
//                "Q18: What is a package in Java?\n",
//                "A. A namespace that organizes classes and interfaces.\n",
//                "B. A single file that contains all the classes in a project.\n",
//                "C. A predefined method in Java.\n",
//                "D. A file format used to distribute Java applications.\n",
//                "A"
//        );
//
//        Question obj_question_19 = new Question(
//                "Q19: What is a 'finally' block in exception handling?\n",
//                "A. A block that is always executed after a try/catch block, regardless of whether an exception occurred or not.\n",
//                "B. A block that is executed only if an exception is caught.\n",
//                "C. A method to define multiple catch blocks in a program.\n",
//                "D. A mechanism to handle exceptions raised by other threads.\n",
//                "A"
//        );
//
//        Question obj_question_20 = new Question(
//                "Q20: What is garbage collection in Java?\n",
//                "A. The process of reclaiming unused memory automatically.\n",
//                "B. A manual process of deleting objects.\n",
//                "C. A way to handle errors in a program.\n",
//                "D. A system for organizing files in memory.\n",
//                "A"
//        );



        return obj_question_1;
    }



}
