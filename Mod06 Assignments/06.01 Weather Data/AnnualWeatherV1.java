/**
 * Annual Weather description:
 * 
 * @author (enter your name)
 * @version (enter today's date)
 *
 */
import java.util.Scanner;
public class AnnualWeatherV1
{
    public static void main (String [ ] args)
    {

        //Declare and initialize variables
        Scanner in = new Scanner(System.in);
        String city = "Vero Beach";
        String state = "FL";
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        double [] temperature ={63.0, 63.9, 67.7, 71.5, 76.2, 80.4, 81.7, 81.6, 80.7, 76.4, 70.5, 64.7};    //initialize with Fahrenheit values
        double [] precipitation ={2.9, 2.5, 4.2, 2.9, 3.8, 6.0, 6.5, 6.0, 6.8, 5.0, 3.0, 2.2};      //initialize with inch values
        
        //test data for West Palm Beach, FL
        //double [] temperature ={66.2, 67.2, 70.6, 73.8, 78.2, 81.2, 82.5, 82.8, 81.7, 78.1, 73.1, 68.3};    //initialize with Fahrenheit values
        //double [] precipitation ={3.8, 2.6, 3.7, 3.6, 5.4, 7.6, 6.0, 6.7, 8.1, 5.5, 5.6, 3.1};      //initialize with inch values
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
    
        double sumTemp = 0.0;
        double sumPre = 0.0;
        //Processing - calculate total temperature and total precipitation
        for( int index = 0; index < temperature.length; index++)
        {
           sumTemp += temperature[index];
        }
        
         for( int index = 0; index < precipitation.length; index++)
        {
           sumPre += precipitation[index];
        }
        //average
        double avgTemp = sumTemp/temperature.length;
        //double avgPre = sumPre/precipitation.length;
        
        //Output: display table of weather data including average and total
        System.out.println();
        System.out.println("           Weather Data");
        System.out.println("      Location: " + city +", " + state);
        System.out.println("Month     Temperature (" +  tempLabel + ")     Precipitation (" + precipLabel + ")");
        System.out.println();
        System.out.println("***************************************************");
        for( int index = 0; index < temperature.length; index++)
        {
            System.out.println(month[index] + "   " + temperature[index] + "   " + precipitation[index]);
        }
        System.out.println("***************************************************");
        System.out.println("Average: " + avgTemp + "    Total: " + sumPre);

    }//end main
}//end class