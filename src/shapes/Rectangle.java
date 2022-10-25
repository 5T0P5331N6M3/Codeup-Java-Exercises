package shapes;

public class Rectangle extends Quadrilateral implements Measurable
{

    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (width + length);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    void setLength(int length) {

    }

    @Override
    void setWidth(int width) {

    }
}
