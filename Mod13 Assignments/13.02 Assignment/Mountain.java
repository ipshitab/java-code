
/**
 * class Mountain has an attribute for the number of mountains.
 *
 * @Ipshita Bhatnagar
 * @2/12
 */
public class Mountain extends Terrain
{
    // instance variables - replace the example below with your own
    private int numMountains;

    /**
     * Constructor for objects of class Mountain
     */
    public Mountain(int l, int w, int numM)
    {
        // initialise instance variables
        super(l, w);
        numMountains = numM;
    }

    public int getnumMountains()
    {
        // put your code here
        return numMountains;
    }
}
