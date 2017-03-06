// Practical P09B4
// Mark Glenn
// 11/2014
// Program using a for loop to show total interest in bank account after 15yrs
import java.util.*;
 
public class P09B4
{
   public static void main(String [] args)
   {
        
      double interest=.10, account=20, totalInt;
      
        
      for (int count=1; count <=15; count++)
      {
           
         account = account+(account*interest/100);
         System.out.println("Money in account after year " +count +" is: " +account);
      }
      totalInt = account-20;
      System.out.println("Total interest earned: " +totalInt);
   }

}