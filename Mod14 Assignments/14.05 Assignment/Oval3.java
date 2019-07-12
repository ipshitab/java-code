
/**
 * This class defines an Oval object by extending Circle.
 *
 * @author Ipshita Bhatnagar
 * @version 2/17
 */

public class Oval3 extends Circle3
{
    // instance variables
    private int rad2;
    private int x;
    private int y;
    private int rad1;

    // Constructor for objects of class Oval
    public Oval3(int x, int y, int rad1, int rad2)
    {
        // call superclass
        super(x, y, rad1);

        // initialize instance variables
        this.rad2 = rad2;
        this.rad1 = rad1;
        this.x = x;
        this.y = y;
    }

    public int getRadius3()
    {
        return this.rad2;
    }
    
    //get name
    public String getName()
    {
         return "Oval";
    }
}
