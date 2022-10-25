package shapes;

public class Square extends Quadrilateral
{
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    void setLength(int length) {

    }

    @Override
    void setWidth(int width) {

    }
}

