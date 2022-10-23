package JavaExercisesNotFromCodeup;

import java.util.Scanner;

import static java.lang.Math.PI;

public class BasicJava1
{
    public static void main(String[] args)
    {
        Scanner numInput = new Scanner(System.in);

        //  Variables
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //  Write a Java program to print the sum of two numbers.
        //  I added user input for numbers for better understanding.
        System.out.println("Type first number to add: ");
        num1 = numInput.nextInt();
        System.out.println("Type second number to add: ");
        num2 = numInput.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum of your two numbers is " + sum + ".");

        //  Write a Java program to divide two numbers and print on the screen.
        System.out.println("Type first number to divide: ");
        num1 = numInput.nextInt();
        System.out.println("Type second number to divide by: ");
        num2 = numInput.nextInt();
        int quotient = num1 / num2;
        System.out.println("The quotient of your input is " + quotient + ".");

        /* Write a Java program to print the result of the following operations:*/
        int a = -5 + 8 * 6;
        int b = (55 + 9) % 9;
        int c = 20 + -3 * 5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;

        System.out.println( -5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
        // Or
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        //  Write a Java program that takes two numbers as input and display the product of two numbers.
        System.out.println("Type a number to multiply with: ");
        num1 = numInput.nextInt();
        System.out.println("Type another number to multiply with: ");
        num2 = numInput.nextInt();
        int product = num1 * num2;
        System.out.println("The product of your two numbers is " + product + ".");

        //  Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        int testNum1 = 125;
        int testNum2 = 24;
        System.out.println(testNum1 + testNum2);
        System.out.println(testNum1 - testNum2);
        System.out.println(testNum1 * testNum2);
        System.out.println(testNum1 / testNum2);
        System.out.println(testNum1 % testNum2);

        //  Write a Java program that takes a number as input and prints its multiplication table upto 10.
        System.out.println("Entert a number: ");
        num1 = numInput.nextInt();
        for (int i = 0; i < 10; i++)
        {
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }

        //  Write a Java program to display the following pattern.
        //  Patter is the word JAVA using J a V a to form the letters.
        System.out.println("   J    a   v       v  a");
        System.out.println("   J   a a   v     v  a a");
        System.out.println("J  J  aaaaa   V   V  aaaaa");
        System.out.println(" JJ  a     a    V   a     a");
        //   Write a Java program to compute the specified expressions and print the output.
        double testData = ((25.5 * -3.5 * 3.5 * 3.53) / (40.5 - 4.5));
        System.out.println(testData);

        //  Write a Java program to compute a specified formula.
        //  Specified Formula :
        double specifiedFormula = 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11));
        System.out.println(specifiedFormula);

        //  Write a Java program to print the area and perimeter of a circle.
        //  Area = Pi*r^2
        //  Circumference = 2 * Pi* r
        double radius = 7.5;
        double circleArea = PI * radius * radius;
        double circleCircumference = 2 * PI * radius;
        System.out.println(circleArea);
        System.out.println(circleCircumference);

        //  Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
        System.out.println("Get an average number from three numbers.\nEnter First Number: ");
         num1 = numInput.nextInt();
         System.out.println("Enter Second Number: ");
         num2 = numInput.nextInt();
         System.out.println("Enter Third Number: ");
         num3 = numInput.nextInt();
         int avgerageNum = (num1 + num2 + num3) / 3;
        System.out.println("The Average Number for your input is: " + avgerageNum + ".");

        //  Write a Java program to print the area and perimeter of a rectangle.
        System.out.println("Enter length of rectangle: ");
        int length = numInput.nextInt();
        System.out.println("Enter width of rectangle: ");
        int width = numInput.nextInt();
        int areaOfRectangle = length * width;
        System.out.println("Area of rectangle is " + areaOfRectangle +".");
        int perimeterOfRectangle = 2 * (length + width);
        System.out.println("Perimeter of rectangle is " + perimeterOfRectangle + ".");
    }
}