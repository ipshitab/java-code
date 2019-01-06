
/**
 *class PlanetGravity determines the surface gravity (g) on each planet in our solar system
 *
 * @Ipshita Bhatnagar
 * @12/2
 */
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class PlanetGravity
{
    //method for g
    public static double surfaceG(double mass, double diameter)
    {
        double G = 6.67*(Math.pow(10, -11));
        double g = ((G * mass)/(Math.pow((diameter/2)*1000, 2)));
        return g;
    }
    //method for printing line
    public static void printLine(String name, double diameter, double mass, double g)
    {
        System.out.printf("%-10s%10.2f%10.2E%12.2f", name, diameter, mass, g);
        System.out.println();
    }
    //method for writing in file
    public static void wFile(PrintWriter outFile, double g)
    {
        outFile.println(g);
    }
    
    public static void main(String[ ] args) throws IOException
    {
        PrintWriter outFile = new PrintWriter(new File("planetg.txt"));
        String[] name = {"Mercury","Venus", "Earth","Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        double[] diameter = {4880, 12103.6, 12756.3, 6794, 142984, 120536, 51118, 49532};
        double[] mass = {(3.30*Math.pow(10, 23)), (4.869*Math.pow(10, 24)), (5.972*Math.pow(10, 24)), (6.4219*Math.pow(10, 23)), (1.900*Math.pow(10, 27)), (5.68*Math.pow(10, 26)), (8.683*Math.pow(10, 25)), (1.0247*Math.pow(10, 26))};
        System.out.println("                  Planetary Data      ");
        System.out.printf("%-10s%10s%10s%12s", "Planet", "Diameter(km)", "Mass(kg)", "g (m/s^2)");
        System.out.println();
        System.out.println("**************************************************");
        for (int i = 0; i < name.length; i++)
        {
            double gravity = surfaceG(mass[i], diameter[i]);
            printLine(name[i], diameter[i], mass[i], gravity);
            wFile(outFile, gravity);
        }
        outFile.close();
    }
    
}
