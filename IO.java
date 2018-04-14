// VIEW - Handles I/O only
// Validates data and returns values
// No calculations or data manipulation within the object
import java.util.*;
public class IO {
 private Scanner in;

 public IO() {
	in = new Scanner(System.in);
}


// Displays the menu
public void displayMenu() {
  System.out.println("Please choose from the following choices below:");
  System.out.println("\t1) Promotional Loan ($150,000 @ 3.95% for 25 years) ");
  System.out.println("\t2) Unique Loan (Enter in loan values) ");
  System.out.println("\t3) Quit (Exit the Program) ");
  System.out.println(" ");
} // end displayMenu

// input - get and validate a menu choice
public int getMenuChoice() {
  System.out.print("\tPlease enter your selection(1-3): ");
        int choice = in.nextInt();
        while(choice != 1 && choice != 2 && choice != 3){
          System.out.print("\n\tNot a valid choice: ");
          System.out.print("\n\tPlease enter your selection(1-3): ");
                choice = in.nextInt();
        }

        if(choice == 1){
          return 1;
        }
        if(choice == 2){
          return 2;
        }
        if(choice == 3){
          System.out.println("PROGRAM COMPLETE");
          return 3;
        }
        return 0;
}

// Read in and validate interest rate
 public double getRate(int choice) {
   if(choice == 1){
     return 5.5;
   }
   if(choice == 2){
     System.out.print("Please enter the rate: ");
     return in.nextDouble();
   }
   return 0;
} // end getRate

// Read in and validate term of the loan (in years)
 public int getTerm(int choice) 	{
   if(choice == 1){
     return 15;
   }
   if(choice == 2){
     System.out.print("Please enter the years: ");
     return in.nextInt();
   }
   return 0;
} // end getTerm

// Read in and validate loan amount
 public double getAmount(int choice) {
   if(choice == 1){
     return 100000;
   }
   if(choice == 2){
     System.out.print("Please enter the amount: ");
     return in.nextDouble();
   }
   return 0;
} // end getAmount

// ------------- Used to Display Loan Output ----------------
public void displayString(String msg) {
    System.out.println(msg);
 }
} // end IO class
