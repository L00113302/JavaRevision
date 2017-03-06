// Practical P09B5
// Mark Glenn
// 11/2014
// Program using a for loop to show total investment of two plans
import java.util.*;
 
public class P09B5
{
   public static void main(String [] args)
   {
     Scanner keyIn = new Scanner (System.in);
     
      double initialAmount=0;
      double planA=0, planB=0;
      
      System.out.println ("Please enter the sum of money:");
      initialAmount = keyIn.nextDouble();
      
      //set starting balnces for plan A and B
      planA=initialAmount;
      planB=initialAmount;
      
        
      for (int i=1; i<=100; i++)
      {
         if (planB > planA)
         {
         System.out.println("Plan B ecceeds Plan A after " +i+ " years." );
         break;
         }
         
         System.out.println("The value of money in Plan A after year " +i+ " is " +planA);
         planA = planA + (initialAmount * .1);
         
         System.out.println("The value of money in Plan B after year " +i+ " is " +planB);
         planB = planB + (planB * .05);
         
         System.out.println();
         }
   }

}