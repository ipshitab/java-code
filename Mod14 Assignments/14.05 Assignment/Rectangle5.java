
/**
 * This class defines a Rectangle object using
 * length and width.
 * The toString method has been added.
 *
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
public class Rectangle5
{
    // instance variables
    private int l;
    private int w;

    // Constructor for objects of class Rectangle
    public Rectangle5(int l, int w)
    {
        // initialize instance variables
        this.l = l;
        this.w = w;
    }

    // return the height
    public int getLength()
    {
        return this.l;
    }

    // return the width
    public int getWidth()
    {
        return this.w;
    }

    // String to display when object is printed.
   
    public String toString()
    {
        return "Rectangle -  " + this.l + " X " + this.w;
    }
    
}