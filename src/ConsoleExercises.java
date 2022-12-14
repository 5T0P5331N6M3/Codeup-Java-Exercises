import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

//        System.out.println();
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter an integer: ");
//        int num = scanner.nextInt();
//
//        System.out.println("Enter three words: ");
//        String string1 = scanner.next();
//        String string2 = scanner.next();
//        String string3 = scanner.next();
//        System.out.printf("%s%n%s%n%s%n", string1, string2, string3);

        System.out.println("Write a sentence: ");
        String userInput = scanner.nextLine();
        System.out.println(userInput);

//        System.out.println("Enter the length of The Classroom: ");
//        String userLength = scanner.nextLine();
//        int length = Integer.parseInt(userLength);
//        System.out.println("Enter the width of The Classroom: ");
//        String userWidth = scanner.nextLine();
//        int width = Integer.parseInt(userWidth);
//        int perimeter = 2 * (length + width);
////        int perimeter = ((length + length) * (width + width));
//        int area = (length * width);
//        System.out.println("Length: " + userLength);
//        System.out.println("Width: " + userWidth);
//        System.out.println(perimeter);
//        System.out.println(area);
    }

}
/* Exercises
* 1. Copy this code into your main method:
Copied to clipboard
double pi = 3.14159;
Write some Java code that uses the variable pi to output the following:
Copied to clipboard
The value of pi is approximately 3.14.
Don't change the value of the variable; instead, reference one of the links above and use System.out.format to accomplish this.
* Exploring the Scanner Class
*  1. Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
What happens if you input something that is not an integer?
*  2. Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
What happens if you enter less than 3 words?
What happens if you enter more than 3 words?
*  3. Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user.
do you capture all the words?
*  4. Rewrite the above example using the nextLine method.
* Calculate the perimeter and area of Codeup's classrooms
* 1. Prompt the user to enter values of length and width of a classroom at Codeup (or your room if virtual).
Use the nextLine method each time you need to get user input. In this case, we need it twice, once to get the user input for the length and again to get the user input for the width. Parse the resulting strings to a numeric type.
Assume that the rooms are perfect rectangles.
Assume that the user will enter valid numeric data for length and width.
* 2. Display the area and perimeter of that classroom.
The area of a rectangle is equal to the length times the width, and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.
* Bonuses
In your perimeter/area calculator: - Accept decimal entries. - Calculate the volume of the rooms in addition to the area and perimeter.

The Scanner class can be told specifically what characters or pattern separates tokens in a piece of input with the useDelimiter method. Add the following line of code to your application after you have created a scanner (assuming the variable holding the Scanner is named scanner):


scanner.useDelimiter("\n");
How does this change the way your program operates?

Rewrite your classroom program to use nextInt method. If you added the line of code above to your application, you should now have no trouble handling multiple pieces of user input.
* */