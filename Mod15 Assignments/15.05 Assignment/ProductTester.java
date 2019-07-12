/**
 * Class ProductTester manages the inventory of products
 *
 * Ipshita Bhatnagar
 * @4/13
 */
import java.util.*;
public class ProductTester
{
    public static List<Product> myProducts = new ArrayList();
    public static void main(String []args)
    {
        // instances
        Car car1 = new Car("Wrangler", 21345.31, 15.4);
        Car car2 = new Car("Maserati", 45674, 12.7);
        Car car3 = new Car("Maserati", 49862, 11.2);
        Truck truck1 = new Truck("Ford", 23456, 17.6);
        Truck truck2 = new Truck("Chevy", 12328, 14.8);
        Tools tool1 = new Tools("Saw", 34.67);
        Tools tool2 = new Tools("Hammer", 15);
        Tools tool3 = new Tools("Hammer", 25);
        //organizing products
        //List<Product> myProducts = new ArrayList();
        myProducts.add(car1); 
        myProducts.add(car2);
        myProducts.add(car3);
        myProducts.add(truck1);
        myProducts.add(truck2);
        myProducts.add(tool1);
        myProducts.add(tool2);
        myProducts.add(tool3);
        inventory();
        System.out.println();
        
        System.out.println("        Comparing Tools ");
        System.out.println(" **********************************");
        int compare = tool1.compareTo(tool2);
        System.out.print("The " + tool1.getName());
        if(compare == 0)
           System.out.println(" costs the same as " + tool2.getName() + ".");
        else if (compare == -1)
           System.out.println(" costs less than " + tool2.getName() + ".");
        else
           System.out.println(" costs more than a " + tool2.getName() + ".");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void inventory()
    {
        // arraylists to keep count
        List<String> nameList = new ArrayList();
        List<Integer> countList = new ArrayList();
        List<Double> costList = new ArrayList();
        
        for (int i = 0; i < myProducts.size(); i++)
        {
          int myCount = 0;
          double myCost = 0;
          String myName = myProducts.get(i).getName();
          for (int j = i; j < myProducts.size(); j++)
          {
             if (myName == myProducts.get(j).getName())
             {
                myCount++;
                myCost += myProducts.get(j).getCost();
             }
          }
          
          if (!nameList.contains(myName))
          {
              nameList.add(myName);
              countList.add(myCount);
              costList.add(myCost);
           }
        }
        System.out.println("           Inventory ");
        System.out.println(" **********************************");
        for (int i = 0; i < nameList.size(); i++)
        {
           System.out.println(nameList.get(i) + ": Quantity = " + countList.get(i) + ", Total Cost = $" + costList.get(i));
        }
    }
}
