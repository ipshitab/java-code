
/**
 * Class DogsTester recursively tests the calculations of the nth Fibonacci number.
 *
 * @Ipshita Bhatnagar
 * @1/26
 */
import java.util.Scanner;
public class DogsTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer value (range: 0-30): ");
        System.out.println("Enter a number less than 0 to exit");
        int fibo = in.nextInt();
        while (fibo > -1)
        {
            Dogs pairsofDogs = new Dogs();
            System.out.println("The Fibonaci number is " + pairsofDogs.fibonacci(fibo));
            System.out.println("Enter an integer value (range: 0-30): ");
            System.out.println("Enter a number less than 0 to exit");
            fibo = in.nextInt();
            if (fibo > 30)
            {
                System.out.println("Enter an integer value (range: 0-30)");
            }
        }
    }
}
