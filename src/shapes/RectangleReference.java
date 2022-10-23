package shapes;

public class RectangleReference
{
    protected double length;
    protected double width;

    public RectangleReference(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        //  Area = length x width;
        return length * width;
    }

    public double getPerimeter()
    {
        //  Perimeter = 2 x length + 2 x width;
        return 2 * length + 2 * width;
    }
}
    /* Inheritance and Polymorphism Exercise Shapes.Rectangle, Shapes.Square, Shapes.ShapesTest */
//  TODO: Have protected properties for both length and width.
//  TODO: Define constructor accepting two numbers for length and width, and sets those properties.
//  TODO: Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values. The formulas for both follow:
        //  perimeter = 2 x length + 2 x width
        //  area = length x width
