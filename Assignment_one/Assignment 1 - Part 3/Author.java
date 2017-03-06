// Mark Glenn
// L00113302
// Assignment 1
// Author class
public class Author
{
   // Instance fields
   private String name=" ";
   private String email=" ";
   private char gender=' ';
   
   // Constructors (No default)   
   public Author(String n, char g, String e)
   {
      this.name = n;
      gender = g;
      email = e;
   }
   
   // Methods
   public String getName()
   {
      return name;
   }
      
   public String getEmail()
   {
      return email;
   }
      
   public void setEmail(String emailIn)
   {
      email=emailIn; 
   }
      
   public char getGender()
   {
      return gender;
   }
           
   public String toString()
   {
      return name +" ("+gender+")" +" at " +email;
   }
}// End class