import java.util.Scanner;
public class P10C01SWITCH
{
   public static void main(String [] args)
   {
   
      Scanner keyboardIn = new Scanner(System.in);
      char letter;
      double balance = 0.00, deposit = 0.00, withdrawl =0.00; 
      int opt, depositCount = 0, withdrawlCount = 0;
      do
      {
      //Display menu   
         System.out.println("Bank Account - Please Select an Option");
         System.out.println("1 - Deposit");
         System.out.println("2 - Withdrawl");
         System.out.println("3 - View Balance");
         System.out.println("0 - Quit");
         opt = keyboardIn.nextInt();
      
      //test for valid option
         if ((opt!=0)&&(opt!=1)&&(opt!=2)&&(opt!=3))
         {
            System.out.println("Invalid Option - Please Select an Option from the menu below:");
            System.out.println("");
         }
         switch(opt)
         {
            case 1:
               System.out.println("Please enter the amount you want to deposit:");
               deposit = keyboardIn.nextDouble();
               balance = balance + deposit;
               depositCount++;
               break;
            case 2:
               System.out.println("Please enter the amount you want to withdraw:");
               withdrawl = keyboardIn.nextDouble();
            
            //test if enough to withdraw
               if (withdrawl>balance)
               {
                  System.out.println("You have insufficent funds to make this withdrawl");
                  System.out.println("");
               }
               else
               {
                  balance = balance-withdrawl;
                  withdrawlCount++;
               }
               break;
            case 3:
               {
                  System.out.println("The current balance is:" +balance);
                  System.out.println("");
               }
               break;
         
            case 0: System.out.println("You have chosen quit...");
               break;
         
            default: System.out.println("Invalid option Please choose 1, 2, 3 or 0");
                         
         }	// End of switch
      }while(opt != 0);//end of do while
   }
        
}        
