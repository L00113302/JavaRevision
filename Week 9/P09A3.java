// Practical P09A3
// Mark Glenn
// 11/2014
// Program using a for loop asking user to enter value n
import java.util.*;
 
public class P09A3
{
   public static void main(String [] args)
   {
   Scanner keyIn = new Scanner (System.in);
   
   int n;
   {
   System.out.println("Please enter the value: ");
   n = keyIn.nextInt();
   }
      for (int count=1; count <= n; count ++)
         System.out.print("*");
   }

}