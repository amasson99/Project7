/**
 * Mortgage.java (MODEL)
 * Used to define a Mortgage object consisting of an annual interest rate,
 * the number of years for the loan and the loan amount. Contains methods to
 * calculate the monthly loan payment and the total amount paid.
 *
 * NO I/O is done in this class...no printlns or nextLines
*/
import java.util.*;
import java.text.*;

public class Mortgage
{
  private double annualInterestRate;
  private int numOfYears;
  private double loanAmount;
  private double monthlyPayment;
  private double totalPayment;

  // Default constructor - sets a 100,000 loan at 5.5% for 15 years
  // Used for Advertised Promotion
  public Mortgage()
  {
	  loanAmount = 100000;
    numOfYears = 15;
    annualInterestRate = 5.5;
  } // end Mortgage() constructor

  // Construct a mortgage with specified annual interest rate,
  // number of years and loan amount
  public Mortgage(double newInterestRate, int newNumOfYears, double newLoanAmount)
  {
    annualInterestRate = newInterestRate;
    numOfYears = newNumOfYears;
    loanAmount = newLoanAmount;
  } // end 3-argument constructor

// ------------------ Monthly Payment ---------------------
  // returns the value for the private data property monthlyPayment
  // currently not used...
  public double getMonthlyPayment()
  {
    return monthlyPayment;
  } // end getMonthlyPayment

  // Calculate and set the monthly payment for the loan
  public void setMonthlyPayment()
  {
    double monthlyRate = 0;
    int months =  numOfYears * 12;
    double interest = annualInterestRate/100.0;
    monthlyRate = interest/ 12.0;
    monthlyPayment = (loanAmount*monthlyRate) / (1-Math.pow(1+monthlyRate, -months));
  } // end setMonthlyPayment

// ------------------ Total Payment ---------------------
  // returns the value for the private data property totalPayment
  // currently not used...
  public double getTotalPayment()
  {
    return totalPayment;
  } // end getMonthlyPayment

  // Calculate and set the total amount to be paid on the loan
  public void setTotalPayment()
  {
    int months = numOfYears*12;
    totalPayment = months * monthlyPayment;
  } // end totalPayment

// ------------------ Used to Display Output ---------------------
  public String toString()
  {
    return "The monthly payment is $" + this.getMonthlyPayment() + "\nThe total Payment is " + this.getTotalPayment();
  } // end toString

} // end class
