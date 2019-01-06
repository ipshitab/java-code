
/**
 * class FootballPlayerV7 is an implementation class tester for an object of my choice.
 *
 * @Ipshita Bhatnagar
 * @12/15
 */
public class FootballPlayerV7Tester
{
    //main method
    public static void main(String[] args)
    {
        // declaration of variables
        int playingYears;
        double avg;
        //int debut = 1987;
        //int gamesPlayed = 234;
        
        //instatiating
        FootballPlayerV7 joshNorman = new FootballPlayerV7(1987,40, "Josh Norman");
        FootballPlayerV7 chrisThompson = new FootballPlayerV7(1967,50, "Chris Thompson");
        FootballPlayerV7 joshJohnson = new FootballPlayerV7(1956, 100, "Josh Johnson");
        
        System.out.printf("%-20s%20s%23s%20s", "Name", "Birth Year", "Years since Debut", "Avg Games");
        System.out.println();
        System.out.println("***************************************************************************************");
        //josh n
        System.out.printf("%-20s%20d", joshNorman.getName(), joshNorman.getbYear());
        System.out.printf("%20s%20.2f", joshNorman.yearsSinceDebut(2003), joshNorman.avgGamesPlayed(joshNorman.yearsSinceDebut(2003)));
        System.out.println();
        //chris
        System.out.printf("%-20s%20d", chrisThompson.getName(), chrisThompson.getbYear());
        System.out.printf("%20s%20.2f", chrisThompson.yearsSinceDebut("2007"), chrisThompson.avgGamesPlayed(chrisThompson.yearsSinceDebut("2007")));
        System.out.println();
        //josh j
        System.out.printf("%-20s%20d", joshJohnson.getName(), joshJohnson.getbYear());
        System.out.printf("%20s%20.2f", joshJohnson.yearsSinceDebut(2009), joshJohnson.avgGamesPlayed(joshJohnson.yearsSinceDebut(2009)));
    }
}

