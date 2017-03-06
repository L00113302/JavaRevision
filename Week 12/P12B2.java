import java.util.Scanner;
public class P12B2{

   public static void main (String [] args)
   
   {
      Scanner kb = new Scanner(System.in);
      int answer = 0;
      int first=0, second=0;
      char operator = ' ';
      
      
      System.out.println ("Type in first number: ");
      first = kb.nextInt();
      System.out.println ("Type in second number: ");
      second = kb.nextInt();
      System.out.println ("Please enter which operator you would like: ");
      operator = kb.next().charAt(0);
      
         if (operator != '+' && operator != '-' && operator != '*' && operator != '/' && operator != '%');
         {
         System.out.println ("Please enter a valid operator! ");
         }

   // method call   
      answer = calculate (operator, first, second, answer);
      System.out.println ("The answer is: " +answer);
   }
   // method to add numbers
   public static int calculate (char op, int num1, int num2, int answer)
   {
      switch (op)
      {
         case '+':
            answer = num1 + num2;
            break;
      
         case '-':
            answer = num1 - num2;
            break;
      
         case '*':
            answer = num1 * num2;
            break;
      
         case '/':
            answer = num1 / num2;
            break;
      
         case '%':
            answer = num1 % num2;
            break;
      } 
      return answer;
   }
   
}     

