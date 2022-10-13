package util;

public class InputTest {
    public static void main(String[] args) {
        Input found = new Input();
        System.out.println(found.getInt());
        System.out.println(found.getDouble());
//        System.out.println(found.getString());
        System.out.println(found.getDouble());
        System.out.println(found.getInt());
        System.out.println(found.yesNo("In the Army?"));
    }
}
