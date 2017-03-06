// Practical P10A2
// Mark Glenn
// 11/2014
// Program using a nested for loop to print stars
import java.util.*;
 
public class P10A2
{
   public static void main(String [] args)
   {
      Scanner keyIn = new Scanner (System.in);
      int n=0;
   
      do
      {
         System.out.print("How many stars do you want? ");
         n = keyIn.nextInt();
      
         for (int inner=0; inner<n; inner++)
         {
            System.out.print("*");
         }
         System.out.println();
      }while (n != 0);
         
   }
}
