
import java.util.Scanner;

public class calneder {
    private static int month;
    private static int days;
    private static String choice;
    private static final Scanner sc = new Scanner(System.in);

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
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%6d", i);
                for (int j = 2; j <= day1; j++) {
                    System.out.printf("%4d", j);
                    if (j == 6 || j == 13 || j == 20 || j == 27) {
                        System.out.println();
                    }
                }
            }
            case 3 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%10d", i);
                for (int j = 2; j <= day1; j++) {
                    System.out.printf("%4d", j);
                    if (j == 5 || j == 12 || j == 19 || j == 26) {
                        System.out.println();
                    }
                }
            }
            case 4 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%14d", i);
                for (int j = 2; j <= day1; j++) {
                    System.out.printf("%4d", j);
                    if (j == 4 || j == 11 | j == 18 || j == 25) {
                        System.out.println();
                    }
                }
            }
            case 5 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%18d", i);
                for (int j = 2; j <= day1; j++) {
                    System.out.printf("%4d", j);
                    if (j == 3 || j == 10 || j == 17 || j == 24) {
                        System.out.println();
                    }
                }
            }
            case 6 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%22d", i);
                for (int j = 2; j <= day1; j++) {
                    System.out.printf("%4d", j);
                    if (j == 2 || j == 9 || j == 16 || j == 23 || j == 30) {
                        System.out.println();
                    }
                }
            }
            case 7 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%26d", i);
                System.out.println();
                for (int j = 2; j <= day1; j++) {
                    System.out.printf("%4d", j);
                    if (j == 8 || j == 15 || j == 22 || j == 29) {
                        System.out.println();
                    }
                }

            }
            default -> {
                System.out.println("Please enter a valid response");
            }
        }
    }

    public static void days30() {
        dayOfWeek();
        int day2 = 30;
        switch (days) {
            case 1 -> {
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                for (int i = 1; i <= day2; i++) {
                    System.out.printf("%4d", i);
                    if (i % 7 == 0) {
                        System.out.println();
                    }
                }
            }
            case 2 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%6d", i);
                for (int j = 2; j <= day2; j++) {
                    System.out.printf("%4d", j);
                    if (j == 6 || j == 13 || j == 20 || j == 27) {
                        System.out.println();
                    }
                }
            }
            case 3 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%10d", i);
                for (int j = 2; j <= day2; j++) {
                    System.out.printf("%4d", j);
                    if (j == 5 || j == 12 || j == 19 || j == 26) {
                        System.out.println();
                    }
                }
            }
            case 4 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%14d", i);
                for (int j = 2; j <= day2; j++) {
                    System.out.printf("%4d", j);
                    if (j == 4 || j == 11 || j == 18 || j == 25) {
                        System.out.println();
                    }
                }
            }
            case 5 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%18d", i);
                for (int j = 2; j <= day2; j++) {
                    System.out.printf("%4d", j);
                    if (j == 3 || j == 10 || j == 17 || j == 24) {
                        System.out.println();
                    }
                }
            }
            case 6 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%22d", i);
                for (int j = 2; j <= day2; j++) {
                    System.out.printf("%4d", j);
                    if (j == 2 || j == 9 || j == 16 || j == 23 || j == 30)
                        System.out.println();
                }
            }
            case 7 -> {
                int i = 1;
                System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                System.out.printf("%26d", i);
                System.out.println();
                for (int j = 2; j <= day2; j++) {
                    System.out.printf("%4d", j);
                    if (j == 8 || j == 15 || j == 22 || j == 29)
                        System.out.println();
                }

            }
            default -> {
                System.out.println("Please enter a valid response");
            }
        }
    }

    public static void days28() {
        String ch = new String();
        System.out.println("Is the year is leap year?");
        System.out.println("1. Y or 2. N");
        ch = sc.next();
        if (ch.equals("Y") || ch.equals("y")) {
            dayOfWeek();
            int day3 = 29;
            switch (days) {
                case 1 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    for (int j = 1; j <= day3; j++) {
                        System.out.printf("%4d", j);
                        if (j == 7 || j == 14 || j == 21 || j == 28) {
                            System.out.println();
                        }
                    }
                }
                case 2 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%6d", i);
                    for (int j = 2; j <= day3; j++) {
                        System.out.printf("%4d", j);
                        if (j == 6 || j == 13 || j == 20 | j == 27) {
                            System.out.println();
                        }
                    }
                }
                case 3 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%10d", i);
                    for (int j = 2; j <= day3; j++) {
                        System.out.printf("%4d", j);
                        if (j == 5 || j == 12 || j == 19 || j == 26) {
                            System.out.println();
                        }
                    }
                }
                case 4 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%14d", i);
                    for (int j = 2; j <= day3; j++) {
                        System.out.printf("%4d", j);
                        if (j == 4 || j == 11 || j == 18 || j == 25) {
                            System.out.println();
                        }
                    }
                }
                case 5 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%18d", i);
                    for (int j = 2; j <= day3; j++) {
                        System.out.printf("%4d", j);
                        if (j == 3 || j == 10 || j == 17 || j == 24) {
                            System.out.println();
                        }
                    }
                }
                case 6 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%22d", i);
                    for (int j = 2; j <= day3; j++) {
                        System.out.printf("%4d", j);
                        if (j == 2 || j == 9 || j == 16 || j == 23) {
                            System.out.println();
                        }
                    }
                }
                case 7 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%26d", i);
                    System.out.println();
                    for (int j = 2; j <= day3; j++) {
                        System.out.printf("%4d", j);
                        if (j == 8 || j == 15 || j == 22) {
                            System.out.println();
                        }
                    }
                }
                default -> {
                    System.out.println("Please enter a valid response");
                }
            }
        }
        if (ch.equals("n") || ch.equals("N")) {
            dayOfWeek();
            int day4 = 28;
            switch (days) {
                case 1 -> {
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    for (int j = 1; j <= day4; j++) {
                        System.out.printf("%4d", j);
                        if (j == 7 || j == 14 || j == 21) {
                            System.out.println();
                        }
                    }
                }
                case 2 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%6d", i);
                    for (int j = 2; j <= day4; j++) {
                        System.out.printf("%4d", j);
                        if (j == 6 || j == 13 || j == 20 | j == 27) {
                            System.out.println();
                        }
                    }
                }
                case 3 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%10d", i);
                    for (int j = 2; j <= day4; j++) {
                        System.out.printf("%4d", j);
                        if (j == 5 || j == 12 || j == 19 || j == 26) {
                            System.out.println();
                        }
                    }
                }
                case 4 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%14d", i);
                    for (int j = 2; j <= day4; j++) {
                        System.out.printf("%4d", j);
                        if (j == 4 || j == 11 || j == 18 || j == 25) {
                            System.out.println();
                        }
                    }
                }
                case 5 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%18d", i);
                    for (int j = 2; j <= day4; j++) {
                        System.out.printf("%4d", j);
                        if (j == 3 || j == 10 || j == 17 || j == 24) {
                            System.out.println();
                        }
                    }
                }
                case 6 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%22d", i);
                    for (int j = 2; j <= day4; j++) {
                        System.out.printf("%4d", j);
                        if (j == 2 || j == 9 || j == 16 || j == 23) {
                            System.out.println();
                        }
                    }
                }
                case 7 -> {
                    int i = 1;
                    System.out.println("Sun Mon Tue Wed Thu Fri Sat");
                    System.out.printf("%26d", i);
                    System.out.println();
                    for (int j = 2; j <= day4; j++) {
                        System.out.printf("%4d", j);
                        if (j == 8 || j == 15 || j == 22) {
                            System.out.println();
                        }
                    }
                }
                default -> {
                    System.out.println("Please enter a valid response");
                }
            }
        }
    }

    // I have created all the functions for us
    public static void main(String[] args) {
        month();
        do {
            System.out.println();
            System.out.println("Do You Want to Continue........");
            System.out.println("1. Y or 2. N");
            choice = sc.next();
            if (choice.equals("Y") || choice.equals("y")) {
                month();
            } else {
                System.exit(0);
            }
        } while (choice.equals("n") || choice.equals("N"));
    }
}