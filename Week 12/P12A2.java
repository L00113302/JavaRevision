import java.util.Scanner;
public class P12A2
{

   public static void main (String[] args)
   {
      Scanner keyIn = new Scanner (System.in);
      int smallest;
      int first, second, third;
      System.out.print ("Type in first number ");
      first = keyIn.nextInt();
      System.out.print ("Type in second number ");
      second = keyIn.nextInt();
      System.out.print ("Type in third number ");
      third = keyIn.nextInt();
      
      // method call
      smallest = min (first, second, third);
      System.out.println ("The number is " +smallest);
   }
   // method to return largest number
   public static int min (int num1, int num2, int num3)
      {
      if (num1 < num2 && num1 < num3)
         return num1;
      else if (num2 < num1 && num2 < num3)
         return num2;
      else
         return num3;   
      }
}            
  