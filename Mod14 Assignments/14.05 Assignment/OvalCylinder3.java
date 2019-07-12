
/**
 * This class defines an Oval Cylinder object that extends an Oval.
 *
 * @author Ipshita Bhatnagar
 * @version 2/17
 */

public class OvalCylinder3 extends Oval3
{
    // instance variables
    private int h;
    private int rad2;
    private int x;
    private int y;
    private int rad1;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder3(int x, int y, int rad1, int rad2, int h)
    {
        // call superclass
        super(x, y, rad1, rad2);

        // initialize instance variables
        this.h = h;
        this.rad2 = rad2;
        this.rad1 = rad1;
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
         return "OvalCylinder";
    }
}