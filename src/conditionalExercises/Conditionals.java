package conditionalExercises;

public class Conditionals
{
    public static void main(String[] args)
    {
        //  If character variable taxCode is ‘T’, increase price by adding the taxRate percentage of price to it.
        char taxCode = 'F';
        double price = 5;
        double taxRate = 5;
        if (taxCode == 'T')
        {
            System.out.println((price * taxRate) + price);
        }

        //  If integer variable opCode has the value 1, read in double values for X and Y and calculate and print their sum. 5
        int opCode = 1;
        double X = 5;
        double Y = 4;
        if (opCode == 1)
        {
            System.out.println(X + Y);
        }



        //  If integer variable currentNumber is odd, change its value so that it is now 3 times currentNumber plus 1, otherwise change its value so that it is now half of currentNumber (rounded down when currentNumber is odd).
        int currentNumber = 5;

        if (currentNumber % 2 == 0)
        {
            System.out.println(currentNumber / 2);
        } else
        {
            currentNumber = currentNumber + 1;
            System.out.println(currentNumber);
        }

        boolean leapYear;

        //  Assign true to the boolean variable leapYear if the integer variable year is a leap year. (A leap year is a multiple of 4, and if it is a multiple of 100, it must also be a multiple of 400.) – Assign a value to double variable cost depending on the value of integer variable distance as follows:
        //Distance 	Cost
        //0-100	        5.00
        //100-500	        8.00
        //500-1000	10.00
        //1000+	        12.00
//        if (leapYear )
    }
}
