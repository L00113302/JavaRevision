// Practical PO5B4
// Mark Glenn
// 25/09/2014
// Program to calculate commission using switch statement
import java.util.Scanner;
 
public class P05B4
{
   public static void main(String [] args)
   {
      Scanner keyboardIn = new Scanner(System.in);
      
         // declare variables
      int code;
      double sales, commission;
      commission = 0;
      
         
         //Read information from user
      System.out.print ("Please enter the code: ");
      code = keyboardIn.nextInt();
         
      System.out.print ("Please enter the sales: ");
      sales = keyboardIn.nextDouble();
         
      switch (code)
      {
         case 1: commission = (sales * 0.05);
            System.out.print ("The commission earned is: " +commission);
            break;
         case 2:commission = (sales * 0.20);
            System.out.print ("The commision earned is:" +commission);
            break;
         case 3: commission = (sales * 0.10);
            System.out.print ("The commission earned is: " + commission);
            break;
         case 4:commission = (sales * 0.05);
            System.out.print ("The commision earned is: " +commission);
            break;
         case 5:commission = sales * 0.10;
            System.out.print ("The commission earned is: " +commission);
            break;
         case 6: commission = (sales * 0.05);
            System.out.print ("The commission earned is: " +commission);
                       
      }// end switch
         
         
   } // end main method
}// end class 
