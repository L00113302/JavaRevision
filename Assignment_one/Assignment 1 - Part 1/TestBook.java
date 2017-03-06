// Mark Glenn
// L00113302
// Assignment 1
// Book class
public class TestBook
{
    public static void main(String args[])
   {
      // create instance of Author
      Author anAuthor = new Author("Mark Glenn", 'M', "m4rkglenn@gmail.com");
      
      Book aBook = new Book("Java for Beginners", anAuthor, 9.99, 500);
      
      Book anotherBook = new Book("More Java", new Author("Jimmy Magee", 'F', "jMagee@yahoo.com"),19.99, 2000);
      
      System.out.println(anAuthor);
      System.out.println(aBook);
      System.out.println(anotherBook);
      
      System.out.println(aBook.getAuthor().getName() +" " +aBook.getAuthor().getEmail());
    }  
}     