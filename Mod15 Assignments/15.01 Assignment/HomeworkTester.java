/**
 * Class HomeworkTester tests the printing of a homework assignment using 
 * an abstract class.
 *
 * @Ipshita Bhatnagar
 * @3/30
 */
import java.util.*;
public class HomeworkTester
{
    public static void main(String []args)
    {
        // instances
        Science astronomy = new Science();
        Math calc = new Math();
        English lit = new English();
        History world = new History();
        //creating assignments
        astronomy.set(20);
        calc.set(16);
        lit.set(100);
        world.set(11);
        //organizing courses
        ArrayList<Homework> myHomework = new ArrayList();
        myHomework.add(astronomy); 
        myHomework.add(calc);
        myHomework.add(lit);
        myHomework.add(world);
        System.out.println("                My Homework Reading To-Do");
        System.out.println("                *************************");
        for (int i = 0; i < myHomework.size(); i++)
          System.out.println(myHomework.get(i).toString());
    }
}
