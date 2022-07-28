package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void playingGame(String name) {
        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int MAX_NUM_WINS = 3;
        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        for (var i = 0; i < MAX_NUM_WINS; i++) {
            int number = rnd.nextInt(20);
            System.out.println("Question: " + Integer.toString(number));
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            String answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
