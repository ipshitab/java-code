/**
 * Class ElectionTesterV7 demonstrates traversal algorithms to evaluate 
 * the results of a mock election with an array.
 *
 * @Ipshita Bhatnagar
 * @4/19
 */
import java.util.*;
public class ElectionTesterV7
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
      //deleting
      System.out.println();
      delete(myCandidates, 3);
      System.out.println("<< Delete item at index 3 >>");
      System.out.println();
      System.out.println("    Inventory List (after deletion)        ");
      System.out.println("___________________________________________");
      printTable(myCandidates);
      System.out.println();
      //delete specific
      System.out.println();
      deleteByName(myCandidates, "Obama");
      System.out.println("<< Delete Obama item >>");
      System.out.println();
      System.out.println("    Inventory List (after deletion)        ");
      System.out.println("___________________________________________");
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
           if (myArray[i] != null)
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
           if (myArray[i] != null)
           {
               System.out.printf("%-10s", myArray[i].getName());
               System.out.printf("%20d", myArray[i].getVotes());
               System.out.printf("%25.2f", (myArray[i].getVotes() / (double)totalV) * 100);
               System.out.println();
           }
       }
       System.out.println();
       System.out.println("Total number of votes: " + totalV);
   }
   
   //replacing name
   public static void changeName(Candidate[] itemList, String find, String replace)
    {
       for(int index = 0; index < itemList.length; index++)
          if(itemList[index] != null && itemList[index].getName().equals(find))
               itemList[index].setName(replace);
    }
   
   //replacing votes
   public static void changeVotes(Candidate[] itemList, String find, int replace)
    {
       for(int index = 0; index < itemList.length; index++)
          if((itemList[index] != null) && itemList[index].getName().equals(find))
               itemList[index].setVotes(replace);
    }
    
   //both
   public static void changeBoth(Candidate[] itemList, String find, String replace, int voteReplace)
    {
       for(int index = 0; index < itemList.length; index++)
       {
          if(itemList[index].getName().equals(find))
          {
               itemList[index].setName(replace);
               itemList[index].setVotes(voteReplace);
          }
       }
    }
   
   //inserting in specific spot
   public static void insertItem1(Candidate[] itemList, int location, String addN, int addS)
    {
       //move items down in the array - last item is lost
       for(int index = itemList.length - 1; index > location; index--)
           itemList[index] = itemList[index-1];

       itemList[location] = new Candidate(addN, addS);
    }
   
   //inserting before
   public static void insertItem2(Candidate[] itemList, String find, String addN, int addS)
    {
        int location = 0;

        // find location of item you want to insert before
        for(int index = 0; index < itemList.length; index++)
        {
            if((itemList[index] != null) && (itemList[index].getName().equals(find)))
            {
                location = index;
                break;
            }
            else if(itemList[index] == null)
            {
                location = index;
                break;
            }
        }

        //move items down in the array - last item is lost
        for(int index = itemList.length - 1; index > location; index--)
            itemList[index] = itemList[index-1];

        itemList[location] = new Candidate(addN, addS);
    }
    
   //deleting
   public static void delete(Candidate[] itemList, int location)
    {
        if ((location > 0) && (location < itemList.length))
        {
            //move items up in the array -
            for(int index = location; index < itemList.length -1; index++)
                itemList[index] = itemList[index + 1];

            itemList[itemList.length-1] = null;
        }
    }
   
   //delete specific
   public static void deleteByName(Candidate[] itemList, String find)
    {
        int location = 0;
        int index;

        // find location of item you want to delete
        for(index = 0; index < itemList.length; index++)
            if((itemList[index] != null) && (itemList[index].getName().equals(find)))
            {
                location = index;
                break;
            }
            else if(itemList[index] == null)
            {
                location = -1;
                break;
            }

        if ((index != itemList.length) && (location >= 0))
        { 
            //move items up in the array
            for(index = location; index < itemList.length -1; index++)
                itemList[index] = itemList[index + 1];

            itemList[itemList.length-1] = null;
        }
    }
}