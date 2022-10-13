package shapes;
// How do I import Input class here?
import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input circleJerk = new Input();
        double userInput;
        userInput = circleJerk.getRadius();
        System.out.println(userInput);
        Circle circle = new Circle(userInput);
        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
