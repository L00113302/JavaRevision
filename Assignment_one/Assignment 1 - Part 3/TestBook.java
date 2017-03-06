// Mark Glenn
// L00113302
// Assignment 1
// Book tester
import java.util.*;
import java.util.Arrays;
public class TestBook
{
   public static void main(String args[])
   {
      Scanner keyboardIn = new Scanner(System.in);
      
      // create instance of book
      Book java = new Book ("Java For Dummies", 19.99, 2000);
     
     // add authors to array
      java.addAuthor(new Author("Mark Glenn", 'M', "markg@gmail.com"));
      java.addAuthor(new Author("Mick Edwards", 'F', "mickey@yahoo.co.uk"));
      java.addAuthor(new Author("James Nesbitt", 'M', "jn@gmail.com"));
      java.addAuthor(new Author("Chloe Glenn", 'F', "cg@yahoo.co.uk"));
     
      System.out.println(java);
     // print authors
      System.out.println("The authors are: ");
      java.printAuthors(); 
       
     // remove authors and print authors to check if removed
      java.removeAuthorByName("mark glenn");
      System.out.println("The authors are: ");
      java.printAuthors();
     
      java.removeAuthorByName("chloe glenn");
      System.out.println("The authors are: ");
      java.printAuthors();
     
   }  
} // end tester