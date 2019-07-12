/**
 * This class defines a Box object by extending
 * Rectangle and includes height.
 * The toString method has been added.
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
public class Box5 extends Rectangle5
{
    // instance variables
    private int h;
    private int l;
    private int w;
    // Constructor for objects of class Box
    public Box5(int l, int w, int h)
    {
        // call superclass
        super(l, w);

        // initialize instance variables
        this.h = h;
        this.l = l;
        this.w = w;
    }

    // return the height
    public int getHeight()
    {
        return this.h;
    }

    // String to display when object is printed.
    
    public String toString()
    {
        return "Box - " + getLength() + " X " + getWidth() + " X " + this.h;
    }
}