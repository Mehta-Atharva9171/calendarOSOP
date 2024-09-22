
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    private static int choice;
    private static int comp;
    private static String userChoice = new String();

    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void rules() {
        System.out.println("Rock Paper Scissor Game");
        System.out.println("----- RULES -----");
        System.out.println("1. Rock beats Scissor");
        System.out.println("2. Scissor beats Paper");
        System.out.println("3. Paper beats Rock");
        System.out.println();
        menu();
    }

    public static void choice() {
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("You chose Rock");
                vaildChoice();
            }
            case 2 -> {
                System.out.println("You chose Scissor");
                vaildChoice();
            }
            case 3 -> {
                System.out.println("You chose Paper");
                vaildChoice();
            }
            default -> {
                System.out.println("Invalid choice");
            }
        }
    }

    public static void menu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");
        System.out.println();
        choice();
    }

    public static void vaildChoice() {
        comp = rand.nextInt(3);
        switch (comp) {
            case 1 -> {
                System.out.println("Computer chose Rock");
                comparision();
            }
            case 2 -> {
                System.out.println("Computer chose Paper");
                comparision();
            }
            case 3 -> {
                System.out.println("Computer chose Scissor");
                comparision();
            }
        }
    }

    public static void tie() {
        System.out.println("Your Choice = " + choice + " Computer choice = " + comp);
        System.out.println("It's a tie");
    }

    public static void rockPaper() {
        System.out.println("Your Choice = " + choice + " Computer choice = " + comp);
        System.out.println("Paper beats Rock");
        System.out.println("You Win");
    }

    public static void paperScissor() {
        System.out.println("Your Choice = " + choice + " Computer choice = " + comp);
        System.out.println("Scissors beats Paper");
        System.out.println("Computer Wins");
    }

    public static void rockScissor() {
        System.out.println("Your Choice = " + choice + " Computer choice = " + comp);
        System.out.println("Rock beats Scissor");
        System.out.println("You Win");
    }

    public static void comparision() {
        if (choice == comp) {
            tie();
        } else {
            if ((choice == 1 && comp == 2) || (comp == 2 && choice == 1)) {
                rockPaper();
                return;
            }

            if ((choice == 2 && comp == 3) || (comp == 3 && choice == 2)) {
                paperScissor();
            }

            if ((choice == 1 && comp == 3) || (comp == 3 && choice == 1)) {
                rockScissor();
            } else {
                System.out.println("Computer Wins");
            }
        }
    }

    public static void main(String[] args) {
        do {
            rules();
            System.out.println();
            System.out.println("Do you want to continue...");
            System.out.println("1. Yes");
            System.out.println("2. No");
            userChoice = sc.next();
        } while ((userChoice.equals("Yes")) || (userChoice.equals("yes")) || (userChoice.equals("Y"))
                || (userChoice.equals("y")));
        sc.close();
    }
}
