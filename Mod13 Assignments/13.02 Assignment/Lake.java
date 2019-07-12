
/**
 * class Lake has an attribute for the depth of water.
 *
 * @Ipshita Bhatnagar
 * @2/12
 */
public class Lake extends Terrain
{
    // instance variables - replace the example below with your own
    private double depthOfWater;

    /**
     * Constructor for objects of class Lake
     */
    public Lake(int l, int w, double depth)
    {
        // initialise instance variables
        super(l, w);
        depthOfWater = depth;
    }
    
    public double getdepthOfWater()
    {
        // put your code here
        return depthOfWater;
    }
}
