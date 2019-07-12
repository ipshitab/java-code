
/**
 * class RainForest has an attribute for amount of rain fallen.
 *
 * @Ipshita Bhatnagar
 * @2/12
 */
public class RainForest extends Forest
{
    // instance variables - replace the example below with your own
    private double amountOfRain;

    /**
     * Constructor for objects of class RainForest
     */
    public RainForest(int l, int w, int numT, double rain)
    {
        // initialise instance variables
        super(l, w, numT);
        amountOfRain = rain;
    }

    public double amountOfRain()
    {
        // put your code here
        return amountOfRain;
    }
}
