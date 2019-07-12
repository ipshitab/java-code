/**
 * Class HomeworkTester tests the printing of a homework assignment using 
 * an abstract class.
 *
 * @Ipshita Bhatnagar
 * @3/31
 */
import java.util.*;
public class HomeworkTester3
{
    public static void main(String []args)
    {
        // instances
        Science3 astronomy = new Science3();
        Math3 calc = new Math3();
        English3 lit = new English3();
        History3 world = new History3();
        //creating assignments
        astronomy.set(20);
        calc.set(16);
        lit.set(100);
        world.set(11);
        //organizing courses
        List<Homework3> myHomework = new ArrayList();
        myHomework.add(astronomy); 
        myHomework.add(calc);
        myHomework.add(lit);
        myHomework.add(world);
        System.out.println("                My Homework Reading To-Do");
        System.out.println("                *************************");
        System.out.println();
        System.out.println("              Before: ");
        System.out.println();
        for (int i = 0; i < myHomework.size(); i++)
          System.out.println(myHomework.get(i).toString());
        //doing hw
        astronomy.doingHw(15);
        calc.doingHw(3);
        lit.doingHw(76);
        world.doingHw(1);  
        System.out.println();
        System.out.println("              After: ");
        System.out.println();
        for (int i = 0; i < myHomework.size(); i++)
          System.out.println(myHomework.get(i).toString());
    }
}
