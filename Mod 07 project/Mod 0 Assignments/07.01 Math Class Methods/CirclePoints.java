
/**
 * class CirclePoints calculates the (x, y) coordinates of points on a circle of a given radius.
 *
 * @Ipshita Bhatnagar
 * @11/29/2018
 */
import java.util.Scanner;
public class CirclePoints
{
   public static void main(String[ ] args)
   {
       Scanner in = new Scanner(System.in);
       System.out.println("What is the radius of the circle: ");
       double r = in.nextDouble();
       double increment = 0.1;
       double x = r;
       double y = 0;
       
       System.out.println("Points on a Circle with a Radius of " + r);
       System.out.printf("%10s%10s%10s%10s", "x1","y1","x1","y2");
       System.out.println();
       System.out.println("*************************************************");
       
       while (x >= -r)
       {    
           y = Math.sqrt(Math.pow(r, 2) - Math.pow(x, 2));
           System.out.printf("%10.2f%10.2f%10.2f%10.2f", x,y,x,-y);
           System.out.println();
           x -= increment;
       }
          
       
       
       
       
       
       
   }
}
