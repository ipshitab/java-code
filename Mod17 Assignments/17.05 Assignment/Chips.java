/**
 * Class Chips helps keep inventory of a product
 *
 * @Ipshita Bhatnagar
 * @4/21
 */
public class Chips
{
    // instance variables - replace the example below with your own
    private String name;
    private int productNum;
    private double price;
    private int quantity; 

    /**
     * Constructor for objects of class Chips
     */
    public Chips(String name, int productNum, double price, int quantity)
    {
        // initialise instance variables
        this.name = name;
        this.productNum = productNum;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getproductNum()
    {
        return productNum;
    }
    
    public void setproductNum(int productNum)
    {
        this.productNum = productNum;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    public String toString()
    {
        String str = String.format("%-20s %4d %10.2f %10d", name, productNum, price, quantity);
        return str;
    }
}