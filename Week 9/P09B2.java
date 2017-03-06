// Practical P09B2
// Mark Glenn
// 11/2014
// Program using a for loop to show depreciation of vehicle
import java.util.*;
 
public class P09B2
{
   public static void main(String [] args)
   {
      int car=17000, dep=1500;
   
      for (int count=1; count <=10; count++)
      {  
         car = car - dep;
         System.out.println("Price after depreciation after year " +count +" is: " +car);
      }
   }

}