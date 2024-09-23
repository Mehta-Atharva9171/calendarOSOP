
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    private static final Random rand = new Random();
    private static final Scanner sc = new Scanner(System.in);
    private static int attempt = 0;
    private static int secretNumber = 0;
    private static int guess;

    public static void menu() {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 to 100");
        number();
    }

    public static void number() {
        secretNumber = rand.nextInt(100) + 1;
        userGuess();
    }

    public static void userGuess() {
        System.out.println("Enter your guess:");
        guess = sc.nextInt();
        attempt++;
        check();
    }

    public static void check() {
        if (guess == secretNumber) {
            System.out.println("Congratulations! you won!");
        } else if (guess < secretNumber) {
            System.out.println("Too Low!! Try again");
        } else {
            System.out.println("Too High!! Try again");
        }
    }

    public static void main(String[] args) {
        do {
            menu();
        } while (attempt < 3);
    }
}
