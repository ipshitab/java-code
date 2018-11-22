
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Charles Babbage (replace with your name)
 * @version 06/11/17       (replace with today's date)
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;
        // Addition
        System.out.println("Addition");
        System.out.println( iNum1 + " + " + iNum2 + " = " + (iNum1+iNum2) );
        System.out.println( "43.21 + 3.14 + 10.0 = " + (43.21+3.14+10.0) );
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println( iNum3 +" - " + iNum2 + " - " + iNum1 + " = " + (iNum3-iNum2-iNum1) );
        System.out.println( "3.14 - 10.0 = " + (3.14-10.0) );
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println( iNum1 + " * " + iNum2 + " = " + (iNum1*iNum2) ); 
        System.out.println("3.14 * 10.0 * 10.0 = " + (3.14*10.0*10.0) );
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println( iNum2 + " / " + iNum1 + " = " + (iNum2/iNum1) );
        System.out.println( "43.21 / 10.0 = " + (43.21/10.0) );
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println( iNum3 + " % " + iNum2 + " = " + (iNum3%iNum2) );
        System.out.println( "10.0 % 3.14 = " + (10.0%3.14) );
        //System.out.println();
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class
