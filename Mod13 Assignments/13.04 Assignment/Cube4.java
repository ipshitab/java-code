
/**
 * This class defines a Cube object by extending
 * Box and includes dim.
 * The toString method has been added.
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
public class Cube4 extends Box4
{
    // instance variables - replace the example below with your own
    private int dimension;

    /**
     * Constructor for objects of class Cube4
     */
    public Cube4(int dim)
    {
        super(dim, dim, dim);
        dimension = dim;
    }
    
    public String toString()
    {
        return "Cube -  " + dimension + " X " + dimension + " X " + dimension;
    }
}
