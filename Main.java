
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    String questionText;
    String[] options;
    String correctAnswer;

    public Question(String questionText, String[] options, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

class Quiz {
    List<Question> questions = new ArrayList<>();
    int score = 0;

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        for (Question q : questions) {
            System.out.println(q.questionText);
            for (int i = 0; i < q.options.length; i++) {
                System.out.println((i + 1) + ". " + q.options[i]);
            }
            int answer = scanner.nextInt();
            if (q.options[answer - 1].equalsIgnoreCase(q.correctAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is: " + q.correctAnswer);
            }
        }
        System.out.println("Your final score is: " + score + "/" + questions.size());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the option number [1-4] for the following questions");
        Quiz quiz = new Quiz();
        quiz.addQuestion(new Question("Number of primitive data types in Java?", new String[]{"6", "7", "8", "9"}, "8"));
        quiz.addQuestion(new Question("Total constructor string class have?", new String[]{"3", "7", "13", "20"}, "13"));
        quiz.addQuestion(new Question("Identify the return type of a method that does not return any value.", new String[]{"int", "void", "double", "none"}, "void"));
        quiz.addQuestion(new Question("Output of Math.floor(3.6)", new String[]{"3", "3.0", "4", "4.0"}, "3.0"));
        quiz.addQuestion(new Question("Where does the system stores parameters and local variables whenever a method is invoked?", new String[]{"heap", "stack", "array", "tree"}, "stack"));
        quiz.addQuestion(new Question("Identify the modifier which cannot be used for constructor.", new String[]{"public", "protected", "private", "static"}, "static"));
         quiz.addQuestion(new Question("What is the size of an int in Java?", 
            new String[]{"1 byte", "2 bytes", "4 bytes", "8 bytes"}, "4 bytes"));
        
        quiz.addQuestion(new Question("Which of the following is not a Java keyword?", 
            new String[]{"static", "Boolean", "void", "native"}, "Boolean"));
        
        quiz.addQuestion(new Question("What does JVM stand for?", 
            new String[]{"Java Variable Machine", "Java Virtual Machine", "Java Visual Machine", "Java Version Machine"}, "Java Virtual Machine"));
        
        quiz.addQuestion(new Question("Which method is used to start a thread in Java?", 
            new String[]{"run()", "start()", "init()", "begin()"}, "start()"));
        
        quiz.addQuestion(new Question("Which of the following is a valid declaration of a char?", 
            new String[]{"char c = 'a';", "char c = 'ab';", "char c = \"a\";", "char c = a;"}, "char c = 'a';"));
        
        quiz.addQuestion(new Question("What is the default value of a boolean variable in Java?", 
            new String[]{"true", "false", "0", "1"}, "false"));
        
        quiz.addQuestion(new Question("Which of these collections classes is synchronized?", 
            new String[]{"ArrayList", "HashMap", "Vector", "LinkedList"}, "Vector"));
        
        quiz.addQuestion(new Question("What does the 'final' keyword do in Java?", 
            new String[]{"Makes a variable constant", "Prevents method overriding", "Prevents inheritance", "All of the above"}, "All of the above"));
        
        quiz.addQuestion(new Question("Which of these is not a primitive data type in Java?", 
            new String[]{"int", "float", "String", "boolean"}, "String"));
        
        quiz.addQuestion(new Question("Which operator is used to allocate memory for an object in Java?", 
            new String[]{"new", "malloc", "alloc", "&"}, "new"));

        quiz.startQuiz();
    }
}
