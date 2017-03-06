// Mark Glenn
// L00113302
// Assignment 1
// Book class
public class Book
{
   // instance fields
   private String name=" ";
   private Author author;
   private double price=0.00;
   private int qtyInStk=0;
   
   // constructors
   public Book (String n, Author a, double p)
   {
      name=n;
      author=a;
      price=p;
   } 
   
   public Book (String n, Author a, double p, int q)
   {
      name=n;
      author=a;
      price=p;
      qtyInStk=q;
   } 
   
   // methods
   public String getName()
   {
      return name;
   }
   
   public Author getAuthor()
   {
      return author;
   } 
   
   public double getPrice()
   {
      return price;
   }
   
   public void setPrice(double priceIn)
   {     
      price=priceIn;
   }
   
   public int getQtyInStk()
   {
      return qtyInStk;
   }   
   
   public void setQtyInStk(int qtyInStkIn)
   {
      qtyInStk=qtyInStkIn;
   }
   
   public String toString()
   {
      return name +" by " +author;
   }
   
   public String getAuthorName()
   {
      return author.getName();
   } 
   
   public String getAuthorEmail()
   {
      return author.getEmail();
   }
   
   public char getGender()
   {
      return author.getGender();
   }

      
}// end class   