
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

    private static int choice;
    private static int comp;

    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();

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
        if (choice == 1 || choice == 2 || choice == 3) {
            vaildChoice();
        } else {
            System.out.println("Invalid choice");
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

    public static void comparision() {
        if (choice == comp) {
            System.out.println("Its a tie");
        }
        if (choice == 1 && comp == 2) {
            System.out.println("Your Choice = " + choice + " Computer choice = " + comp);
            System.out.println("Paper beats Rock");
        }
    }

    public static void main(String[] args) {
        rules();
        System.out.println("choice" + choice);
    }
}
