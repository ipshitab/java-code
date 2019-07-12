 /**
 * This class tests the Circle class hierarchy.
 *
 * @author Ipshita Bhatnagar
 * @version 2/17
 */
import java.util.*;
public class CircleTester1
{
    public static void showCenter(Circle2 c)
    {
        System.out.println("For this " + c.getName() + " " + c.getCenter());
    }
    public static void main(String []args)
    {
        //instances
        Circle2 one =  new Circle2(2, 4, 6);
        Cylinder2 two = new Cylinder2(10, 15, 3, 4);
        Oval2 three =  new Oval2(25, 10, 4, 7);
        OvalCylinder2 four =  new OvalCylinder2(40, 10, 3, 7, 10);
        
        //array lists
        ArrayList<Circle2> circles = new ArrayList<Circle2>(); 
        circles.add(one);
        circles.add(two);
        circles.add(three);
        circles.add(four);
        
        for ( Circle2 c : circles )
        {   
             showCenter(c);
        }
    }
}
