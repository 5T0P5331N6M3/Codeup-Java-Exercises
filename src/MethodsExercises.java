import java.util.Scanner;

public class MethodsExercises {
    // Addition

    public static void main(String[] args)
    {
//        System.out.println(addition(2, 3));
//        System.out.println(subtraction(4, 7));
//        System.out.println(multiplication(5, 9));
//        System.out.println(division(6, 9));
//        System.out.println(modulus(9, 4));
//        System.out.println(getInteger(1, 10));
        factorial();
    }

//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        String noMas = "";
//        int userInput = 0;
//        do {
//            System.out.print("Enter a number between 1 and 10: ");
//            userInput = scanner.nextInt();
//            if (userInput < min || userInput > max) {
//                System.out.println("You did not guess within the range.");
//            } else {
//                System.out.println("You guessed within the range.");
//                break;
//            }
//            System.out.println("Try again?");
//            noMas = scanner.next();
//        } while(noMas.equalsIgnoreCase("y") || noMas.equalsIgnoreCase("yes"));
//        return userInput;
//    }

    public static void factorial()
    {
        String continueOn = "";
        int userInput = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 10.");
        userInput = scanner.nextInt();
        System.out.println("Continue? (y/n)");
        continueOn = scanner.next();
        long nums = 1;
        for (int i = userInput; i <= userInput; i++) {
            System.out.printf("%d! = 1", i);
            for (int j = 2; j <= userInput; j++) {
                System.out.printf(" x %d", j);
                nums *= j;
            }
            System.out.printf("   = %d", nums);
        }
    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }
    // Subtraction
    public static int subtraction(int num1, int num2) {
        return num1 - num2;
    }
    // Multiplication
    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }
    // Division
    public static int division(int num1, int num2) {
        return num1 / num2;
    }
    public static int modulus(int num1, int num2) {
        return num1 % num2;
    }
}

/*
Exercises
Create a class named MethodsExercises.
Inside of your class, write code to create the specified methods.
Test your code by creating a main method and calling each of the methods you've created.

1. Basic Arithmetic

    a. Create four separate methods. Each will perform an arithmetic operation:

        Addition
        Subtraction
        Multiplication
        Division

    b. Each function needs to take two parameters/arguments so that the operation can be performed.

    c. Test your methods and verify the output.

    d. Add a modulus method that finds the modulus of two numbers.

    Food for thought: What happens if we try to divide by zero? What should happen?

Bonus

    a. Create your multiplication method without the * operator (Hint: a loop might be helpful).
    b. Do the above with recursion.

2.  Create a method validating user input is in a certain range, returning input as an integer
    if it is within the given range. If not, prompt the user to input their number again until
    the input is within range.

    The method signature should look like this:


    public static int getInteger(int min, int max);

    and is used like this:

        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);

    If the input is invalid, prompt the user again.
    Hint: recursion might be helpful here!

3.  Calculate the factorial of a number.

        Prompt the user to enter an integer from 1 to 10.
        Display the factorial of the number entered by the user.
        Ask if the user wants to continue.
        Use a for loop to calculate the factorial.
        Assume that the user will enter an integer, but verify it’s between 1 and 10.
        Use the long type to store the factorial.
        Continue only if the user agrees to.
        A factorial is a number multiplied by each of the numbers before it.
        Factorials are denoted by the exclamation point (n!). Ex:
                1! = 1               = 1
                2! = 1 x 2           = 2
                3! = 1 x 2 x 3       = 6
                4! = 1 x 2 x 3 x 4   = 24
Bonus

    Test the application and find the integer for the highest factorial that can be accurately
    calculated by this application, then modify the prompt so that it prompts the user for a
    number "from 1 to {the highest integer that returns accurate factorial calculation}".
    Don’t forget to change your verification too!

    Use recursion to implement the factorial.

4.  Create an application that simulates dice rolling.

        Ask the user to enter the number of sides for a pair of dice.
        Prompt the user to roll the dice.
        "Roll" two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
        Use static methods to implement the method(s) that generate the random numbers.
        Use the .random method of the java.lang.Math class to generate random numbers.

5.  Game Development 101

    Welcome to the world of game development!

    You are going to build a high-low guessing game. Create a class named HighLow inside of src.

    The specs for the game are:

        Game picks a random number between 1 and 100.
        Prompts user to guess the number.
        All user inputs are validated.
        If user's guess is less than the number, it outputs "HIGHER".
        If user's guess is more than the number, it outputs "LOWER".
        If a user guesses the number, the game should declare "GOOD GUESS!"

Hints
    Use the random method of the java.lang.Math class to generate a random number.
Bonus
    Keep track of how many guesses a user makes.
    Set an upper limit on the number of guesses.
*/