package shapes;
import util.Input;
public class Circle {

    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        double area;
        area = Math.PI * (Math.pow(radius, 2));
        return area;
    }

    public double getCircumference()
    {
        double circum;
        circum = 2 * Math.PI * radius;
        return circum;
    }
}
