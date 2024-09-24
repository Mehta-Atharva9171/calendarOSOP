
import java.util.Scanner;

public class UnitConverter {
    private static final Scanner sc = new Scanner(System.in);
    private static int fromUnit;
    private static int toUnit;

    public static void menu() {
        System.out.println("----- MENU -----");
        System.out.println("1. Length");
        System.out.println("2. Mass");
        System.out.println("3. Exit");
        System.out.println();
        userChoice();
    }

    public static void userChoice() {
        System.out.println("Choose an option");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                lengthmenu();
            }
            case 2 -> {
                massmenu();
            }
            case 3 -> {
                System.out.println("Exiting....");
                System.exit(0);
            }
            default -> {
                System.out.println("Invalid Choice");
            }
        }
    }

    public static void lengthmenu() {
        System.out.println("Choose to convert from: ");
        System.out.println("1. Centimeters");
        System.out.println("2. Millimeters");
        System.out.println("3. Kilometers");
        fromUnit = sc.nextInt();
        System.out.println();
        System.out.println("Choose to convert to: ");
        System.out.println("1. Centimeters");
        System.out.println("2. Millimeters");
        System.out.println("3. Kilometers");
        toUnit = sc.nextInt();
        System.out.println();
        System.out.println("Enter the value");
        double value = sc.nextDouble();

        double convertedValue = convertLength(value);
        System.out.println("Converted Value = " + convertedValue);
    }

    public static double convertLength(double value) {
        final double cmPermm = 0.1;
        final double cmPerkm = 100000;

        double cm = value;
        // convert to centimeter
        if (fromUnit == 2) {
            cm *= cmPerkm;
        } else if (fromUnit == 3) {
            cm *= cmPerkm;
        }

        // convert from centimeter
        if (toUnit == 2) {
            return cm / cmPermm;
        } else if (toUnit == 3) {
            return cm / cmPerkm;
        }
        return cm;
    }

    public static void massmenu() {
        System.out.println("Choose to convert from: ");
        System.out.println("1. Kilograms");
        System.out.println("2. Grams");
        System.out.println("3. Milligrams");
        System.out.println("Enter your choice");
        fromUnit = sc.nextInt();
        System.out.println();
        System.out.println("Choose to convert to:");
        System.out.println("1. Kilograms");
        System.out.println("2. Grams");
        System.out.println("3. Milligrams");
        System.out.println("Enter your choice");
        toUnit = sc.nextInt();
        System.out.println();
        System.out.println("Enter the value: ");
        double value = sc.nextDouble();

        double convertedValue = convertMass(value);
        System.out.println("converted value : " + convertedValue);
        convertMass(value);
    }

    public static double convertMass(double value) {
        final double gPerkg = 1000;
        final double gPermg = 0.001;

        double grams = value;
        if (fromUnit == 1) {
            grams = value * gPerkg;
        } else if (fromUnit == 3) {
            grams = value * gPermg;
        }

        if (toUnit == 1) {
            return grams / gPerkg;
        } else if (toUnit == 3) {
            return grams / gPermg;
        }
        return grams;
    }

    public static void yesOrNo() {
        String choice = new String();
        System.out.println();
        System.out.println("Do you want to continue...");
        System.out.println("1. Yes \n2. No");
        choice = sc.next();
        if (choice.equals("Yes") || choice.equals("yes") || choice.equals("Y") || choice.equals("y")) {
            menu();
        } else {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        do {
            menu();
            yesOrNo();
        } while (true);
    }
}
