// Practical PO5A4
// Mark Glenn
// 25/09/2014
// Program to determine seasons using switch statement
 import java.util.Scanner;
 
 public class P05A4
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int months;
         
         //Read information from user
         System.out.print ("Please enter the month: ");
         months = keyboardIn.nextInt();
         
         switch (months)
         {
            case 2: // sharing cases
            case 3: 
            case 4: System.out.print ("It is Spring.");
               break;
            
            case 5:
            case 6:
            case 7: System.out.print ("It is Summer.");
               break;
            
            case 8:
            case 9:
            case 10: System.out.print ("It is Autumn.");
               break;
            
            case 11:
            case 12:
            case 1: System.out.print ("It is Winter.");
                         
             }// end switch
         
         
         } // end main method
      }// end class 
