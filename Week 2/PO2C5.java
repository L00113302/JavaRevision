// Practical PO2C5
// Mark Glenn
// 25/09/2014
// Program to convert weight frm ounces to stones, pounds & ounces
 import java.util.Scanner;
 
 public class PO2C5
   {
      public static void main(String [] args)
      {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
         int ounces, stone, pounds, ounce;
         
         //Read information from user
         System.out.print ("Please enter the weight in ounces: ");
         ounces = keyboardIn.nextInt();
         
         
         // do calculation
         stone = ounces / 14;
         pounds = stone % 14;
         ounce = pounds / 16;
         
         
         // display to screen
         System.out.println("The weight is: " +stone +"stone " +pounds +"pounds " +ounce +"ounce.");
         
         
         }
      }   
