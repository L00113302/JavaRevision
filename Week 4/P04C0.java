// Practical P04C4
// Mark Glenn
// 25/09/2014
// Program determine if triangle is valid
 import java.util.Scanner;
 
 public class P04C0
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         double length1, length2, length3;
         
         System.out.print ("Please enter length1: ");
         length1 = keyboardIn.nextDouble();
         
         System.out.print ("Please enter length2: ");
         length2 = keyboardIn.nextDouble();
         
         System.out.print ("Please enter length3: ");
         length3 = keyboardIn.nextDouble();
                  
         // Do calculations
         if ((length1 + length2 > length3)||(length2+length3>length1)||(length3+length1>length2))
         {
         System.out.println ("Valid triangle.");
         }
         else
         {
         System.out.println ("Invalid triangle.");
         }
         }
      }   
