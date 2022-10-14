package shapes;

public class ShapesTest
{
    public static void main(String[] args) {
        Rectangle box1;
        box1 = new Rectangle(4, 5);
    }
}

    /* Inheritance and Polymorphism Exercise Shapes.Rectangle, Shapes.Square, Shapes.ShapesTest */
//  TODO: Test your code by creating a new class, ShapesTest (also inside of shapes) with a main method. Inside the main method:
//  TODO: Create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5.
//  TODO: Verify that the getPerimeter and getArea methods return 18 and 20, respectively.
//  TODO: Create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//  TODO: Verify that the getPerimeter and getArea methods return 20 and 25, respectively.
//  TODO: In the Square class, override the getArea and getPerimeter methods with the following definitions for a square:
//  perimeter = 4 x side
//  area = side ^ 2
//  TODO: Re-run your ShapesTest class. How can you determine which getArea and getPerimeter methods are being called on each object?