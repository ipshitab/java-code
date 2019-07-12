/**
 * Class StudentTester is a grade book for students and their grades
 *
 * @Ipshita Bhatnagar
 * @4/20
 */
public class StudentTester
{
   public static void main(String[] args)
    {
      Student[] myStudents; 
      myStudents = new Student[12];
      myStudents[0] = new Student("Ipshita Bhatnagar",10.5, 20, 30, 67.3, 98);
      myStudents[1] = new Student("Dorothy Dover",18, 28.5, 39, 67, 46);
      myStudents[2] = new Student("Serena McDonald",98, 46.2, 90.8, 24, 78.1);
      myStudents[3] = new Student("Brooke Boyland",87, 65.56, 43, 12.9, 89);
      myStudents[4] = new Student("Lorayn Aponte",65.23, 89, 70, 54.11, 76.5);
      //printing Gradebook
      System.out.println("<< Original Grade Book >>");
      System.out.println();
      System.out.println("    List of Students and Scores:         ");
      System.out.println("_________________________________________");
      printTable(myStudents);
      System.out.println();
      
      //replacing name
      changeName(myStudents, "Dorothy Dover", "Brianna LoProto");
      System.out.println("<< Replacing Dorothy with Brianna >>");
      System.out.println();
      System.out.println("    List of Students and Scores: (after change)        ");
      System.out.println("_______________________________________________________");
      printTable(myStudents);
      System.out.println();
      //replacing score
      changeScores(myStudents, "Lorayn Aponte", 4, 56);
      System.out.println("<< Changing Lorayn's scores >>");
      System.out.println();
      System.out.println("    List of Students and Scores: (after change)        ");
      System.out.println("_______________________________________________________");
      printTable(myStudents);
      System.out.println();
      //both
      double[] newScores = {34, 91, 23, 55, 67};
      changeBoth(myStudents, "Serena McDonald", "Chloe Wilson", newScores);
      System.out.println("<< Replacing Serena with Chloe & grades >>");
      System.out.println();
      System.out.println("    List of Students and Scores: (after change)        ");
      System.out.println("_______________________________________________________");
      printTable(myStudents);
      System.out.println();
      //inserting before
      System.out.println();
      double [] newScoresT = {40, 50, 60, 70, 80};
      insertBefore(myStudents, "Brooke Boyland", "Adam Kolb", newScoresT);
      System.out.println("<< Before Brooke, add Adam, & change grades >>");
      System.out.println();
      System.out.println("    List of Students and Scores: (after change)        ");
      System.out.println("_______________________________________________________");
      printTable(myStudents);
      System.out.println();
      //delete specific
      System.out.println();
      deleteByName(myStudents, "Ipshita Bhatnagar");
      System.out.println("<< Delete Ipshita >>");
      System.out.println();
      System.out.println("    List of Students and Scores: (after change)        ");
      System.out.println("_______________________________________________________");
      printTable(myStudents);
    }
    
   //methods
   public static void printTable(Student[] myArray)
    {
       //System.out.println("List of Students and Scores:");
       System.out.println();
       System.out.println(" Students                   Q1       Q2       Q3       Q4        Q5");
       System.out.println("****************************************************************************");
       for (int i = 0; i < myArray.length; i++)
       {
           if (myArray[i] != null)
           {
               System.out.printf("%-20s", myArray[i].getName());
               for (int j = 0; j < 5; j++)
               {
                   System.out.printf("%10.2f", myArray[i].getScore(j));
               }
               System.out.println();
           }
       }
       System.out.println();
    }
    
   //replacing name
   public static void changeName(Student[] itemList, String find, String replace)
    {
       for(int index = 0; index < itemList.length; index++)
          if(itemList[index] != null && itemList[index].getName().equals(find))
               itemList[index].setName(replace);
    }
    
   //replacing scores
   public static void changeScores(Student[] itemList, String findName, int quizNum, double replaceScore)
    {
       for(int index = 0; index < itemList.length; index++)
          if((itemList[index] != null) && itemList[index].getName().equals(findName))
               itemList[index].setScore(quizNum, replaceScore);
    }
    
   //both
   public static void changeBoth(Student[] itemList, String find, String replace, double[] scoreReplace)
    {
       for(int index = 0; index < itemList.length; index++)
       {
          if((itemList[index] != null) && itemList[index].getName().equals(find))
          {
               itemList[index].setName(replace);
               for (int j=0; j< 5;j++)
                  itemList[index].setScore(j, scoreReplace[j]);
          }
       }
    }
   
   //inserting before
   public static void insertBefore(Student[] itemList, String find, String addN, double[] addS)
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

        itemList[location] = new Student(addN, addS[0],addS[1],addS[2],addS[3],addS[4]);
    }
    
   //delete specific
   public static void deleteByName(Student[] itemList, String find)
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
