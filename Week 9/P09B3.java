// Practical P09B3
// Mark Glenn
// 11/2014
// Program using a for loop to show depreciation of vehicle
import java.util.*;
 
public class P09B3
{
   public static void main(String [] args)
   {
    Scanner keyIn = new Scanner (System.in);
    
      int car=0, dep=0, n=0;
      
      System.out.println("Please enter the value of the car: ");
      car = keyIn.nextInt();
      System.out.println("Please enter the percentage rate of depreciation: ");
      dep = keyIn.nextInt();
      System.out.println("Please enter number of years: ");
      n = keyIn.nextInt();
      
   
      for (int count=1; count <=n; count++)
      {
           
         car = car-(car*dep/100);
         System.out.println("Price after depreciation after year " +count +" is: " +car);
      }
   }

}