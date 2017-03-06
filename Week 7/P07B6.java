// Practical P07B6
// Mark Glenn
// 25/09/2014
// Program using a do/while loop and counter for mobile phone pin
import java.util.Scanner;
 
public class P07B6
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      int pin = 0, counter = 0;
      
     
      
      do
      {
      System.out.print ("Please enter the PIN number: ");
      pin = keyboardIn.nextInt();
      counter++;
      }
      
      while(pin != 1234);
      {
      System.out.println ("That is the correct pin. ");
      System.out.println ("Total number of times PIN entered: " +counter);
      }
      
                 
   } // end main method
}// end class 
