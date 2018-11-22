
/**
 * This class calculates the average based on the number of tests, test grades, and the total points recieved.
 *
 * @Ipshita Bhatnagar
 * @09/06/2018
 */
public class GradesV2
{
    
    public static void main(String[ ] args)
    {
         //local variables
         int numTests = 0;      //counts number of tests
         int testGrade = 0;     //individual test grade
         int totalPoints = 0;   //total points for all tests 
        double average = 0.0;  //average grade

        numTests++;
        testGrade = 95;
        totalPoints += testGrade;
        average = totalPoints/numTests;
        System.out.println("Test # "+ numTests + " Test Grade: " + testGrade + " Total Points: "  + totalPoints + " Average score: " + average);
        
        numTests++;
        testGrade = 73;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # "+ numTests + " Test Grade: " + testGrade + " Total Points: "  + totalPoints + " Average score: " + average);
        
        numTests++;
        testGrade = 91;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # "+ numTests + " Test Grade: " + testGrade + " Total Points: "  + totalPoints + " Average score: " + average);
        
        numTests++;
        testGrade = 82;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # "+ numTests + " Test Grade: " + testGrade + " Total Points: "  + totalPoints + " Average score: " + average);
        
        numTests++;
        testGrade = 34;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # "+ numTests + " Test Grade: " + testGrade + " Total Points: "  + totalPoints + " Average score: " + average);
        
        numTests++;
        testGrade = 78;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # "+ numTests + " Test Grade: " + testGrade + " Total Points: "  + totalPoints + " Average score: " + average);
        
        numTests++;
        testGrade = 56;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # "+ numTests + " Test Grade: " + testGrade + " Total Points: "  + totalPoints + " Average score: " + average);
        
        numTests++;
        testGrade = 90;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # "+ numTests + " Test Grade: " + testGrade + " Total Points: "  + totalPoints + " Average score: " + average);
        
        numTests++;
        testGrade = 28;
        totalPoints += testGrade;
        average = (double)totalPoints/numTests;
        System.out.println("Test # "+ numTests + " Test Grade: " + testGrade + " Total Points: "  + totalPoints + " Average score: " + average);
    }
}
