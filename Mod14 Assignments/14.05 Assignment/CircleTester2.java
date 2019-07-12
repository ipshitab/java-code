 /**
 * This class tests the Circle class hierarchy.
 *
 * @author Ipshita Bhatnagar
 * @version 2/17
 */
import java.util.*;
public class CircleTester2
{
    public static void showCenter(Circle3 c)
    {
        System.out.println("For this " + c.getName() + " " + c.getCenter());
    }
    public static void main(String []args)
    {
        //instances
        Circle3 one =  new Circle3(2, 4, 6);
        Cylinder3 two = new Cylinder3(10, 15, 3, 4);
        Oval3 three =  new Oval3(25, 10, 4, 7);
        OvalCylinder3 four =  new OvalCylinder3(40, 10, 3, 7, 10);
        
        //array lists
        ArrayList<Circle3> circles = new ArrayList<Circle3>(); 
        circles.add(one);
        circles.add(two);
        circles.add(three);
        circles.add(four);
        
        for ( Circle3 c : circles )
        {   
             showCenter(c);
        }
    }
}
