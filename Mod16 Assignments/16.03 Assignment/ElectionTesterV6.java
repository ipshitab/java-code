/**
 * Class ElectionTesterV6 demonstrates traversal algorithms to evaluate 
 * the results of a mock election with an ArrayList
 *
 * @Ipshita Bhatnagar
 * @4/19
 */
import java.util.*;
public class ElectionTesterV6
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
      System.out.println();
      //replacing name
      changeName(myCandidates, "Trump", "Jefferson");
      System.out.println("<< Replacing Trump with Jefferson >>");
      System.out.println();
      System.out.println("    Candidate List (after change)        ");
      System.out.println("_________________________________________");
      printTable(myCandidates);
      System.out.println();
      //replacing vote
      changeVotes(myCandidates, "Jefferson", 456);
      System.out.println("<< Changing Jefferson's votes to 456 >>");
      System.out.println();
      System.out.println("    Candidate List (after change)        ");
      System.out.println("_________________________________________");
      printTable(myCandidates);
      System.out.println();
      //both
      changeBoth(myCandidates, "Jefferson", "Trump", 45);
      System.out.println("<< Replacing Jefferson with Trump & votes >>");
      System.out.println();
      System.out.println("    Candidate List (after change)        ");
      System.out.println("_________________________________________");
      printTable(myCandidates);
      System.out.println();
      //insert in specific spot
      System.out.println();
      insertItem1(myCandidates, 2, "Nixon", 7865);
      System.out.println("<< At index 2, add Nixon, 7865 votes >>");
      System.out.println();
      System.out.println("    Candidate List (after change)        ");
      System.out.println("_________________________________________");
      printTable(myCandidates);
      System.out.println();
      //inserting before
      System.out.println();
      insertItem2(myCandidates, "Cruz", "Washington", 6789);
      System.out.println("<< Before Cruz, add Washington, 6789 votes >>");
      System.out.println();
      System.out.println("    Candidate List (after change)        ");
      System.out.println("_________________________________________");
      printTable(myCandidates);
      System.out.println();
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
   
   //replacing name
   public static void changeName(List<Candidate> itemList, String find, String replace)
    {
       for(int index = 0; index < itemList.size(); index++)
          if(itemList.get(index).getName().equals(find))
               itemList.get(index).setName(replace);
    }
   
   //replacing votes
   public static void changeVotes(List<Candidate> itemList, String find, int replace)
    {
       for(int index = 0; index < itemList.size(); index++)
          if(itemList.get(index).getName().equals(find))
               itemList.get(index).setVotes(replace);
    }
    
   //both
   public static void changeBoth(List<Candidate> itemList, String find, String replace, int voteReplace)
    {
       for(int index = 0; index < itemList.size(); index++)
       {
          if(itemList.get(index).getName().equals(find))
          {
               itemList.get(index).setName(replace);
               itemList.get(index).setVotes(voteReplace);
          }
       }
    }
   
   //inserting in specific spot
   public static void insertItem1(List<Candidate> itemList, int location, String addN, int addS)
    {
       // insert item into ArrayList
       itemList.add(location, new Candidate(addN, addS));
    }
   
   //inserting before
   public static void insertItem2(List<Candidate> itemList, String find, String addN, int addS)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < itemList.size(); index++)
            if(itemList.get(index).getName().equals(find))
                location = index;
        
        // insert item into ArrayList
        itemList.add(location, new Candidate(addN, addS));
    }
}