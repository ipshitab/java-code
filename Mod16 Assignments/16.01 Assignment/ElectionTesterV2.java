/**
 * Class ElectionTesterV2 demonstrates traversal algorithms to evaluate 
 * the results of a mock election with an ArrayList
 *
 * @Ipshita Bhatnagar
 * @4/17
 */
import java.util.*;
public class ElectionTesterV2
{
   public static void main (String[] args) 
   {  
      List<Candidate> myCandidates = new ArrayList();
      myCandidates.add(new Candidate("Obama",1000));
      myCandidates.add(new Candidate("Trump",23));
      myCandidates.add(new Candidate("Sanders",1345));
      myCandidates.add(new Candidate("Cruz",678));
      myCandidates.add(new Candidate("Clinton",9876));
      printCandi(myCandidates);
      printTable(myCandidates);
   }
    
   /**
   * An example of a method - replace this comment with your own
   */
   public static void printCandi(List<Candidate> myArray)
   {  
      System.out.println("Raw Election Data:");
      System.out.println();
      for (int i = 0; i < myArray.size(); i++)
      {
         System.out.print(myArray.get(i).getName() + " received ");
         System.out.println(myArray.get(i).getVotes() + " votes.");
      }
   }

   public static int totalVotes(List<Candidate> myArray)
   {
       int count = 0;
       for (int i = 0; i < myArray.size(); i++)
       {
           count += myArray.get(i).getVotes();
       }
       return count;
   }
   
   public static void printTable(List<Candidate> myArray)
   {
       int totalV = totalVotes(myArray);
       System.out.println();
       System.out.println("Election Results:");
       System.out.println();
       System.out.println("Candidates            Votes Received            % of Total Votes");
       System.out.println("****************************************************************");
       for (int i = 0; i < myArray.size(); i++)
       {
           System.out.printf("%-10s", myArray.get(i).getName());
           System.out.printf("%20d", myArray.get(i).getVotes());
           System.out.printf("%25.2f", (myArray.get(i).getVotes() / (double)totalV) * 100);
           System.out.println();
       }
       System.out.println();
       System.out.println("Total number of votes: " + totalV);
   }
}