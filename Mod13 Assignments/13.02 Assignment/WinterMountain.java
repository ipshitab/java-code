
/**
 * class WinterMountain has all the attributes of a mountain plus the temperature.
 *
 * @Ipshita Bhatnagar
 * @2/12
 */
public class WinterMountain extends Mountain
{
    // instance variables - replace the example below with your own
    private double temperature;

    /**
     * Constructor for objects of class WinterMountain
     */
    public WinterMountain(int l, int w, int numM, double temp)
    {
        // initialise instance variables
        super(l, w, numM);
        temperature = temp;
    }

    public double gettemperature()
    {
        // put your code here
        return temperature;
    }
}
