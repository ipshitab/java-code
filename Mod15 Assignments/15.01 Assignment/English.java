/**
 * Class English calls the Homework constructor and implements the abstract 
 * method
 *
 * @Ipshita Bhatnagar
 * @3/30
 */
public class English extends Homework
{
    // instance variables - replace the example below with your own
    private int pageCount;
    private String subName;
    
    /**
     * Constructor for objects of class English
     */
    public English()
    {
        // initialise instance variables
        super();
    }

    public void set(int numPages)
    {
        pageCount = numPages;
        subName = "Lit";
        super.typeOfHw = "English";
    }
    
    public String toString()
    {
        return "The homework type is: " + typeOfHw + "  " + "Number of pages to read: " + pageCount;
    }
}