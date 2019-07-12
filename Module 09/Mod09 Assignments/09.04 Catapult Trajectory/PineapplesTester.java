
/**
 * Class PineapplesTester tests the calculation of the trajectory of a projectile 
 * based on launch angles and launch velocities
 *
 * @Ipshita Bhatnagar
 * @12/28
 */
public class PineapplesTester
{
    public static void main(String[] args)
    {
    //one dimensional for speeds & angles
    double[] speeds = {20, 25, 30, 35, 40, 45, 50};
    double[] angles = {25, 30, 35, 40, 45, 50};
    double[][] distances = new double[speeds.length][angles.length];
    Pineapples myPineapple = new Pineapples();
    
    System.out.println("                             Projectile Distance (meters)");
    System.out.print("MPH");
    //for loop for printing column headers
    for (int i = 0; i < angles.length; i++)
    {
        System.out.print("      " + angles[i] + " deg");
    }
    System.out.println();
    System.out.println("*********************************************************************************************");
    
    //for loop for calculating distance for each pair of speed and angles
    for (int i = 0; i < speeds.length; i++)
    {
        for (int j = 0; j < angles.length; j++)
        {
          distances[i][j] = myPineapple.calcDistance(speeds[i], angles[j]);
        }
    }
    
    //for loop for printing each row
     for (int i = 0; i < speeds.length; i++)
    {
        System.out.printf("%3.2f", speeds[i]);
        for (int j = 0; j < angles.length; j++)
        {
          System.out.printf("%13.2f", distances[i][j]);
        }
        System.out.println();
    }
    }
}
