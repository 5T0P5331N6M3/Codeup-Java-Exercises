package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input() {

        this.scanner = new Scanner(System.in);
    }
    public String getString() {
        System.out.println("Enter a word: ");
        String getString;
        getString = scanner.next();
        return getString;
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
        System.out.println("Enter a number: ");
        int getInt;
        // replace nextInt with getString method created in previous exercise using the following methods to convert the returned String into the desired datatype:
        // Integer.valueOf(String s);
        // Print Prompt
        getInt = scanner.nextInt();
        return getInt;
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
        System.out.println("Choose a decimal number.");
        double getDouble;
        // replace nextInt with getString method created in previous exercise using the following methods to convert the returned String into the desired datatype:
        //Double.valueOf(String s);
        getDouble = scanner.nextDouble();
        return getDouble;
    }
    public double getRadius() {
        System.out.println("What is the radius of some circle?");
        double getRadius;
        getRadius = scanner.nextDouble();
        return getRadius;
    }
    public static void main(String[] args)
    {
        Input lost = new Input();
        System.out.println(lost.getInt(1, 10));
        System.out.println(lost.getDouble(1, 10));
    }
}
