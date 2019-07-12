/**
 * Class Math calls the Homework constructor and implements the abstract 
 * method
 *
 * @Ipshita Bhatnagar
 * @3/30
 */
public class Math extends Homework
{
    // instance variables - replace the example below with your own
    private int pageCount;
    private String subName;
    
    /**
     * Constructor for objects of class Math
     */
    public Math()
    {
        // initialise instance variables
        super();
    }

    public void set(int numPages)
    {
        pageCount = numPages;
        subName = "Calc";
        super.typeOfHw = "Math";
    }
    
    public String toString()
    {
        return "The homework type is: " + typeOfHw + "  " + "Number of pages to read: " + pageCount;
    }
}