// Practical P05B1
// Mark Glenn
// 25/09/2014
// Program calculate time zones using conditional operator
 import java.util.Scanner;
 
 public class P05B1
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double time, nyTime=0, sfTime=0, sidneyTime=0;
         
         System.out.print ("Please enter Ireland time in 24hr format: ");
         time = keyboardIn.nextDouble();
         
         // Do calculations
         if (time >= 00.00 && time <= 24.00)
         {
         nyTime = time - 5;
         sfTime = time - 8; 
         sidneyTime = time + 10;
         }
         
         else
         System.out.println ("Invalid time.");
                        
         System.out.print ("The time in New York is: ");
         System.out.println (nyTime <10? "0" +nyTime: +nyTime);
         System.out.print("The time in San Francisco is: ");
         System.out.println (sfTime <10? "0" +sfTime : +sfTime);
         System.out.print("The time in Sidney is: ");
         System.out.println (sidneyTime <10? "0" +sidneyTime : +sidneyTime);

         } // end main method
      }// end class 
