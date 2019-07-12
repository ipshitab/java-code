/**
 * Class PrimeNumTester tests the calculations and counting of the quantity of 
 * prime numbers between a given range
 *
 * @author Ipshita Bhatnagar
 * @version 3/10
 */
import java.util.Scanner;
public class PrimeNumTester 
{
    /**
     * Constructor for objects of class PrimeNumTester
     */
    public PrimeNumTester()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main(String a[])
    {
        //getting input from user
        Scanner in = new Scanner(System.in);
        System.out.println("input a lower limit of prime numbers: ");
        int lowPrime = in.nextInt();
        System.out.println("input an upper limits of prime numbers: ");
        int highPrime = in.nextInt();
        
        //keeping count of prime num
        int count = 0;
        System.out.print("These are the prime numbers in your range: ");
        for (int i = lowPrime; i <= highPrime; i++)
        {
            Number num = new Number(i);
            if (num.isPrime())
            {
                System.out.print(i + " ");
                count++;
            }
        }
        //printing out prime numbers
        System.out.println();
        System.out.println("There are " + count + " prime numbers in your range.");
    }
}
