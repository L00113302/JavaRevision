// Practical P04D
// Mark Glenn
// 25/09/2014
// Program to determine richtar scale value
 import java.util.Scanner;
 
 public class P04D
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double value;
         
         System.out.print ("Please enter the Ricntar scale value: ");
         value = keyboardIn.nextDouble();
         
         // Do calculations
         
         if (value < 4.0)
            {
            System.out.println ("The effect is little.");
            }
         
         else if (value >= 4.0 && value <= 4.9)
            {
            System.out.println ("The effect is windows shake.");
            }
         
         else if (value >= 5.0 && value <= 5.9)
            {
            System.out.println ("The effect is walls crack; poorly built windows are destroyed.");
            }
         
         else if (value >= 6.0 && value <= 6.9)
            {
            System.out.println ("The effect is chimneys tumble, some buildings are destroyed.");
            }                
         
         else if (value >= 7.0 && value <= 7.9)
            {
            System.out.println ("The effect is well built buildings are damaged.");
            }
            
         else if (value > 7.9)
            {
            System.out.println ("The effect is most buildings are destroyed.");
            }
       
                 
         } // end main method
      }// end class 
