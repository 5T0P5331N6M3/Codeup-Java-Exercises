package shapes;

public class Square extends Rectangle {
    public Square(double perimeter, double area, double side) {
        super(side, side);
    }

    public double getPerimeter()
    {
        //  Perimeter = 4 x side;
        //  side = Rectangle's width;
        //  if side, then why P and A in constructor parm? Why not side
        return 4 * length;
    }

    public double getArea()
    {
        //  Area = side ^ 2;
        return Math.pow(width, 2);
    }
}

        /* Inheritance and Polymorphism Exercise */
//  TODO: Create a class named Square, also inside of shapes, extending Rectangle. Square should define a constructor accepting one argument, side, and calls the parent's constructor to set both the length and width to the value of side.
//  TODO: Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method:
//  TODO: Create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5.
//  TODO: Verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//  TODO: Create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//  TODO: Verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//  TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square:
//  perimeter = 4 x side
//  area = side ^ 2
//  TODO: Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?