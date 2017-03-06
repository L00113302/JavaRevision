// Practical P10A4
// Mark Glenn
// 11/2014
// Program using a nested for loop to print stars in a square
import java.util.*;
 
public class P10A4
{
   public static void main(String [] args)
   {
      Scanner keyIn = new Scanner (System.in);
      int n=0;
   
   
      System.out.print("How many stars do you want? ");
      n = keyIn.nextInt();
      
      for (int inner=0; inner<n; inner++)
      {
         for (int outer=0; outer<n; outer++)
         {
            System.out.print("*");
         }
         System.out.println();
      }
   
            
         
   }
}
