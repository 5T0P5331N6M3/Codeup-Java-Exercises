package JavaExercisesNotFromCodeup;

import java.util.Scanner;

public class MathOps
{
    public static void main(String[] args)
    {
        Scanner numInput = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        //  Write a Java program to print the sum of two numbers.
        //  I added user input for numbers for better understanding.
        System.out.println("Type first number to add: ");
        num1 = numInput.nextInt();
        System.out.println("Type second number to add: ");
        num2 = numInput.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of your two numbers is " + sum);

        //  Write a Java program to divide two numbers and print on the screen.
        System.out.println("Type first number to divide: ");
        num1 = numInput.nextInt();
        System.out.println("Type second number to divide by: ");
        num2 = numInput.nextInt();
        int quotient = num1 / num2;
        System.out.println("The quotient of your input is " + quotient);
    }
}