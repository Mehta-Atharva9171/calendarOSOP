
import java.util.ArrayList;
import java.util.Scanner;

public class todoList {

    private static int choice;
    private static ArrayList<String> tasks;

    private static final Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Add Task");
        System.out.println("2. View Task");
        System.out.println("3. Mark Task Complete");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
    }

    public static void task() {
        tasks = new ArrayList<>();
    }

    public static void choice() {
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                addTask();
            }
        }
    }

    public static void addTask() {
        System.out.println("Enter task : ");
        String t = sc.nextLine();

    }

}
