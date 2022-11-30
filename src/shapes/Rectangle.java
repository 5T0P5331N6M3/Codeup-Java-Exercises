package shapes;

public class Rectangle extends Quadrilateral implements Measurable
{
    public Rectangle(int length, int width)
    {
        super(length, width);
    }

    @Override
    public void setLength(int length)
    {
        this.length = length;
    }

    @Override
    public void setWidth(int width)
    {
        this.width = width;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * this.getLength() + 2 * this.getWidth();
    }

    @Override
    public double getArea()
    {
        return this.getLength() * this.getWidth();
    }
//    public Rectangle(int length, int width) {
//        super(length, width);
//    }
//
//    @Override
//    public double getPerimeter()
//    {
//        return 2 * (width + length);
//    }
//
//    @Override
//    public double getArea() {
//        return width * length;
//    }
//
//    @Override
//    void setLength(int length) {}
//
//    @Override
//    void setWidth(int width) {}
}
