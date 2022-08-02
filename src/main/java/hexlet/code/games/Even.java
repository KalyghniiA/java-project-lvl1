package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Cli;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final int MAX_NUM_RANDOM = 20;
    private static Random rnd = new Random();
    public static void playingGame() {
        String name = Cli.gettingToKnowUser();

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");


        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int number = rnd.nextInt(MAX_NUM_RANDOM);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            boolean result = Engine.getResultGame(correctAnswer, Integer.toString(number), name);
            if (!result) {
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
