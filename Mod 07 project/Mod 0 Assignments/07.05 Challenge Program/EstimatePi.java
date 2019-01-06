
/**
 * class EstimatePi calculates the value of pi by simulating throwing darts at a dart board.
 *
 * @Ipshita Bhatnagar
 * @12/5/2018
 */
import java.util.Scanner;
public class EstimatePi
{
    //method for calculating pi
    public static double calcPi(int hits, int total)
    {
        double pi = 4*((double)hits/total);
        return pi;
    }
    //method of hit or miss
    public static boolean checkHits(double x, double y)
    {
        //using boolean to find out if the dart is in the circle or not
        if (Math.pow(x, 2) + Math.pow(y, 2) <= 1)
            return true;
        else
            return false;
    }
    
    
    public static void main(String[] args)
    {
        //user input
        Scanner input = new Scanner(System.in);
        System.out.println("How many darts should be thrown in a trial?: ");
        int darts = input.nextInt();
        System.out.println("Number of trials?: ");
        int trials = input.nextInt();
        int numHits = 0;
        double[] storePi = new double[trials];
        double sum = 0;
        for (int i = 0; i < trials; i++)
        {
           for (int j = 0; j < darts; j++)
           {
               //determining (x,y) to see if the dart is in the circle or not (hit or miss)
               double randX = -1 + Math.random() * 2;
               double randY = -1 + Math.random() * 2;
               if (checkHits(randX, randY))
                    numHits++;
           }
           //System.out.println("numhits = "+numHits);
           //calculating pi and storing it to find the average
           storePi[i] = calcPi(numHits, darts);
           sum += storePi[i];
           numHits=0;
        }
        //finding average
        double avg = sum/trials;
        for (int x = 1; x <= trials; x++)
        {
            System.out.print("Trial [");
            System.out.printf("%2d", x);
            System.out.print("]: pi = ");
            System.out.printf("%8.5f",storePi[x-1]);
            System.out.println();
        }
        System.out.print("Estimate of pi = ");
        System.out.printf("%8.5f", avg);
    }
}
