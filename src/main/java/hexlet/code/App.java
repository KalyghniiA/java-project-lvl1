package hexlet.code;

import hexlet.code.games.Gcd;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static final int MAX_QUANTITY_CORRECT_ANSWER = 3;
    private static final int INDEX_GREET = 1;
    private static final int INDEX_EVEN = 2;
    private static final int INDEX_CALC = 3;
    private static final int INDEX_GCD = 4;
    private static final int INDEX_PROGRESSION = 5;
    private static final int INDEX_PRIME = 6;
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner gameNumberScanner = new Scanner(System.in);
        int gameNumber = gameNumberScanner.nextInt();
        System.out.println("Your choice: " + Integer.toString(gameNumber));
        System.out.println("Welcome to the Brain Games!");
        switch (gameNumber) {
            case INDEX_GREET:
                Cli.gettingToKnowUser();
                break;
            case INDEX_EVEN:
                Even.playingGame();
                break;
            case INDEX_CALC:
                Calc.playingGame();
                break;
            case INDEX_GCD:
                Gcd.playingGame();
                break;
            case INDEX_PROGRESSION:
                Progression.playingGame();
                break;
            case INDEX_PRIME:
                Prime.playingGame();
                break;
            default:
                return;
        }
    }
}
