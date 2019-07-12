/**
 * Class Truck extends the abstract class
 *
 * @Ipshita Bhatnagar
 * @4/13
 */
public class Truck extends Vehicles
{
    // instance variables - replace the example below with your own
    public double mileage;

    /**
     * Constructor for objects of class Truck
     */
    public Truck(String name, double cost, double mileage)
    {
        super(name, cost);
        this.mileage = mileage;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getMileage()
    {
        return mileage;
    }
}
