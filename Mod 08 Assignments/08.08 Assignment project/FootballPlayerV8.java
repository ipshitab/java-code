/**
 * class FootballPlayerV8 is an expanded implementation class for an object of my choice.
 *
 * @Ipshita Bhatnagar
 * @12/16
 */
import java.util.Calendar;
public class FootballPlayerV8
{
    private int birthYear;
    private String name;
    private int games;
    private int debYear;
    private int yearsSincePlaying;
   
    /**
     * Constructor for objects of class FootballPlayerV8
     */
    public FootballPlayerV8(int year, int gamePlayed, String nm, int dbyear)
    {
        birthYear = year;
        name = nm;
        games = gamePlayed;
        debYear = dbyear;
        yearsSincePlaying = Calendar.getInstance().get(Calendar.YEAR) - debYear;
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
    
    //getter methods
    public int getGames()
    {
       return games;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getbYear()
    {
        return birthYear;
    }
    
    public int getdebYear()
    {
        return debYear;
    } 
    
    public int getyearsSincePlaying()
    {
        return yearsSincePlaying;
    } 
    
    //setter methods
    public void setGames(int gm)
    {
       games = gm;
    }
    
    public void setName(String nm)
    {
        name = nm;
    }
    
    public void setbYear(int yr)
    {
       birthYear = yr;
    }
    
    //to string method
    public String toString() 
    { 
        return name + " " + games + " " + birthYear + " " + debYear + " " + yearsSincePlaying; 
    } 
}