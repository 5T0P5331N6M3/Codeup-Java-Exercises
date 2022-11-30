package shapes;

public class Square extends Quadrilateral
{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter()
    {
     return width * 4;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    void setLength(int length) {}

    @Override
    void setWidth(int width) {}
}

