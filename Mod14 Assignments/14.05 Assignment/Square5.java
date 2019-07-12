
/**
 * This class defines a Square object by extending
 * Rectangle and includes sides.
 * The toString method has been added.
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
public class Square5 extends Rectangle5
{
    // instance variables - replace the example below with your own
    private int sides;

    /**
     * Constructor for objects of class Square4
     */
    public Square5(int sides)
    {
        super(sides, sides);
        this.sides = sides;
    }

    public String toString()
    {
        return "Square -  " + this.sides + " X " + this.sides;
    }
}
