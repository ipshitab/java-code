/**
 * Class Number calculates and counts the quantity of prime numbers between a 
 * given range.
 *
 * @author Ipshita Bhatnagar
 * @version 3/10
 */
public class Number
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Number
     */
    public Number(int x)
    {
        this.x = x;
    }
    
    public boolean isPrime()
    {
        //checking if it is prime or not
        for (int i = 2; i < (this.x / 2); i++)
        {
            if (this.x % i == 0)
            return false;
        }
        return true;
    }
}
