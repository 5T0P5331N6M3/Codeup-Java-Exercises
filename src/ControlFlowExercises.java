import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // While Loop
//        int i = 5;
//        while(i <= 15) {
//            System.out.println(i);
//            i++;
//        }
        // Do While Loop
//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);
//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i > -15 );
//           long i = 2;
//           do {
//               System.out.println(i);
//               i *= i;
//           } while(i < 1000000);
        // For Loop
//        for(int i = 5; i <= 15; i ++) {
//            System.out.println(i);
//        }
//        for(int i = 0; i <= 100; i += 2) {
//            System.out.println(i);
//        }
//        for(int i = 100; i > -15; i -= 5) {
//            System.out.println(i);
//        }
//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }
        // FIZZBUZZ
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//        for (int i = 1; i <= 100; i *= 3) {
//            System.out.println("Fizz");
//        }
//        for (int i = 1; i <= 100; i *= 5) {
//            System.out.println("Buzz");
//        }
//
//        for (int i = 1; i <= 100; i *= 3) {
//                for (int j = 5; j <= 100; j *= 5) {
//                    System.out.println("Fizz" + "Buzz");
//                }
//            }
        // Course Instruction did not make it clear how this exercise ought result. I first wrote nested for loops (above) based on course instruction.
            // FIZZBUZZ the correct way!
//        for (int num = 1; num <= 100; num++) {
//            if (num % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (num % 5 == 0) {
//                System.out.println("Buzz");
//            } else if (num % 3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println(num);
//            }
//        }
        Scanner scanner = new Scanner(System.in);
//// Prompt user for an integer
//        System.out.println("What number would you like to go up to?");
//        int userInput = scanner.nextInt();
//        System.out.println(userInput);
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------  | ------");
//        for (int i = 1; i <= userInput; i++) {
//            System.out.printf("%d      | %d       | %d     %n", i, i * i, i * i * i);
//        }
        String gradeSubmissions = "";
        do {
            System.out.println("What is the numerical grade?");
            int gradeInput = scanner.nextInt();
            if (gradeInput >= 88) {
                System.out.println(gradeInput + " is an A.");
            } else if (gradeInput >= 80 && gradeInput <= 87) {
                System.out.println(gradeInput + " is an B.");
            } else if (gradeInput >= 67 && gradeInput <= 79) {
                System.out.println(gradeInput + " is an C.");
            } else if (gradeInput >= 60 && gradeInput <= 66) {
                System.out.println(gradeInput + " is an D.");
            } else {
                System.out.println(gradeInput + " is an F.");
            }
            System.out.println("Continue entering grades?");
            gradeSubmissions = scanner.next();
        } while (gradeSubmissions.equalsIgnoreCase("y") || gradeSubmissions.equalsIgnoreCase("yes"));
    }

}

/* For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

   1. Loop Basics
*   a. While
*       Create an integer variable i with a value of 5.
*       Create a while loop that runs so long as i is less than or equal to 15
*       Each loop iteration, output the current value of i, then increment i by one.
*       Output should look like this:
*       5 6 7 8 9 10 11 12 13 14 15
*
*   b. Do While
*       Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        Alter your loop to count backwards by 5's from 100 to -10.
        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        * 2
        * 4
        * 16
        * 256
        * 65536

    c. For
        Refactor the previous two exercises to use a for loop instead.

 * 2. Fizzbuzz
 * One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

        Write a program that prints the numbers from 1 to 100.
        For multiples of three: print “Fizz” instead of the number.
        For the multiples of five: print “Buzz”.
        For numbers which are multiples of both three and five: print “FizzBuzz”.

 * 3. Display a table of powers.

        Prompt the user to enter an integer.
        Display a table of squares and cubes from 1 to the value entered.
        Ask if the user wants to continue.
        Assume that the user will enter valid data.
        Only continue if the user agrees to.
        Example Output:
                * What number would you like to go up to? 5
                    Here is your table!

                    number | squared | cubed
                    ------ | ------- | -----
                    1      | 1       | 1
                    2      | 4       | 8
                    3      | 9       | 27
                    4      | 16      | 64
                    5      | 25      | 125

  * 4. Convert given number grades into letter grades.
  * Prompt the user for a numerical grade from 0 to 100.
        Display the corresponding letter grade.
        Prompt the user to continue.
        Assume that the user will enter valid integers for the grades.
        The application should only continue if the user agrees to.
            Grade Ranges:

                A : 100 - 88
                B : 87 - 80
                C : 79 - 67
                D : 66 - 60
                F : 59 - 0

BONUS: Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).
*/