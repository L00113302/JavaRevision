import java.util.Scanner;
public class LargestTester
{

   public static void main (String[] args)
   {
      Scanner keyIn = new Scanner (System.in);
      int largest;
      int first, second;
      System.out.print ("Type in first number ");
      first = keyIn.nextInt();
      System.out.print ("Type in second number ");
      second = keyIn.nextInt();
      // method call
      largest = max (first, second);
      System.out.println ("The number is " +largest);
   }
   // method to return largest number
   public static int max (int num1, int num2)
   {
      if (num1 > num2)
         return num1;
      else
         return num2;
      }
}            
  