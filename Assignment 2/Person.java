// Mark Glenn
// L00113302
// Assignment 2

import java.util.*;

/** 
 * Abstract Person class containing name and age and
 * getDescription which prints instance variables to screen.
 *
 * @author Mark.Glenn
 * @version 1.0
 *
 */

public abstract class Person
{
   // instance variables
   private String name =" ";
   private int age=0;

   // constructors
   public Person ()
   {
      name = "Don't know";
      age = 0;
   }
   
   public Person (String n, int a)
   {
      name = n;
      age = a;
   }      
   
   /**
    * @return age
    */
   public int getAge()
   {
      return age;
   }
   
  /**
    * @return name, age
    */
   public String getDescription()
   {
      return "Name: "+name +" Age: "+age;
   }
   
   /**
    * @return name
    */

   public String getName()
   {
      return name;
   }   
   
         
      
}
