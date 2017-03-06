import java.util.Scanner;
public class CalculatorTest{

   public static void main (String [] args)
   
   {
      Scanner kb = new Scanner(System.in);
      int answer;
      int first, second;
      char operator;
      System.out.println ("Type in first number: ");
      first = kb.nextInt();
      System.out.println ("Type in second number: ");
      second = kb.nextInt();
   // method call   
      answer = calculate ('+', first, second);
      System.out.println ("The answer is: " +answer);
   }
   // method to add numbers
public static int calculate (char op, int num1, int num2)
{
   if (op == '+')
      return num1 + num2;
   else
      return 0;
   }
}               