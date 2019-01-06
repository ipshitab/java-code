
/**
 * class FootballPlayerV3 is an implementation class for an object of my choice.
 *
 * @Ipshita Bhatnagar
 * @12/9
 */
import java.util.Calendar;
public class FootballPlayerV3
{
    private int birthYear;
    private double salary;
   
    /**
     * Constructor for objects of class FootballPlayerV3
     */
    public FootballPlayerV3()
    {
    }

    public int yearsSinceDebut(int debutYear)
    {
        // year is stored as a static member
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - debutYear;
    }
    
    public double avgGamesPlayed(int games, int years)
    {
        return (double)games / years;
    }
    //main method
    public static void main(String[] args)
    {
        // declaration of variables
        int playingYears;
        double avg;
        int debut = 1987;
        int gamesPlayed = 234;
        
        FootballPlayerV3 joshNorman = new FootballPlayerV3();
        //call methods
        playingYears = joshNorman.yearsSinceDebut(debut);
        avg = joshNorman.avgGamesPlayed(gamesPlayed, playingYears);
        System.out.println("        Josh Norman");
        System.out.println("*********************************");
        System.out.print("  Average Games Played: ");
        System.out.printf("%3.2f", avg);
        System.out.println();
        System.out.println("  Years Since Debut: " + playingYears + " years");
        System.out.println("*********************************");
    }
}
