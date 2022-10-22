package JavaExercisesNotFromCodeup;

import java.util.Scanner;

public class Sum
{
    public static void main(String[] args)
    {
        Scanner numInput = new Scanner(System.in);
        System.out.println("Type first number to add: ");
        int num1 = numInput.nextInt();
        System.out.println("Type second number to add: ");
        int num2 = numInput.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of your two numbers is " + sum);
    }
}
//Write a Java program to print the sum of two numbers.
//I added user input for numbers for better understanding.