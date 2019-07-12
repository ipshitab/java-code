
/**
 * This class defines a Square object by extending
 * Rectangle and includes sides.
 * The toString method has been added.
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
public class Square4 extends Rectangle4
{
    // instance variables - replace the example below with your own
    private int side;

    /**
     * Constructor for objects of class Square4
     */
    public Square4(int sides)
    {
        super(sides, sides);
        side = sides;
    }

    public String toString()
    {
        return "Square -  " + side + " X " + side;
    }
}
