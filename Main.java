import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        //create new scanner obj
        Scanner scanner = new Scanner(System.in);
        //create new loan obj
        Loan loan = new Loan();

        //get input for interest rate
        System.out.println("Enter annual interest rate, for example, 8.25: ");
        loan.setAnnualInterestRate(scanner.nextDouble());

        //get input for number of years
        System.out.println("Enter number of years as an integer: ");
        loan.setNumberOfYears(scanner.nextInt());

        //get input for loan amount
        System.out.println("Enter loan amount, for exmple, 120000.95: ");
        loan.setLoanAmount(scanner.nextDouble());
        scanner.close();

        //print out the values
        System.out.println("The loan was created on " + loan.getLoanDate());
        System.out.println("The monthly payment is " + String.format("%.2f",loan.getMonthlyPayment()));
        System.out.println("The total pyament is " + String.format("%.2f",loan.getTotalPayment()));
    }
}
