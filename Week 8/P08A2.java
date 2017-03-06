// Practical P08A2
// Mark Glenn
// 25/09/2014
// Program to simulate a guessing game using random numbers
import java.util.*;
 
public class P08A2
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      // create random object
      Random noGenerator = new Random();
      
      // declare variable to store random number between 0 and 9
      int num=0, guess = 0, counter = 0;
      num = noGenerator.nextInt(100);
      num++;
   
      do
      {
         System.out.println("Please enter your guess: ");
         guess = keyboardIn.nextInt();
      
           
         if (guess > num)
         {
            System.out.println ("Too high");
            counter++;
         }
         
         else if (guess < num)
         {
            System.out.println ("Too low");
            counter++;
         }
      
      }while (num != guess);
       
      {
         System.out.println("That is the correct number! You have tried"  + counter +" times.");
      }
       
   } //end method
} //end class
      
      
