package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner sc = new Scanner(System.in);

    public static boolean getResultGame(int correctAnswer, String question, String name) {
        System.out.println("Question: " + question);
        int answer = sc.nextInt();
        System.out.println("Your answer: " + answer);
        if (answer != correctAnswer) {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
            System.out.println("Let\'s try again, " + name + "!");
            return false;
        }
        System.out.println("Correct!");
        return true;
    }

    public static boolean getResultGame(String correctAnswer, String question, String name) {
        System.out.println("Question: " + question);
        String answer = sc.next();
        System.out.println("Your answer: " + answer);
        if (!answer.equals(correctAnswer)) {
            System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
            System.out.println("Let\'s try again, " + name + "!");
            return false;
        }
        System.out.println("Correct!");
        return true;
    }
}
