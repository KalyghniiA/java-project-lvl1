package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;
import hexlet.code.utils.Utils;

import java.util.Random;


public class Progression {
    private static final int MAX_START_NUM_RANDOM = 10;
    private static final int MIN_ITERATION_RANDOM = 5;
    private static final int MAX_ITERATION_RANDOM = 10;
    private static final int MIN_MULTIPLIER_RANDOM = 1;
    private static final int MAX_MULTIPLIER_RANDOM = 5;
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static Random rnd = new Random();

    public static void playingGame() {
        String[] conditions = new String[App.MAX_QUANTITY_CORRECT_ANSWER];

        for (var i = 0; i < App.MAX_QUANTITY_CORRECT_ANSWER; i++) {
            String fullStringQuestion = createString();
            String[] elementsQuestion = fullStringQuestion.split(" ");
            int indexCorrectAnswer = getIndex(elementsQuestion);
            int correctAnswer = getCorrectAnswer(indexCorrectAnswer, elementsQuestion);
            String question = createQuestion(indexCorrectAnswer, elementsQuestion);

            conditions[i] = question + "=" + Integer.toString(correctAnswer);
        }

        Engine.getResultGame(conditions, DESCRIPTION);
    }

    static String createString() {

        int startingNumber = rnd.nextInt(MAX_START_NUM_RANDOM);
        int quantityIteration = Utils.getNumberToInterval(MIN_ITERATION_RANDOM, MAX_ITERATION_RANDOM);
        int multiplier = Utils.getNumberToInterval(MIN_MULTIPLIER_RANDOM, MAX_MULTIPLIER_RANDOM);

        String question = Integer.toString(startingNumber);

        for (var i = 0; i < quantityIteration; i++) {
            startingNumber += multiplier;
            question += " " + Integer.toString(startingNumber);
        }

        return question;
    }

    static String createQuestion(int index, String[] arr) {
        arr[index] = "..";
        return String.join(" ", arr);
    }

    static int getCorrectAnswer(int index, String[] arr) {
        return Integer.valueOf(arr[index]);
    }

    static int getIndex(String[] arr) {
        return rnd.nextInt(arr.length);
    }
}
