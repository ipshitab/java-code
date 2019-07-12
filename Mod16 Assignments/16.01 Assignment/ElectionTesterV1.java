/**
 * Class ElectionTesterV1 demonstrates traversal algorithms to evaluate 
 * the results of a mock election with an array.
 *
 * @Ipshita Bhatnagar
 * @4/17
 */
import java.util.*;
public class ElectionTesterV1
{
   public static void main (String[] args) 
   { 
      Candidate[] myCandidates; 
      myCandidates = new Candidate[5];
      myCandidates[0] = new Candidate("Obama",1000);
      myCandidates[1] = new Candidate("Trump",23);
      myCandidates[2] = new Candidate("Sanders",1345);
      myCandidates[3] = new Candidate("Cruz",678);
      myCandidates[4] = new Candidate("Clinton",9876);
      printCandi(myCandidates);
      printTable(myCandidates);
   }
    
   /**
   * An example of a method - replace this comment with your own
   */
   public static void printCandi(Candidate[] myArray)
   {  
      System.out.println("Raw Election Data:");
      System.out.println();
      for (int i = 0; i < 5; i++)
      {
         System.out.print(myArray[i].getName() + " received ");
         System.out.println(myArray[i].getVotes() + " votes.");
      }
   }

   public static int totalVotes(Candidate[] myArray)
   {
       int count = 0;
       for (int i = 0; i < 5; i++)
       {
           count += myArray[i].getVotes();
       }
       return count;
   }
   
   public static void printTable(Candidate[] myArray)
   {
       int totalV = totalVotes(myArray);
       System.out.println();
       System.out.println("Election Results:");
       System.out.println();
       System.out.println("Candidates            Votes Received            % of Total Votes");
       System.out.println("****************************************************************");
       for (int i = 0; i < 5; i++)
       {
           System.out.printf("%-10s", myArray[i].getName());
           System.out.printf("%20d", myArray[i].getVotes());
           System.out.printf("%25.2f", (myArray[i].getVotes() / (double)totalV) * 100);
           System.out.println();
       }
       System.out.println();
       System.out.println("Total number of votes: " + totalV);
   }
}
