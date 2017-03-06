// Practical P10B4
// Mark Glenn
// 11/2014
// Program to generate two random numbers and ask user for the product
import java.util.*;
 
public class P10B4
{
   public static void main(String [] args)
   {
   Scanner keyIn = new Scanner (System.in);
    Random noGenerator = new Random();
    
    
   int product=0, num1=0, num2=0;
   
   num1 = noGenerator.nextInt(12);
   num2 = noGenerator.nextInt(12);
   {
   System.out.println ("Number 1: " +num1);
   System.out.println("Number 2: " +num2);
   }
   
   System.out.println("What is the product of number 1 and 2?");
   product = keyIn.nextInt();
   
    if ((num1*num2) != product)
    {
      for (int i=0; i<=3; i++)
      {
      System.out.println ("That is incorrect. Try again!");
      i++;
      }
    }

   
      
      if ((num1*num2) == product)
      {
      System.out.print("That is correct.");
      }
      
      
    
{
System.out.println ("Too many tries.");
}
   }
}   
