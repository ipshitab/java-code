
/**
 * This class defines a Circle object.
 *
 * @author Ipshita Bhatnagar
 * @version 2/17
 */

public class Circle3
{
    // instance variables
    private int p_x;
    private int p_y;
    private int r;

    // Constructor for objects of class Circle
    public Circle3(int p_x, int p_y, int r)
    {
        // initialize instance variables
        this.p_x = p_x;
        this.p_y = p_y;
        this.r = r;
    }

    public int getRadius()
    {
        return this.r;
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
         return "center is at (" + this.p_x + ", " + this.p_y + ")";
    }
    
    //get name
        public String getName()
    {
         return "Circle";
    }
}