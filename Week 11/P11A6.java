import java.util.Scanner;
public class P11A6
{
public static void main(String[] args)
{
   Scanner kb = new Scanner (System.in); 
   int hoursWorked = 0;
   double rateOfpay = 0.00, wages = 0.00, overtime = 0.00, totalWages = 0.00;
   System.out.println ("Please enter the hours worked: ");
   hoursWorked = kb.nextInt();
   System.out.println ("Please enter the rate of pay: ");
   rateOfpay = kb.nextDouble();
   calcWages (hoursWorked, rateOfpay, wages, overtime, totalWages);
}
   
   public static void calcWages(int hoursWorked, double rateOfpay, double wages, double overtime, double totalWages)
   {
   
   if (hoursWorked <= 39)
   {
   wages = hoursWorked * rateOfpay;
   totalWages = wages;
   }
   
   else if (hoursWorked > 39)
   {
   wages = rateOfpay * 39;
   overtime = (hoursWorked - 39)* (rateOfpay/2 + rateOfpay);
   totalWages = wages + overtime;
   System.out.println ("Overtime Pay: " +overtime);
   }
  
   System.out.println ("Your total wages are: " +totalWages);
   
   }
}              