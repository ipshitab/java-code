/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate. Also, calculates the quantity of souvenirs that 
 * can be purchased based on a particular budget.
 *
 * @Ipshita Bhatnagar
 * @10/01/2018
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        String countryVisited = " ";
        String countryCurrency = " ";
        double startingUsDollars = 6500.00;     // starting US Dollars
        
        countryVisited = "Mexico";
        countryCurrency = "Pesos";
        double pesosSpent = 4567.87;            // Mexican Pesos spent
        double pesoExchangeRate = 18.91;     // 1 US dollar = 18.91 Pesos
        double dollarsSpentInMexico = 0.0;      // US dollars spent in Mexico
        double dollarsAfterMexico = 0.0;        // US dollars remaining after Mexico
        
        //remaining variables below here
        double fijiandollarsSpent = 3784.93;            // Fijian dollars spent
        double fijiandollarsExchangeRate = 2.14;     // 1 US dollar = 18.91 Fijian dollars
        double dollarsSpentInFiji = 0.0;      // US dollars spent in Fiji
        double dollarsAfterFiji = 0.0;
        
       
        double swissSpent = 1323.45;            // Swiss Francs spent
        double swissExchangeRate = 0.97;     // 1 US dollar = 18.91 Swiss Francs
        double dollarsSpentInSwitzerland = 0.0;      // US dollars spent in Switzerland
        double dollarsAfterSwitzerland = 0.0;
        
        
        
        // Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here
        
        // Mexico
         dollarsSpentInMexico = pesosSpent/pesoExchangeRate;
         dollarsAfterMexico = startingUsDollars-dollarsSpentInMexico;
         
        System.out.println("Starting US dollars: " + startingUsDollars);
        System.out.println();
        System.out.println(countryVisited + ": ");
        System.out.println(countryCurrency + " spent: " + pesosSpent);
        System.out.println("US dollars remaining: " + dollarsAfterMexico);
        System.out.println();
        
        //Fiji
        countryVisited = "Fiji";
        countryCurrency = "Fijian Dollars";
        dollarsSpentInFiji = fijiandollarsSpent/fijiandollarsExchangeRate;
        dollarsAfterFiji = dollarsAfterMexico-dollarsSpentInFiji;
         
        System.out.println();
        System.out.println(countryVisited + ": ");
        System.out.println(countryCurrency + " spent: " + fijiandollarsSpent);
        System.out.println("US dollars remaining: " + dollarsAfterFiji);
        System.out.println();
        
        //Switzerland
        countryVisited = "Switzerland";
        countryCurrency = "Swiss Francs";
        dollarsSpentInSwitzerland = swissSpent/swissExchangeRate;
        dollarsAfterSwitzerland = dollarsAfterFiji-dollarsSpentInSwitzerland;
        
        System.out.println();
        System.out.println(countryVisited + ": ");
        System.out.println(countryCurrency + " spent: " + swissSpent);
        System.out.println("US dollars remaining: " + dollarsAfterSwitzerland);
        System.out.println();
        
        System.out.println("*****************************************************");
        System.out.println("Remaining US dollars: " + dollarsAfterSwitzerland);
        System.out.println();
        
        // Complete the code below for Souvenir Purchases
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Souvenir Purchases");
        System.out.println(" (all values in US Dollars) ");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Calculations for Souvenir #1
        int costItem1 = 12;                         //cost per item of first souvenir
        int budget1 = 100;                          //budget for first item
        int totalItems1 = 4;        //how many items can be purchased
        double fundsRemaining1 = 0;  //how much of the budget is left
       
        fundsRemaining1 = budget1 - costItem1*totalItems1;
        System.out.println("Item 1");
        System.out.println("   Cost per item: $" + costItem1 );
        System.out.println("   Budget: $"+ budget1);
        System.out.println("   Total items purchased: " +  totalItems1);
        System.out.println("   Funds remaining: $"  +  fundsRemaining1);
        System.out.println();

        //Calculations for Souvenir #2
        double costItem2 = 29.99;                       //cost per item of second souvenir
        int budget2 = 500;                              //budget for second item
        int totalItems2 = 7;    //how many items can be purchased
        double fundsRemaining2 = 0.0;   //how much of the budget is left
        
        fundsRemaining2 = budget2 - costItem2*totalItems2;
        System.out.println("Item 2");
        System.out.println("   Cost per item: $" + costItem2 );
        System.out.println("   Budget: $"+ budget2);
        System.out.println("   Total items purchased: " +  totalItems2);
        System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

