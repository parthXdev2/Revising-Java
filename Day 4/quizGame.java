import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {

        String[] questions = { "What is the capital of France?",
                "Which language is mainly used for Android app development?",
                "Who is known as the father of computers?",
                "Which planet is known as the Red Planet?",
                "Which data structure works on the principle of LIFO?"
        };

        String[][] options = { { "1.Berlin", "2.Madrid", "3.Paris", "4.Rome" },
                { "1.Python", "2.Java", "3.Html", "4.CSS" },
                { "1.Mark Zukerberg", "2.Charles Babbage", "3.Jeff Bezos", "4.Tony Stark" },
                { "1.Earth", "2.Mars", "3.Jupiter", "4.Venus" },
                { "1.Queue", "2.LinkedList", "3.Arrays", "4.Stack" } };

        int[] answers = { 3, 2, 2, 2, 4 };
        int score = 0;
        int guess;

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Java Quiz Game");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("ENter your guess : ");
            guess = sc.nextInt();

            if (guess == answers[i]) {
                System.out.println("Correct ");
                score++;
            } else {
                System.out.println("Wrong Answer");
            }

            
        }
        System.out.println("Your final score is " + score + " out of " + questions.length);

        sc.close();

    }

}
