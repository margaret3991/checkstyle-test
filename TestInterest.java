// Margaret Lanphere, 10/16/17
// CS& 141 JAVA I
// Assignment #8

// This program will compute and display the expected returns of a savings plan over 25 years
// with the expected interest rate of 6.5% per year based on the user's input

//SAMPLE OUTPUT:
//****************************************************************************************** 
// Account Starting Value: $1000.0
// Annual Deposit Amount:  $500.0
// Interest Rate:           6.5%
//
//****************************************************************************************** 
// Year 1 Start: 1000.0 Interest: 65.0 Total: 1065.0
// Year 2 Start: 1565.0 Interest: 101.72500000000001 Total: 1666.725
// etc. 

import java.util.Scanner;
import java.math.*;

public class TestInterest
{
   public static final double INTEREST = 0.065;
   public static void main(String[] args)
   {
      int max_year = 25; //the number of years the table needs to display balances for 
      double interest_perc = INTEREST * 100; //the interest rate as a percent 
      
      //Prompting the User for Deposit Information
      Scanner input = new Scanner(System.in);
      System.out.println("What is your starting amount? :");
      double initial_dep = Double.parseDouble(args[0]);
      //double initial_dep = input.nextDouble(); 
      System.out.println("How much will you deposit annually? :");
      //double annual_dep = input.nextDouble();
      double annual_dep = Double.parseDouble(args[1]);
      
      printStar(90);  //creates line of stars as a border
      //Displaying Investment Details to the User
      System.out.println("Account Starting Value:" + "\t\t$" + initial_dep);
      System.out.println("Annual Deposit Amount: " + "\t\t$" + annual_dep);
      System.out.println("Interest Rate: " + "\t\t\t\t" + interest_perc + "%\n");
      
      printStar(90);
      printAccountBalTable(initial_dep, annual_dep, max_year); 
      printStar(90);
   }
   
   //This method will print a table of values for each year of investment
   public static void printAccountBalTable(double initial_bal, double annual_add, int year_max)
   {
      double start_bal= initial_bal; //initialized to user-specified initial balance and will give initial balance for each year
      double total_bal = start_bal;   //secondary balance variable for the end balance each year 
      double total_interest;        //variable to hold the accumulated interest 
      
      //This loop will run for the specified number of years of investment
      for (int i = 1; i <= year_max; i++)
      {  
         total_interest = start_bal * INTEREST; //calculating interest
         total_bal = total_interest + start_bal;  //finding the new account balance
         
         System.out.println("Year \t" + i + "\tStart: $" + round(start_bal, 2) + "\t\tInterest: $" + round(total_interest,2) + "\t\tTotal: $" + round(total_bal, 2));
         start_bal = total_bal + annual_add;  //adding the annual deposit at the end of the loop 
      }
   }
   //This method will create a line of stars of any length
   public static void printStar(int num)
   {
      for (int i = 1; i <= num; i++)
      {
         System.out.print("*");
      }
      System.out.println(" "); //to start new line 
   }
   
   public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    BigDecimal bd = BigDecimal.valueOf(value);
    bd = bd.setScale(places, RoundingMode.HALF_UP);
    return bd.doubleValue();
   }
}
