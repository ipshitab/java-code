/**
 * Class Vehicles implements the interface
 *
 * @Ipshita Bhatnagar
 * @4/13
 */
public abstract class Vehicles implements Product
{
    // instance variables - replace the example below with your own
    public String name;
    public double cost;

    /**
     * Constructor for objects of class Vehicles
     */
    public Vehicles(String name, double cost)
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
    
    public abstract double getMileage();
}
