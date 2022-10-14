package shapes;

import java.util.Scanner;

public class Rectangle {

    public Rectangle() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of Rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter width of Rectangle:");
        double width = scanner.nextDouble();

    }

    public static double getArea()
    {
        //  Area = length x width;
        double area;
        area = length*width;
        return 0;
    }

    public static double getPerimeter()
    {

        return 0;
    }
}
//  TODO: Have protected properties for both length and width.
//  TODO: Define constructor accepting two numbers for length and width, and sets those properties.
//  TODO: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
        //  perimeter = 2 x length + 2 x width
        //  area = length x width
//  TODO: Create a class named Square, also inside of shapes, extending Rectangle. Square should define a constructor accepting one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//  TODO: Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method:
        //  TODO: Create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5.
        //  TODO: Verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        //  TODO: Create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        //  TODO: verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//  TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square:
        //  perimeter = 4 x side
        //  area = side ^ 2
        //  TODO: Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?