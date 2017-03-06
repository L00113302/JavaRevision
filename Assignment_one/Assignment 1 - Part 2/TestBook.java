// Mark Glenn
// L00113302
// Assignment 1
// Book class
import java.util.*;
import java.util.Arrays;
public class TestBook
{
   public static void main(String args[])
   {
      // create instance of Author
      Author[] authors=new Author[2];
     
     // intitialise arrays
      authors[0] = new Author ("Jim Bob",'M',"jbob@gmail.com");
      authors[1] = new Author ("Bobby Jones", 'F' ,"BJ@gmail.com");
     
     // create instance of book
      Book java = new Book ("Java For Dummies", authors, 19.99, 2000);
     
      System.out.println(java); // toString
      System.out.println("The authors are: ");
      java.printAuthors(); // printAuthors
     
      Author[] temp = java.getAuthors(); // create temporary array to test getAuthors method.
   
         
      System.out.println(Arrays.toString(temp)); // print arrays in string form
          
   
   }  
} // end tester