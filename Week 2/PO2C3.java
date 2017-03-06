// Practical PO2C3
// Mark Glenn
// 25/09/2014
// Program toconvert temperature to faranheit to celcius
 import java.util.Scanner;
 
 public class PO2C3
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int farenheit, celsius;
         
         //Read information from user
         System.out.print ("Please enter the temperature in farenheit: ");
         farenheit = keyboardIn.nextInt();
         
         
         // do calculation
         celsius = 5 * (farenheit - 32) / 9;
         
         
         // display to screen
         System.out.println("The temperature in celsius is: " +celsius);
         
         
         }
      }   
