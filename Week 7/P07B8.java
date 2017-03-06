// Practical P07B8
// Mark Glenn
// 25/09/2014
// Program using increment decrement
import java.util.Scanner;
 
public class P07B8
{
   public static void main(String [] args)
   {
   
   int a = 10, b = 3, c = 5, d = 0, ans;
   ans = 4%6;
   d = a/b;
   b = ++a%c;
   d = a++ - --c;
   b = a-- + ++c % d;
   System.out.println("a= " +a +" b= " +b);
   System.out.println("c= " +c +" d= " +d);
   System.out.println(ans);
   
   } //end main method
} // end class
