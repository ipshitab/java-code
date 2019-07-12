
/**
 * This class defines a Cylinder object by extending a Circle.
 *
 * @author Ipshita Bhatnagar
 * @version 2/17
 */

public class Cylinder3 extends Circle3
{
    // instance variables
    private int h;
    private int x;
    private int y;
    private int rad;

    // Constructor for objects of class Cylinder
    public Cylinder3(int x, int y, int rad, int h)
    {
        // call superclass
        super(x, y, rad);

        // initialize instance variables
        this.h = h;
        this.rad = rad;
        this.x = x;
        this.y = y;
    }

    public int getHeight()
    {
        return this.h;
    }
    
    //get name
    public String getName()
    {
         return "Cylinder";
    }
}

