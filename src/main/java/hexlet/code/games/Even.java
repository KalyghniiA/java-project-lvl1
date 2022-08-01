package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Even {
    static final int MAX_NUM_RANDOM = 20;
    public static void playingGame() {
        String name = Cli.gettingToKnowUser();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

        Random rnd = new Random();
        Scanner sc = new Scanner(System.in);

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int number = rnd.nextInt(MAX_NUM_RANDOM);
            System.out.println("Question: " + Integer.toString(number));
            String correctAnswer = number % 2 == 0 ? "yes" : "no";
            String answer = sc.next();
            System.out.println("Your answer: " + answer);
            if (!answer.equals(correctAnswer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
