// Practical P10B3
// Mark Glenn
// 11/2014
// Program using a flag to determine prime number
import java.util.*;
 
public class P10B3
{
   public static void main(String [] args)
   {
   Scanner keyIn = new Scanner (System.in);
   
   int num;
   boolean prime = true;
  
   {
   System.out.println ("Please enter a number: ");
   num = keyIn.nextInt();
   }
   
   for(int i = 2; i <= num-1; i++)
   {
      if (num%2==0)
         prime = false;
   }
       
   if ((prime) && (num!=0))
     {
     System.out.println("That is a prime number.");
     }
   else
   {
   System.out.println("That is not a prime number.");
   }      
   
 
   }
}


