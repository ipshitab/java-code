
/**
 * Class HomeworkTester prints a homework assignment using an abstract 
 * class.
 *
 * @Ipshita Bhatnagar
 * @3/31
 */
public abstract class Homework3 implements Processing
{
    // instance variables - replace the example below with your own
    public int numPages;
    public String typeOfHw;

    /**
     * Constructor for objects of class Homework
     */
    public Homework3()
    {
        // initialize instance variables
        numPages = 0;
        typeOfHw = "none";
    }

    public abstract void set(int numPages);
    
   //getter methods
    public int getnumPages()
    {
        // put your code here
        return numPages;
    }
    
    public String gettypeOfHw()
    {
        // put your code here
        return typeOfHw;
    }
    
    //setter methods
    public void setnumPages(int pages)
    {
        // put your code here
        numPages = pages;
    }
    
    public void settypeOfHw(String type)
    {
        // put your code here
        typeOfHw = type;
    }
    
   public String toString()
    {
        return "The homework type is: " + typeOfHw + "  " + "Number of pages to read: " + numPages;
    }
}
