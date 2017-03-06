// Practical PO2C6
// Mark Glenn
// 25/09/2014
// Program to calculate and display monthly pay
 import java.util.Scanner;
 
 public class PO2C6
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         String name;
         double hoursWorked, ratePerHr, monthlyPay, tax, usc, prsi, totalDeds, netPay;
         
         
         //Read information from user
         System.out.print ("Please enter name of employee: ");
         name = keyboardIn.nextLine();
         
         System.out.print ("Please enter hours worked: ");
         hoursWorked = keyboardIn.nextDouble();
         
         System.out.print ("Please enter rate per hour: ");
         ratePerHr = keyboardIn.nextDouble();
         
         
         // do calculation
         monthlyPay = hoursWorked * ratePerHr;
         tax = monthlyPay * 0.40;
         prsi = monthlyPay * 0.05;
         usc = monthlyPay * 0.02;
         totalDeds = tax + prsi + usc;
         netPay = monthlyPay - totalDeds;
         
         
         
         
         // display to screen
         System.out.println("****************************************************************");
         System.out.println("                      Joe Bloggs                              ");
         System.out.println("****************************************************************");
         System.out.println("Hours: " +hoursWorked +"          " +"Rate: " +ratePerHr +"                 " +"Gross Pay: " +monthlyPay);
         System.out.println("LESS DEDUCTIONS: ");
         System.out.println("Tax: " +tax +"       " +"USC: " +usc +"     " +"PRSI: " +prsi +" " +"Total Deductions: " +totalDeds);
         System.out.println("                                                 " +"NET PAY: " +netPay);
         System.out.println("****************************************************************");
         
         
         }
      }   
