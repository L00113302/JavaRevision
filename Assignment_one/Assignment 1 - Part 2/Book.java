// Mark Glenn
// L00113302
// Assignment 1
// Book class
public class Book
{
   // instance fields
   private String name=" ";
   private Author[] authors;
   private double price=0.00;
   private int qtyInStk=0;
      
   // constructors
   public Book (String n, Author[] a , double p)
   {
      name=n;
      authors=a;
      price=p;
   } 
   
   public Book (String n, Author[] a, double p, int q)
   {
      name=n;
      authors=a;
      price=p;
      qtyInStk=q;
   } 
   
   // methods
   public String getName()
   {
      return name;
   }
   
   public Author[] getAuthors()
   {
      return authors; 
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
      int n=0;
      for (int i=0; i<authors.length; i++)
      {
         n++;
      }   
      return name +" by " +n +" authors."; 
   }
   
   public void printAuthors()
   {
      for (int i=0; i<authors.length; i++)
      {
         System.out.println(authors[i]);
      } 
   } 
   
          
}// end class