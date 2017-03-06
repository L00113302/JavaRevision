// Practical PO5C1
// Mark Glenn
// program to display christmas bonus

// Get Salary
// Get Sales
// Get Attendance
// Calculate bonus
// if sales < 6000 && attendance >6 && <=20 bonus = salary * 0.04
// else if sales >= 6000 bonus = (bonus + 200)
// else if attendance >=2 && attendance <= 6 bonus = salary * 0.14
// else if attendance <=2 bonus = salary * 0.24
// else if attendance > 20 "No bonus"
// display bonus

import java.util.Scanner;

public class P05C1
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      double salary, sales, bonus;
      int attendance;
      bonus = 0;
         
      System.out.print ("Please enter the salary: ");
      salary = keyboardIn.nextDouble();
         
      System.out.print ("Please enter the sales: ");
      sales = keyboardIn.nextDouble();
         
      System.out.print ("Please enter the attendance: ");
      attendance = keyboardIn.nextInt();
         
         
         // Do calculations
      if (attendance >20)
      {
         System.out.println ("NO BONUS");
      }
           
      if (sales < 6000 && attendance >6 && attendance <= 20)
      {
         bonus = (salary * 0.04);
      }
      else if (sales >= 6000 && attendance >6 && attendance <=20)
      {
         bonus = (salary * 0.04) + 200;              
      }
      else if (attendance <=2)
      {
         bonus = (salary * 0.24);
      }
    
         
      System.out.println ("Your Christmas Bonus is: " +bonus);
                 
   } // end main method
}// end class 
