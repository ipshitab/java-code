/**
 * class FootballPlayerV7 is an implementation class for an object of my choice.
 *
 * @Ipshita Bhatnagar
 * @12/15
 */
import java.util.Calendar;
public class FootballPlayerV7
{
    private int birthYear;
    private String name;
    private int games;
   
    /**
     * Constructor for objects of class FootballPlayerV7
     */
    public FootballPlayerV7(int year, int gamePlayed, String nm)
    {
        birthYear = year;
        name = nm;
        games = gamePlayed;
    }

    public int yearsSinceDebut(int debutYear)
    {
        // year is stored as a static member
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int playingYear = year - debutYear;
        return playingYear;
    }
    
    public int yearsSinceDebut(String debutYear)
    {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int playingYear = year - Integer.parseInt(debutYear);
        return playingYear;
    }
    
    public double avgGamesPlayed(int years)
    {
        return (double)games / years;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getbYear()
    {
        return birthYear;
    }
}
