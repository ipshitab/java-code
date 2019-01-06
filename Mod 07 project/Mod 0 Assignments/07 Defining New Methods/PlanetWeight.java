
/**
 * class PlanetWeight calculates your weight on each planet in the solar system.
 *
 * @Ipshita Bhatnagar
 * @12/2
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class PlanetWeight
{
    //method
    public static double[] readFile(File filename) throws IOException
    {
       Scanner inFile = new Scanner(filename);
       double[] surfaceG = new double[8];  
       int i = 0;
       while( inFile.hasNextDouble() )
       {
           surfaceG[i]= inFile.nextDouble();      //read next token from file 
            i++;
       }//end while
       inFile.close();
       return surfaceG;
    }
    //method
     public static double findMass(double weight)
    {
       return weight*453.59237;
    }
    public static double newWeight(double mass, double surfaceG)
    {
       double weight =  mass*surfaceG/9.79;
       return weight;
    }
     //method for printing line
    public static void printLine(String name, double gravity, double weight)
    {
        System.out.printf("%-10s%10.2f%20.2f", name, gravity, weight/453.59237);
        System.out.println();
    }
    
    
    public static void main(String[ ] args) throws IOException
    {
       Scanner input = new Scanner(System.in);
       String[] name = {"Mercury","Venus", "Earth","Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};     
       double[] sg = new double[name.length];
       File fileName = new File("planetg.txt");
       sg = readFile(fileName);
       System.out.println("What is your weight in pounds? ");
       double weight = input.nextDouble();
       double mass = findMass(weight);
       System.out.println("        My Weight on the Planets");
       System.out.println();
       System.out.printf("%-10s%10s%20s", "Planet", "Gravity", "Weight(lbs)");
       System.out.println();
       System.out.println("**************************************************");
       for (int i = 0; i < name.length; i++)
        {
            double planetW = newWeight(mass, sg[i]);
            printLine(name[i], sg[i], planetW);
        }
       
    }
    
}
