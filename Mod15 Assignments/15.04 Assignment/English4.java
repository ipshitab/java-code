/**
 * Class English calls the Homework constructor and implements the abstract 
 * method
 *
 * @Ipshita Bhatnagar
 * @3/31
 */
public class English4 extends Homework4
{
    // instance variables - replace the example below with your own
    private int pageCount;
    private String subName;
    
    /**
     * Constructor for objects of class English
     */
    public English4()
    {
        // initialise instance variables
        super();
    }

    public void set(int numPages)
    {
        pageCount = numPages;
        subName = "Lit";
        super.typeOfHw = "English";
        super.numPages = numPages;
    }
    
    public String toString()
    {
        return "The homework type is: " + typeOfHw + "  " + "Number of pages to read: " + pageCount;
    }
    
    public void doingHw(int pagesRead)
    {
        pageCount = pageCount - pagesRead;
    }
}