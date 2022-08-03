package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final int MAX_NUM_RANDOM = 20;
    private static Random rnd = new Random();
    private static final String DESCRIPTION = "Answer 'yes' if number even otherwise answer 'no'.";
    public static void playingGame() {
        String[] conditions = new String[App.MAX_QUANTITY_CORRECT_ANSWER];

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            int number = rnd.nextInt(MAX_NUM_RANDOM);
            String correctAnswer = number % 2 == 0 ? "yes" : "no";

            conditions[i] = Integer.toString(number) + "=" + correctAnswer;
        }

        Engine.getResultGame(conditions, DESCRIPTION);
    }
}
