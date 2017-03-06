// Mark Glenn
// L00113302
// Assignment 1
// BookStore tester
import java.util.*;
public class BookStoreTester
{
   public static void main (String args[])
   {
   
   // create BookStore object of library
   BookStore library = new BookStore();
   
   // create books for library
   Book myBook1 = new Book("Java 1", 16.99);   
   Book myBook2 = new Book("Java 2",19.19);
   
   // add books to library
   library.addBook(myBook1);
   library.addBook(myBook2);
   
   // create authors for book
   Author newAuthor1= new Author("Mark Glenn", 'M', "m4rkglenn@gmail.com");
   Author newAuthor2= new Author("Maggie Smith", 'F', "maggie@gmail.com");

   // add authors to books
   myBook1.addAuthor(newAuthor1);
   myBook2.addAuthor(newAuthor2); 
   
   // use getBooks method to create a list of books in library  
   ArrayList<Book> bookList = library.getBooks();
    
   // print books and authors names 
   for (Book b:bookList)
   {
      System.out.println(b);
   }
   
   }
}   
