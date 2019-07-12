
/**
 * class Forest has an attribute for the number of trees.
 *
 * @Ipshita Bhatnagar
 * @2/12
 */
public class Forest extends Terrain
{
    // instance variables - replace the example below with your own
    private int numTrees;

    /**
     * Constructor for objects of class Forest
     */
    public Forest(int l, int w, int numT)
    {
        // initialise instance variables
        super(l, w);
        numTrees = numT;
    }

    public int getnumTrees()
    {
        // put your code here
        return numTrees;
    }
}
