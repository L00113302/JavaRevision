// Practical P09A11
// Mark Glenn
// 11/2014
// Program using a for loop to display table of squares and cubes
import java.util.*;
 
public class P09A11
{
   public static void main(String [] args)
   {
   Scanner keyIn = new Scanner (System.in);
   
   int n=0; 

   {
   System.out.println("Please enter a number: ");
   n = keyIn.nextInt();
   System.out.println ("Number Square Cube");
   }
      for (int i=1;  i<= n; i++)
   {
   System.out.println(i +"\t" +i*i +"\t" +i*i*i);
   }

   }
}