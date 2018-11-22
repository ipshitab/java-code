
/**
 * This class asks for the the user to input name, subject, test scores, and ID number and then prints average and total points.
 *
 * @Ipshita Bhatnagar
 * @09/23/2018
 */
import java.util.Scanner;
public class GradesV3
{
    
    public static void main(String[ ] args)
    {
        //local variables
         double totalPoints = 0;   //total points for all tests 
         double average = 0.0;  //average grade
        
        Scanner in;
        in = new Scanner(System.in);
        System.out.println("Enter Student Name (first last): ");
        String name = in.next();
        name += in.nextLine();
        
        System.out.println("Enter ID Number: ");       //extra
        int id = in.nextInt();
        
        System.out.println("Enter Subject: ");
        String subject = in.next();
        
        System.out.println("Enter Test 1 score: ");
        double test1 = in.nextDouble();
        
        System.out.println("Enter Test 2 score: ");
        double test2 = in.nextDouble();
        
        System.out.println("Enter Test 3 score: ");
        double test3 = in.nextDouble();
        System.out.println();
        
        totalPoints = test1+test2+test3;
        average = totalPoints/3;
        
        System.out.println("*****************************************");
        System.out.println("Student Name:  " + name);
        System.out.println("Student ID:  " + id);
        System.out.println("*****************************************");
        System.out.println("Subject:      " + subject);
        System.out.println("Test 1 Score:  " + test1);
        System.out.println("Test 2 Score:  " + test2);
        System.out.println("Test 3 Score:  " + test3);
        System.out.println("Total Points:  " + totalPoints);
        System.out.println("Average:  " + average);
        
        //String firstName = in.next();
        //String lastName = in.NextLine();
        System.out.print("\n");
      
    }
    
}
        
