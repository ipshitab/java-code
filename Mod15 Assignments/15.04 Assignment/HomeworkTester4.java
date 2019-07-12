/**
 * Class HomeworkTester tests the printing of a homework assignment using 
 * an abstract class.
 *
 * @Ipshita Bhatnagar
 * @3/31
 */
import java.util.*;
public class HomeworkTester4
{
    public static void main(String []args)
    {
        // instances
        Science4 astronomy = new Science4();
        Math4 calc = new Math4();
        English4 lit = new English4();
        History4 world = new History4();
        //creating assignments
        astronomy.set(20);
        calc.set(16);
        lit.set(100);
        world.set(16);
        //organizing courses
        List<Homework4> myHomework = new ArrayList();
        myHomework.add(astronomy); 
        myHomework.add(calc);
        myHomework.add(lit);
        myHomework.add(world);
        System.out.println("                My Homework Reading To-Do");
        System.out.println("                *************************");
        System.out.println();
        //System.out.println("              Before: ");
        //System.out.println();
        for (int i = 0; i < myHomework.size(); i++)
          System.out.println(myHomework.get(i).toString());
        //doing hw
        //astronomy.doingHw(15);
        //calc.doingHw(3);
        //lit.doingHw(76);
        //world.doingHw(1);  
        //System.out.println();
        //System.out.println("              After: ");
        //System.out.println();
        //for (int i = 0; i < myHomework.size(); i++)
          //System.out.println(myHomework.get(i).toString());
        System.out.println();
        System.out.println("                Comparing my Homework");
        System.out.println("                *************************");
        for (int i = 0; i < myHomework.size() - 1; i++) 
        {
            for (int j = i + 1; j < myHomework.size(); j++)
            {
                int com = myHomework.get(i).compareTo(myHomework.get(j));
                
                System.out.print("The homework for " + myHomework.get(i).gettypeOfHw() + " has");
                if(com == 0)
                   System.out.println(" the SAME number of pages to read as " + myHomework.get(j).gettypeOfHw());
                else if (com == -1)
                   System.out.println(" LESS pages to read than " + myHomework.get(j).gettypeOfHw());
                else
                   System.out.println(" MORE pages to read than " + myHomework.get(j).gettypeOfHw());
            }
        }
    }
}
