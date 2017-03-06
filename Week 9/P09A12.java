// Practical P09A12
// Mark Glenn
// 11/2014
// Program using a for loop to calculate factorial of n
import java.util.*;
 
public class P09A12
{
   public static void main(String [] args)
   {
   Scanner keyIn = new Scanner (System.in);
   
   int n=0; 

   {
   System.out.println("Please enter a number: ");
   n = keyIn.nextInt();
   }
      for (int i=1;  i<= n; i++)
   {
     System.out.print(i*++i);
   }
   }

}