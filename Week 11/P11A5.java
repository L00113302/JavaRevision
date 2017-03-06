import java.util.Scanner;
public class P11A5
{
public static void main(String[] args)
{
   Scanner kb = new Scanner (System.in); 
   double miles = 0.00, allowance = 0.00, expenses = 0.00, totalExpenses = 0.00;
   System.out.println ("Please enter the miles travelled: ");
   miles = kb.nextDouble();
   System.out.println ("Please enter the allowance: ");
   allowance = kb.nextDouble();
   calcExpenses (miles, allowance, expenses, totalExpenses);
}
   
   public static void calcExpenses(double miles, double allowance, double expenses, double totalExpenses)
   {
   expenses = miles * allowance;
   {
   System.out.println("Expenses: " +expenses);
   }
   
   if (miles >150)
   totalExpenses = expenses + 100;
   
   else 
   totalExpenses = expenses;
   {
   System.out.println ("Total Expenses: " +totalExpenses);      
   }
   
   }
}              