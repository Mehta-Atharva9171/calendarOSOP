
import java.util.Scanner;

public class calneder {
    private static int month;
    private static int days;
    // private static int choice;
    private static Scanner sc = new Scanner(System.in);

    public static void month() {
        System.out.println("----- MENU -----");
        System.out.println(
                "1. January\n2. February\n3. March\n4. April\n5. May\n6. June\n7. July\n8. August\n9. September\n10. Octomber\n11. November\n12. December");
        System.out.println("Choose a month");
        month = sc.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            days31();
        }
        if (month == 2) {
            days28();
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            days30();
        }
    }

    public static void dayOfWeek() {
        System.out.println("----- MENU -----");
        System.out.println("1. Sunday\n2. Monday\n3. Tuesday\n4. Wednesday\n5. Thursday\n6. Friday\n7. Saturday");
        System.out.println("Choose a Day for starting of your month");
        days = sc.nextInt();
    }

    public static void days31() {
        dayOfWeek();
        int day1 = 31;
        switch (days) {
            case 1 -> {
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                for (int i = 1; i <= day1; i++) {
                    System.out.printf("%4d", i);
                    if (i % 7 == 0) {
                        System.out.println();
                    }
                }
            }
            case 2 -> {
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                int offSet = (2 - 1) % 7;
                for (int i = 1; i <= day1; i++) {
                    if (i == 1) {
                        System.out.printf("  ");
                        for (int j = 0; j < offSet; j++) {
                            System.out.printf("  ");
                        }
                    }
                }
            }
            case 3 -> {

            }
            case 4 -> {
            }
            case 5 -> {
            }
            case 6 -> {
            }
            case 7 -> {
            }
            default -> {
            }
        }
    }

    public static void days30() {
        dayOfWeek();
        int day = 30;
        switch (days) {
            case 1 -> {
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                for (int i = 1; i <= day; i++) {
                    System.out.printf("%4d", i);
                    if (i % 7 == 0) {
                        System.out.println();
                    }
                }
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
            }
            case 6 -> {
            }
            case 7 -> {
            }
            default -> {
            }
        }
    }

    public static void days28() {

    }

    // I have created all the functions for us
    public static void main(String[] args) {
        month();
    }
}