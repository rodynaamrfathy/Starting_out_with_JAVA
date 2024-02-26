import java.util.Scanner;
import java.text.NumberFormat;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner principalScanner = new Scanner(System.in);
        System.out.print("Principal: ");
        long principalAmount = principalScanner.nextLong();

        Scanner airScanner = new Scanner(System.in);
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = airScanner.nextDouble();

        Scanner periodScanner = new Scanner(System.in);
        System.out.print("Period (Years): ");
        int years = periodScanner.nextByte();

        double mortgageAmount = (annualInterestRate * Math.pow(1 + annualInterestRate, years))
                                / (Math.pow(1 + annualInterestRate, years) - 1);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(mortgageAmount);
        System.out.println("Mortgage: " + result);
    }
}
