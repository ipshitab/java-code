/**
 * This class tests extended objects.
 * The toString method has been added.
 *
 * @author Ipshita Bhatnagar
 * @version 2/20
 */
import java.util.*;
public class ShapesTester5
{
    public static void showEffectBoth(Rectangle5 rect)
    {
        System.out.println(rect.toString());
    }
    
    public static void main(String []args)
    {
        //instances
        Rectangle5 one =  new Rectangle5(2, 4);
        Square5 two = new Square5(10);
        Box5 three =  new Box5(25, 10, 13);
        Cube5 four =  new Cube5(7);
        SquarePyramid5 five = new SquarePyramid5(10, 12);
        
        //array lists
        ArrayList<Rectangle5> rects = new ArrayList<Rectangle5>(); 
        rects.add(one);
        rects.add(two);
        rects.add(three);
        rects.add(four);
        
        for ( Rectangle5 r : rects )
        {   
             showEffectBoth(r);
        }
    }
}
