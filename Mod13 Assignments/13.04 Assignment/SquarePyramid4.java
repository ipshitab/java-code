
/**
 * This class defines a SquarePyramid object by extending
 * Square and includes height and length.
 * The toString method has been added.
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
public class SquarePyramid4 extends Square4
{
    // instance variables - replace the example below with your own
    private int height;
    /**
     * Constructor for objects of class SquarePyramid4
     */
    public SquarePyramid4(int l, int h)
    {
        super(l);
        height = h;
    }

     public String toString()
    {
        return "SquarePyramid -  " + super.getLength() + " X " + super.getLength() + " X " + height;
    }
}
