
import java.util.Scanner;

public class calneder {
    private static int month;
    private static int day;
    private static int choice;

    public static void month() {
        System.out.println("----- MENU -----");
        System.out.println(
                "1. January\n2. February\n3. March\n4. April\n5. May\n6. June\n7. July\n8. August\n9. September\n10. Octomber\n11. November\n12. December");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a month");
        month = sc.nextInt();
    }

    public static void day() {
        System.out.println("----- MENU -----");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Monday\n2. Tuesday\n3. Wednesday\n4. Thursday\n5. Friday\6. Saturday\n7. Sunday");
        System.out.println("Choose a Day for starting of your month");
        day = sc.nextInt();
    }

    public static void days31() {

    }

    public static void days30() {

    }

    public static void days28() {

    }

    // I have created all the functions for us
    public static void main(String[] args) {
        month();
        day();
    }
}