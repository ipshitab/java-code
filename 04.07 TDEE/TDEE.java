
/**
 * Class TDEE calculates total daily energy expenditure.
 *
 * @Ipshita Bhatnagar
 * @11/3/2018
 */
import java.util.Scanner;
public class TDEE
{ 
    public static void main(String[ ] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter your name (first last): ");
        String name = in.next();
        name += in.nextLine();
        
        System.out.println("Please enter your BMR: ");
        double bmr = in.nextDouble();
        
        System.out.println("Please enter your gender (M/F): ");
        String gender = in.next().toUpperCase();
        
        System.out.println("Select Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Minimal Movement)");
        System.out.println("[C] Light (Sitting, Standing)");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-Active, Heavy Manual Labor)");
        System.out.print("Enter the letter corresponding to your activity level: ");
        String activity = in.next().toUpperCase();
        //System.out.println(activity);
        //if (activity != "A" && activity != "B" && activity != "C" && activity != "D" && activity != "E" && activity !="F")
        //   {
        //       System.out.println("You did not select a letter. The program is ending.");
        //       return;
        //    }
        System.out.println();
        double actF = 0.0;
        
        if (activity.equals("A"))
            actF = 1.0;
        else if (activity.equals("B"))
            actF = 1.3;
        else if (activity.equals("C") && gender.equals("M"))
            actF = 1.6;    
        else if (activity.equals("C") && gender.equals("F"))
            actF = 1.5;
        else if (activity.equals("D") && gender.equals("M"))
            actF = 1.7;
        else if (activity.equals("D") && gender.equals("F"))
            actF = 1.6;
        else if (activity.equals("E") && gender.equals("M"))
            actF = 2.1;
        else if (activity.equals("E") && gender.equals("F"))
            actF = 1.9;    
        else if (activity.equals("F") && gender.equals("M"))
            actF = 2.4;    
        else if (activity.equals("F") && gender.equals("F"))
            actF = 2.2;
        else
        {
             System.out.println("You did not select a letter. The program is ending.");
             return;
          }
        //TDEE
        double tdee = bmr*actF;
        //results
        System.out.println("~~~~~~~~~~~~~~~~~~");
        System.out.println("Your Results:");
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("BMR: " + bmr);
        System.out.println("Activity Factor: " + actF);
        System.out.println("TDEE: " + tdee);
    
    }
}
