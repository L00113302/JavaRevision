// Practical P10B2
// Mark Glenn
// 11/2014
// Program using a nested for loop to print stars to print various patterns
import java.util.*;
 
public class P10B2
{
   public static void main(String [] args)
   {
     int stars=1;
      for (int inner=0; inner<5; inner++)
      {
         for (int outer=0; outer<stars; outer++)
         {
            System.out.print("*");
         }
         System.out.println();
         stars++;
      }
      
      System.out.println();
     
      
      int stars2 = 5;
         for (int inner=1; inner<=7; inner++)
         {
            for (int outer=1; outer<=stars2; outer++)
            {
               System.out.print("*");
            }
            System.out.println();
            stars2--;
          }
          
      int stars3 = 1;
         for (int inner=0; inner
   
            
         
   }
}
