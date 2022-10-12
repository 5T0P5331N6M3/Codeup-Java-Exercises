package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }
    public String getString() {
        System.out.println();
        return null;
    }
    public boolean yesNo(String prompt1) {
        String ghost = "";
        System.out.println(prompt1);
        String response1 = this.scanner.next();
        return response1.equalsIgnoreCase("y") || response1.equalsIgnoreCase("yes") || response1.equalsIgnoreCase("sí");
    }
    public int getInt(int min, int max) {
        int getInt = 0;
        do {
            System.out.println("Enter a number: ");
            getInt = scanner.nextInt();
            if (getInt < min || getInt > max) {
                System.out.println("You did not enter a number within the range.");
            }
        } while(getInt < min || getInt > max);
        return getInt;
    }
    public int getInt() {
        System.out.println();
        return 0;
    }
    public double getDouble(double min, double max) {
        double getDouble = 0;
        do {
            System.out.println("Enter a number: ");
            getDouble = scanner.nextDouble();
            if (getDouble < min || getDouble > max) {
                System.out.println("You did not enter a number within the range.");
            }
        } while(getDouble < min || getDouble > max);
        return getDouble;
    }
    public double getDouble() {
        System.out.println();
        return 0;
    }
    public String showScanner() {
        return "";
//        return scanner;
    }

    public static void main(String[] args)
    {
        Input lost = new Input();
        System.out.println(lost.getInt(1, 10));
        System.out.println(lost.getDouble(1, 10));
    }
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is the radius of the circle? ");
//    }
}
