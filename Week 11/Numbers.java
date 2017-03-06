import java.util.Scanner;
public class Numbers
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner (System.in);
      int number1, number2;
      System.out.print ("Input number 1: ");
      number1 = kb.nextInt();
      System.out.print ("Unput number2: ");
      number2 = kb.nextInt();
      printSmallest (number1, number2);
   } // End main method
   
   public static void printSmallest (int num1, int num2)
   {
      if (num1 < num2)
         System.out.print ("Smallest is: " +num1);
      else 
         System.out.print ("Smallest is: "+num2);
   }
}               