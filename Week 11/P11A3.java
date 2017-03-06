import java.util.Scanner;
public class P11A3
{
public static void main(String[] args)
{
   Scanner kb = new Scanner (System.in);
   int num1, num2;
   System.out.println ("Please enter number 1: ");
   num1 = kb.nextInt();
   System.out.println ("Please enter number 2: ");
   num2 = kb.nextInt();
   displayNumbers (num1, num2);
}
   
   public static void displayNumbers(int num1, int num2)
   {
      for (int i=num1; i<=num2; i++ )
         System.out.println("Number: " +i +" ");
   }
}              