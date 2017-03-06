// Practical P07B7
// Mark Glenn
// 25/09/2014
// Program using a do/while loop and counter for mobile phone pin with 3 chances
import java.util.Scanner;
 
public class P07B7
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
      while(pin != 1234 && counter <3);
      
       if (counter >= 3)
       {
       System.out.println ("PIN entered incorrectly three times. ");
       }
      
       else if (pin == 1234)
       {
       System.out.println ("That is the correct PIN. ");
       }
           
                 
   } // end main method
}// end class 
