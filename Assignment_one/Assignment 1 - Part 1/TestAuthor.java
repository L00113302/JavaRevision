// Mark Glenn
// L00113302
// Assignment 1
// Author tester
import java.util.*;
import java.util.Scanner;

public class TestAuthor
{
   public static void main(String args[])
   {
      // create instance of Author
      Author anAuthor= new Author("Mark Glenn", 'M', "m4rkglenn@gmail.com");
      
      // call toString method
      System.out.println(anAuthor);
      
      // use method to set email
      anAuthor.setEmail("m4rkglenn@gmail.com");
      
      // toString method
      System.out.println(anAuthor);

   }
}   