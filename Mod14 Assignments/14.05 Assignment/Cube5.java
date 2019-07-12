
/**
 * This class defines a Cube object by extending
 * Box and includes dim.
 * The toString method has been added.
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
public class Cube5 extends Box5
{
    // instance variables - replace the example below with your own
    private int dim;

    /**
     * Constructor for objects of class Cube5
     */
    public Cube5(int dim)
    {
        super(dim, dim, dim);
        this.dim = dim;
    }
    
    public String toString()
    {
        return "Cube -  " + this.dim + " X " + this.dim + " X " + this.dim;
    }
}
