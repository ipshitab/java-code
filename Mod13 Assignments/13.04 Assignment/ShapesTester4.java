/**
 * This class tests extended objects.
 * The toString method has been added.
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
import java.util.*;
public class ShapesTester4
{
    public static void showEffectBoth(Rectangle4 rect)
    {
        System.out.println(rect.toString());
    }
    
    public static void main(String []args)
    {
        //instances
        Rectangle4 one =  new Rectangle4(2, 4);
        Square4 two = new Square4(10);
        Box4 three =  new Box4(25, 10, 13);
        Cube4 four =  new Cube4(7);
        SquarePyramid4 five = new SquarePyramid4(10, 12);
        
        //array lists
        ArrayList<Rectangle4> rects = new ArrayList<Rectangle4>(); 
        rects.add(one);
        rects.add(two);
        rects.add(three);
        rects.add(four);
        
        for ( Rectangle4 r : rects )
        {   
             showEffectBoth(r);
        }
    }
}
