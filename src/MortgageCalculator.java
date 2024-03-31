import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get loan amount
        System.out.print("Enter loan amount: ");
        double loanAmount = scanner.nextDouble();

        // Get annual interest rate
        System.out.print("Enter annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Get loan term in years
        System.out.print("Enter loan term (in years): ");
        int loanTermYears = scanner.nextInt();

        // Convert annual interest rate to monthly interest rate
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Convert loan term to months
        int loanTermMonths = loanTermYears * 12;

        // Calculate monthly mortgage payment
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermMonths));

        // Display the monthly mortgage payment
        System.out.printf("Monthly mortgage payment: $%.2f%n", monthlyPayment);

        scanner.close();
    }
}