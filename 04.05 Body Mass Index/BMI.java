
/**
 * Class BMI calculates Body Mass Index (BMI) after prompting for a person's height and weight.
 *
 * @Ipshita Bhatnagar
 * @11/3/2018
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your name (ex first last): ");
        String name = in.next();
        name += in.nextLine();

        System.out.print("Enter your weight in pounds (ex 175): ");
        double weight = in.nextDouble();
        
        System.out.print("Enter your height in feet and inches (ex 5 11): ");
        int heightFt = in.nextInt();
        int heightIn = in.nextInt();
        heightIn = heightFt*12 + heightIn;
        
        //conversion
        double weightKg = weight/2.2046;
        double heightM = heightIn/39.370; 
        
        //calculate BMI
        double bmi = (weightKg/(heightM*heightM));
        
        //calculate category
        String category = "";
        if (bmi < 18.5)
            category = "Underweight";
        else if (bmi >= 18.5 && bmi <= 24.9)
             category ="Normal or Healthy Weight";
        else if (bmi >= 25.0 && bmi <= 29.9)
             category ="Overweight";
        else
             category ="Obese";
        
        System.out.println("Body Mass Index Calculator");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Name: " + name);
        System.out.println("Weight (kg): " + weightKg);
        System.out.println("Height (m): " + heightM);
        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category);
        
        
        
        
        
        
    }
}
