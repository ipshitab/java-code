/**
 * Class Tools implements the interface and comparable T
 *
 * @Ipshita Bhatnagar
 * @4/13
 */
public class Tools implements Product, Comparable<Tools>
{
    // instance variables - replace the example below with your own
    public String name;
    public double cost;

    /**
     * Constructor for objects of class Tools
     */
    public Tools(String name, double cost)
    {
        this.name = name;
        this.cost = cost;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    
    public double getCost()
    {
        return cost;
    }
    
    public int compareTo(Tools obj)
    {
        if(cost < obj.cost)
            return -1;
        else if(cost == obj.cost)
            return 0;
        else
            return 1;
    }
}
