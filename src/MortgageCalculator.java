import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator
{
    public static void main(String[] args) {
        //  Need Constants representing 100 and 12:
        final byte percentage = 100;
        final byte monthsInYear = 12;

        Scanner scanner = new Scanner(System.in);

        int principal = 0;
        double annualInterestRate = 0;
        int periodInYears = 0;


        //  Principal
        System.out.print("Principal: ");
        principal = scanner.nextInt();
        //  APR
        System.out.print("Annual Interest Rate: ");
        annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / percentage / monthsInYear;
        //  Years
        System.out.print("Period (Years): ");
        periodInYears = scanner.nextInt();
        //  Monthly Payment
        int numberOfPayments = periodInYears * monthsInYear;
        double mathPower = Math.pow(1 + monthlyInterestRate, numberOfPayments);
        double monthlyPayment = principal * (monthlyInterestRate * mathPower / (mathPower - 1));
        String monthlyPaymentFormatted = NumberFormat.getCurrencyInstance().format(monthlyPayment);
        System.out.print("Mortgage: " + monthlyPaymentFormatted);
        monthlyPaymentFormatted = scanner.next();

    }
}
