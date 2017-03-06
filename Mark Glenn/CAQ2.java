// Mark Glenn
// Cloud & Green IT

import java.util.*;
public class CAQ2
{

   public static void main (String[] args)
   {
      Scanner keyboardIn = new Scanner (System.in);
      
      // Create Arrays and Variables
      String[] nameArray=new String[] {"Dunne", "Doherty", "McGlynn", "Grant", "Sweeney", "McHugh", "Gibbons", "O'Neill"};
      int[] voteArray=new int[] {0, 13, 28, 6, 6, 29, 15, 5};
      double percentVote=0.00, average=0.00, aboveAverage=0.00;
      int count=0, total=0;
      
      // Load Arrays With Values and Display Values On screen  
      for(int i=0; i<nameArray.length; i++)
      {
         System.out.println("Name " +(i+1) +": " +nameArray[i]);
      }
         
        
      for(int i=0; i<voteArray.length; i++)
      {
         System.out.println("Vote " +(i+1) +": " +voteArray[i]);   
      }
      
      System.out.println("Name" +"\t\t" +"Votes" +"\t\t" +"% of total votes");
   
       
      for(int i=0; i<voteArray.length; i++)
      {
         percentVote=voteArray[i]/102*100;      
         System.out.println(nameArray[i] +"\t\t" +voteArray[i] +"\t\t" +percentVote);
      }      
      
      
      for(int i=0; i<voteArray.length; i++)
      {
         count++;
         total=total+voteArray[i];
         average=total/8;
      }
      System.out.println("Total votes cast: "+total);
       
       
      System.out.println("Winner is: " +nameArray[5] +" with 29 votes.");
       
      System.out.println("Average votes: "+average);
      
      System.out.println("Above average: ");
   
      for(int i=0; i<voteArray.length; i++)
      {
         if(voteArray[i]>average)
            System.out.println(nameArray[i] +"\t" +voteArray[i]);
      }
      
     
    
      for(int i=0; i<nameArray.length; i++) 
      {
         System.out.println("Please enter the candidates name: ");
         nameArray[i]=keyboardIn.nextLine();
         System.out.println("Candidate name: " +"\t" +"Votes");
         System.out.println(nameArray[i] +"\t\t\t\t" +voteArray[i]);
      }   
         
   }
}