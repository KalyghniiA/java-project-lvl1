package hexlet.code;

import java.util.Map;
import java.util.Scanner;

public class Engine {
    private static Scanner sc = new Scanner(System.in);

    public static void getResultGame(Map<String, String> conditions, String description) {
        String name = Cli.gettingToKnowUser();

        System.out.println(description);

        for (Map.Entry<String, String> condition: conditions.entrySet()) {
            String question = condition.getKey();
            String correctAnswer = condition.getValue();

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
