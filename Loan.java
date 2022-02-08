//import java.util.Calendar;
import java.util.Date;
//import java.text.SimpleDateFormat;
import java.time.Instant;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan(){
        this.loanDate = Date.from(Instant.now());
    }

    public Loan(double annualInteresRate, int numberOfYears, double loanAmount){
        this.annualInterestRate = annualInteresRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = Date.from(Instant.now());
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment(){
        return (loanAmount * (getAnnualInterestRate()/1200)) / (1 - (1/ java.lang.Math.pow(1+(annualInterestRate/1200),numberOfYears*12)));
    }

    public double getTotalPayment(){
        return getMonthlyPayment() * getNumberOfYears() * 12;
    }

}
