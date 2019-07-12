
/**
 * Class Dogs recursively calculates the nth Fibonacci number.
 *
 * @Ipshita Bhatnagar
 * @1/26
 */
public class Dogs
{
     public static int fibonacci(int n)
    {
     if (n == 0)
        return 0;
     if (n == 1)
        return 1;
     return fibonacci(n-1) + fibonacci(n-2);
    }
}
