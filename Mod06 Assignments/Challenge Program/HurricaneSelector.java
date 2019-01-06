
/**
 * Class HurricaneSelector calculates the average category, pressure, and wind speed of 
 * Atlantic hurricanes that have occurred between a given year range.
 *
 * @Ipshita Bhatnagar
 * @11/24/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class HurricaneSelector
{
    public static void main(String[ ] args) throws IOException
    {
        int minC = Integer.MAX_VALUE;
        int maxC = Integer.MIN_VALUE;
        double minP = Integer.MAX_VALUE;
        double maxP = Integer.MIN_VALUE;
        double minW = Integer.MAX_VALUE;
        double maxW = Integer.MIN_VALUE;
        Scanner in = new Scanner(System.in);
        String token = "";
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        PrintWriter outFile = new PrintWriter(new File("hurricanestats.txt"));
        
        // Calculated the number of entries in file by word count/5 780/5 = 156
        // Is there a better way as we need length to initialize array?
        int [] year = new int [156];
        String [] month = new String [156];
        int [] pressureMb = new int [156];
        double [] wspeedMph = new double [156];
        String [] name = new String [156];
        int [] cat = new int [156];
        int i = 0;
        
        while( inFile.hasNextLine() )
        {
            year[i] = inFile.nextInt( );
            month[i] = inFile.next( ); 
            pressureMb[i] = inFile.nextInt( );  
            wspeedMph[i] = inFile.nextInt( )*1.151;
            name[i] = inFile.next( );
            //categories
            if (wspeedMph[i] >= 74 && wspeedMph[i] <= 95)
                cat[i] = 1;
            else if (wspeedMph[i] >= 96 && wspeedMph[i] <= 110)
                cat[i] = 2;
            else if (wspeedMph[i] >= 111 && wspeedMph[i] <= 129)
                cat[i] = 3;
            else if (wspeedMph[i] >= 130 && wspeedMph[i] <= 156)
                cat[i] = 4;
            else
                cat[i] = 5;
            i++;
        }//end while
       /*for (int j = 0; j < 156; j++)
       {
            System.out.println(year[j]);
            System.out.println(month[j]);
            System.out.println(pressureMb[j]);
            System.out.println(wspeedMph[j]);
            System.out.println(name[j]);
            System.out.println(cat[j]);
        }*/
       inFile.close();                 //close input file
       
       //low range
       System.out.println("What is the lowest year range(1995-2015): ");
       int lowRange = in.nextInt();
       while (lowRange < 1995 || lowRange > 2015)
       {    System.out.println("Please enter a year between 1995 and 2015.");
            lowRange = in.nextInt();
        }
       
       //high range
       System.out.println("What is the highest year range(1995-2015): ");
       int highRange = in.nextInt();
        while (highRange < 1995 || highRange > 2015 || lowRange > highRange)
       {    System.out.println("Please enter a year between 1995 and 2015 and make sure it is greater than your low range.");
            highRange = in.nextInt();
        }
       double sumCat = 0; 
       int countCat1 = 0;
       int countCat2 = 0;
       int countCat3 = 0;
       int countCat4 = 0;
       int countCat5 = 0;
       double sumP = 0;
       double sumW = 0;
       int count = 0;
       //System.out.println("                  Hurricanes " + lowRange + " - " + highRange);
       System.out.printf("%30s","Hurricanes");
       System.out.printf("%5d - %4d", lowRange,highRange);
       outFile.println("Hurricanes " + lowRange + " - " + highRange);
       System.out.println();
       System.out.println();
       System.out.printf("%4s%15s%13s%18s%22s","Year","Hurricane","Category","Pressure (mb)"," Wind Speed (mph)"); 
       System.out.println();
       System.out.println("***********************************************************************");
     
       for (int x = 0; x < 156; x++)
       {    
           if (year[x] >= lowRange && year[x] <= highRange)
           {    sumCat += cat[x];
                sumP += pressureMb[x];
                sumW += wspeedMph[x];
                count++;
                if(cat[x] < minC)
                    minC = cat[x];
                if(cat[x] > maxC)
                    maxC = cat[x];
                if(pressureMb[x] < minP)
                    minP = pressureMb[x];
                if(pressureMb[x] > maxP)
                    maxP = pressureMb[x];
                if(wspeedMph[x] < minW)
                    minW = wspeedMph[x];
                if(wspeedMph[x] > maxW)
                    maxW = wspeedMph[x];
                if (cat[x] == 1)
                    countCat1++;
                else if (cat[x] == 2)
                    countCat2++;
                else if (cat[x] == 3)
                    countCat3++;
                else if (cat[x] == 4)
                    countCat4++;
                else if (cat[x] == 5)
                    countCat5++;
                System.out.printf("%4d     %-15s%5d%15d            %3.2f", year[x], name[x], cat[x], pressureMb[x], wspeedMph[x]);
                System.out.println();
            }
       }
       //average
       double avgCat = sumCat/count;
       double avgP = sumP/count;
       double avgW = sumW/count;
       System.out.println("***********************************************************************");
       System.out.printf("%15s%15.2f%15.2f%15.2f","Average:", avgCat, avgP, avgW);
       System.out.println();
       System.out.printf("%15s%15d%15.2f%15.2f","Minimum:", minC, minP, minW);
       System.out.println();
       System.out.printf("%15s%15d%15.2f%15.2f","Maximum:", maxC, maxP, maxW);
       System.out.println();
       System.out.println();
       System.out.println("Summary of Categories:");
       System.out.println(" Cat 1: " + countCat1);
       System.out.println(" Cat 2: " + countCat2);
       System.out.println(" Cat 3: " + countCat3);
       System.out.println(" Cat 4: " + countCat4);
       System.out.println(" Cat 5: " + countCat5);
       
       //summary in file
       outFile.println();
       outFile.println("Summary of Categories:");
       outFile.println(" Cat 1: " + countCat1);
       outFile.println(" Cat 2: " + countCat2);
       outFile.println(" Cat 3: " + countCat3);
       outFile.println(" Cat 4: " + countCat4);
       outFile.println(" Cat 5: " + countCat5);
       outFile.close();
    }
}
