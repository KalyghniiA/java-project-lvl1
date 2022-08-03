package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner sc = new Scanner(System.in);

    public static void getResultGame(String[] conditions, String description) {
        String name = Cli.gettingToKnowUser();

        System.out.println(description);

        for (var elem: conditions) {
            String[] condition = elem.split("=");
            String question = condition[0];
            String correctAnswer = condition[1];

            System.out.println("Question: " + question);
            String answer = sc.next();

            System.out.println("Your answer: " + answer);

            if (!answer.equals(correctAnswer)) {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let\'s try again, " + name + "!");
                return;
            }
            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
        return;
    }
}
