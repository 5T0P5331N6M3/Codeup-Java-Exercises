package JavaExercisesNotFromCodeup;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConditionalStatement
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        //  Variables
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //  Write a Java program to get a number from the user and print whether it is positive or negative.
        System.out.println("Enter a number: ");
        num = userInput.nextInt();
        if (num % 2 == 0)
        {
            System.out.println("You entered " + num + ", an even integer.");
        } else
        {
            System.out.println("You entered " + num + ", an odd integer.");
        }

        //  Take three numbers from the user and print the greatest number.
        System.out.println("Searching for the greatest number.\nEnter First Number: ");
        num1 = userInput.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = userInput.nextInt();
        System.out.println("Enter Third Number: ");
        num3 = userInput.nextInt();
        if (num1 > num2 && num1 > num3)
        {
            System.out.println(num1 + " is the greatest number.");
        } else if (num2 > num1 && num2 > num3)
        {
            System.out.println(num2 + " is the greatest number.");
        } else if (num3 > num1 && num3 > num2)
        {
            System.out.println(num3 + " is the greatest number.");
        }
        //   Write a Java program to sort a numeric array and a string array.
    }
}
