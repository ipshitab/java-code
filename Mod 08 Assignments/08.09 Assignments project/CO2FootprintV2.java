/**
 * @purpose: This class calculates the amount of carbon dioxide emitted for each gallon 
 * of gas consumed by a car
 * 
 * @author Ipshita Bhatnagar
 * @version 12/16
 */
public class CO2FootprintV2
{
    //declaration of private instance variables
    private double myGallonsUsed, myTonsCO2, myPoundsCO2;
    
    /**
     * Constructor for objects
     * @param gallons used
     * @param tons of CO2
     * @param pounds of CO2
     */
     CO2FootprintV2(double gallons)
    {
        myGallonsUsed = gallons;
    }

    /**
     * Mutator method to calculate tons CO2 (no parameters).
     */
    public void calcTonsCO2()
    {
        myTonsCO2 = (8.78 * Math.pow(10, -3)) * myGallonsUsed;
    }

    /**
     * Mutator method to convert tons to pounds (no parameters).
     */
    public void convertTonsToPounds()
    {
        myPoundsCO2 = myTonsCO2 * 2205;
    }

    /**
     * Getter method to return the value of gallons used (no parameters).
     * @return the number of gallons used.
     */
    public double getGallons()
    {
        return myGallonsUsed;
    }

    /**
     * Getter method to return the value of tons of CO2 (no parameters).
     * @return the tons of CO2.
     */
    public double getTonsCO2()
    {
        return myTonsCO2;
    }

    /**
     * Getter method to return the value of pounds of CO2 (no parameters).
     * @return the number of pounds of CO2.
     */
    public double getPoundsCO2()
    {
        return myPoundsCO2;
    }
}

