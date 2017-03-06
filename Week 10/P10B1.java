// Practical P10B1
// Mark Glenn
// 11/2014
// Program to find sum and average of numbers
import java.util.*;
 
public class P10B1
{
   public static void main(String [] args)
   {
      Scanner keyIn = new Scanner (System.in);
   
      int sum = 0, average = 0,counter = 0, num1, num2;
   
      do
      {
         System.out.println ("Please enter number 1: ");
         num1 = keyIn.nextInt();
         System.out.println("Please enter number 2: ");
         num2 = keyIn.nextInt();
      
         if (num1 >= num2)
         {
            System.out.println("Please enter value greater for number 2!");
         }
         
         else
         {
            for (int i=num1; i<=num2; i++)
            {
               sum = sum + i;
               counter++;
               average = sum/counter;
            
            }
         
            System.out.println ("The average of the numbers is: " +average);
            System.out.println("The sum of the numbers is: " +sum);
         }
      
      }while (num2 > num1);
   
   }
}