package util;

import java.util.Scanner;

public class Input {

//    private String scanner;
    // When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class.
    public String showScanner() {
        return "";
//        return scanner;
        // How do I make this Class'scanner private, and shared with other packages?
    }
    private static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the radius of the circle? ");
    }
//    String getString;
}
