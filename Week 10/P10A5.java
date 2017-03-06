// Practical P10A5
// Mark Glenn
// 11/2014
// Program using a nested for loop to print rows and columns
import java.util.*;
 
public class P10A5
{
   public static void main(String [] args)
   {
    Scanner keyIn = new Scanner (System.in);
   char n=' ';
   int rows=0, columns=0;
   

      System.out.println("Enter a character ");
      n = keyIn.next().charAt(0);
      System.out.println("Enter a row: ");
      rows = keyIn.nextInt();
      System.out.println("Enter a column: ");
      columns = keyIn.nextInt();
      
            for (int inner=0; inner<rows; inner++)
               {
               for (int outer=0; outer<columns; outer++)
               {
               System.out.print(n +" " );
               
               }
               System.out.println();
       }

            
         
    }
}
