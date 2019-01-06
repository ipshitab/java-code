/**
 * class FootballPlayerV8Tester is an expansion of my V7 object implementation class and 
 * client class to manage an array of data. It also finds the minimum, maximum, and averages 
 * of values.
 *
 * @Ipshita Bhatnagar
 * @12/16
 */
public class FootballPlayerV8Tester
{
    //main method
    public static void main(String[] args)
    {
        // declaration of variables
        int playingYears;
        double avg;
        //int debut = 1987;
        //int gamesPlayed = 234;
        
        //array of objects
        FootballPlayerV8[] fplayer = new FootballPlayerV8[5];
        fplayer[0] = new FootballPlayerV8(1986,40, "Josh Norman", 2001);
        fplayer[1] = new FootballPlayerV8(1989,50, "Chris Thompson", 2002);
        fplayer[2] = new FootballPlayerV8(1990, 100, "Josh Johnson", 2003);
        fplayer[3] = new FootballPlayerV8(1988, 67, "Alex Smith", 2004);
        fplayer[4] = new FootballPlayerV8(1987, 34, "Jordan Reed", 2005);
        
        //instatiating
        //FootballPlayerV8 joshNorman = new FootballPlayerV8(1987,40, "Josh Norman");
        //FootballPlayerV8 chrisThompson = new FootballPlayerV8(1967,50, "Chris Thompson");
        //FootballPlayerV8 joshJohnson = new FootballPlayerV8(1956, 100, "Josh Johnson");
       
        System.out.printf("%-20s%20s%23s%20s", "Name", "Birth Year", "Years since Debut", "Avg Games");
        System.out.println();
        System.out.println("***************************************************************************************");
        //printing five objects
        for (int i = 0; i <= 4; i++)
        {
            System.out.printf("%-20s%20d", fplayer[i].getName(), fplayer[i].getbYear());
            System.out.printf("%20s%20.2f", fplayer[i].getyearsSincePlaying(), fplayer[i].avgGamesPlayed(fplayer[i].getyearsSincePlaying()));
            System.out.println();
        }
        System.out.println("***************************************************************************************");
        
        //min, max of years since playing and avg
        int minYears = Integer.MAX_VALUE;
        int maxYears = Integer.MIN_VALUE;
        double minAvg = Double.MAX_VALUE;
        double maxAvg = Double.MIN_VALUE;
        double sumYears = 0;
        double sumAvg = 0;
        for(int i = 0; i < fplayer.length; i ++)
        {
            if(fplayer[i].getyearsSincePlaying() < minYears)
                minYears = fplayer[i].getyearsSincePlaying();

            if(fplayer[i].getyearsSincePlaying() > maxYears)
            	maxYears = fplayer[i].getyearsSincePlaying();
            
            if(fplayer[i].avgGamesPlayed(fplayer[i].getyearsSincePlaying()) < minAvg)
                minAvg = fplayer[i].avgGamesPlayed(fplayer[i].getyearsSincePlaying());
                
            if(fplayer[i].avgGamesPlayed(fplayer[i].getyearsSincePlaying()) > maxAvg)
                maxAvg = fplayer[i].avgGamesPlayed(fplayer[i].getyearsSincePlaying());
            
            sumYears += fplayer[i].getyearsSincePlaying();
            sumAvg += fplayer[i].avgGamesPlayed(fplayer[i].getyearsSincePlaying());
        }
        System.out.printf("%55s", "Minimum: ");
        System.out.printf("%3d%20.2f ", minYears, minAvg);
        System.out.println();
        System.out.printf("%55s", "Maximum: ");
        System.out.printf("%3d%20.2f ", maxYears, maxAvg);
        System.out.println();
        System.out.printf("%55s", "Average: ");
        System.out.printf("%3.2f%18.2f ", sumYears/fplayer.length, sumAvg/fplayer.length);
        System.out.println();
    }
}
