// Mark Glenn
// L00113302
// Assignment 1
// BookStore class
import java.util.*;
public class BookStore
{
   
   // create private ArrayList of books
   private ArrayList<Book> books;
   
   
   // constructors
   public BookStore()
   {
      this.books=new ArrayList<Book>();
   }
   
   // add books to ArrayList
   public void addBook (Book bookToAdd)   
   {
      this.books.add(bookToAdd);
   }  

   // getBooks from ArrayList
   public ArrayList<Book> getBooks()
   {
          
   return books;
   }
        
}// end class