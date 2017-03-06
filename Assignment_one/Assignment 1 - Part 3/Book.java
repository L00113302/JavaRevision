// Mark Glenn
// L00113302
// Assignment 1
// Book class
import java.util.Arrays;
public class Book
{
   // instance fields
   private String name=" ";
   private Author[] authors = new Author[5];
   private double price=0.00;
   private int qtyInStk=0;
   private int numAuthors=0;
      
   // constructors
   public Book (String n, double p)
   {
      this.name=n;
      price=p;
   } 
   
   public Book (String n, double p, int q)
   {
      this.name=n;
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
      return name +" by " +numAuthors +" authors."; 
   }
   // print array of authors for book
   public void printAuthors()
   {
      for (int i=0; i<numAuthors; i++)
      {
         System.out.println(authors[i]);
      } 
   } 
  // add author to array and count authors 
   public void addAuthor(Author authorIn)
   {
      authors[numAuthors]=authorIn;
      ++numAuthors;
   }
   
  // remove author by name and eliminate null values   
   public boolean removeAuthorByName(String authorName)
   {
      // boolean flag if name found
      boolean found = false;
      for (int i=0; i<numAuthors; i++)
      {
               
         if(authors[i] != null)
         {
            if(authorName.equalsIgnoreCase(authors[i].getName()))
            {
               authors[i] = null;
               found = true;
            }    
                // if removed close the gap
            if(authors[i]==null)
            {
               for(int j = i; j < numAuthors; j++)
               {
                  authors[j]=authors[j+1];
               } 
               authors[numAuthors-1]=null;
               numAuthors--;                
            }
                
              
         }
      }   
             
      return found;
   }
   
        
          
}// end class