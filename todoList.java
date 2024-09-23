
import java.util.ArrayList;
import java.util.Scanner;

public class todoList {

    private static int choice;
    private static ArrayList<String> tasks = new ArrayList<>();

    private static final Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Add Task");
        System.out.println("2. View Task");
        System.out.println("3. Mark Task Complete");
        System.out.println("4. Delete Task");
        System.out.println("5. Exit");
        choice();
    }

    public static void todolist() {
        tasks = new ArrayList<>();
    }

    public static void choice() {
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Enter the task: ");
                String task = sc.next();
                todoList.addTask(task);
            }
            case 2 -> {
                todoList.viewTask();
            }
            case 3 -> {
                System.out.println("Enter the task index");
                int index = sc.nextInt();
                todoList.markTaskCompleted(index - 1);
            }
            case 4 -> {
                System.out.println("Enter the task index:");
                int index = sc.nextInt();
                todoList.deleteTask(index - 1);
            }
            case 5 -> {
                System.out.println("Exiting");
                System.exit(0);
            }
        }
    }

    public static void addTask(String task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public static void viewTask() {
        System.out.println("Your Task");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public static void markTaskCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.set(index, " Completed " + tasks.get(index));
            System.out.println("Task marked as complete");
        } else {
            System.out.println("Invalid Task Index");
        }
    }

    public static void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.remove(index);
            System.out.println("Task deleted successfully");
        } else {
            System.out.println("Invalid Task Index");
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("\n");
            menu();
        } while (true);
    }
}
