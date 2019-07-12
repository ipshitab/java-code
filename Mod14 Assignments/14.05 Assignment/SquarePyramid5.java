
/**
 * This class defines a SquarePyramid object by extending
 * Square and includes height and length.
 * The toString method has been added.
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
public class SquarePyramid5 extends Square5
{
    // instance variables - replace the example below with your own
    private int h;
    private int l;
    /**
     * Constructor for objects of class SquarePyramid4
     */
    public SquarePyramid5(int l, int h)
    {
        super(l);
        this.h = h;
        this.l = l;
    }

     public String toString()
    {
        return "SquarePyramid -  " + super.getLength() + " X " + super.getLength() + " X " + this.h;
    }
}
