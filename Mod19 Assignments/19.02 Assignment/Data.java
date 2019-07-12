/**
 * Write a description of class Data here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Data
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private double[] scores;
    private String grade;
    private double sum = 0;
    private double avg = 0;

    /**
     * Constructor for objects of class Data
     */
    public Data(String firstName, String lastName, double[] scores)
    {
        if (firstName == null)
        {
           String msg = "Error: The first name can not be null";
           throw new IllegalArgumentException(msg);
        }
        
        if (lastName == null)
        {
           String msg = "Error: The last name can not be null";
           throw new IllegalArgumentException(msg);
        }
        
        this.lastName = lastName;
        this.firstName = firstName;
        this.scores = scores;
        this.grade = getLetterGrade(scores);
        
        System.out.print(toString());
    }

    public String getlastName()
    {
        return lastName;
    }

    public void setlastName(String n)
    {
        lastName = n;
    }
    
    public String getfirstName()
    {
        return firstName;
    }

    public void setfirstName(String fN)
    {
        firstName = fN;
    }
    
    public double[] getScores()
    {
        return scores;
    }

    public void setScores(double[] s)
    {
        scores = s;
    }
    
    public String getGrade()
    {
        return grade;
    }

    public void setGrade(String g)
    {
        grade = g;
    }
    
    public String toString()
    {
        String stmt = firstName + " " + lastName + ", scores: ";
        for (int i = 0; i < scores.length; i++)
          stmt = stmt + scores[i] + " ";
        stmt = stmt + ", grade: " + grade;
        return stmt;
    }
    
    public String getLetterGrade(double[] s)
    {
        if (s.length == 0)
        {
           String msg = "Error: There are no scores in the grade list";
           throw new IllegalArgumentException(msg);
        }
        
        for (int i = 0; i < s.length; i++)
        {
            //adding
            sum = sum + s[i];
        }
        avg = sum / s.length;
        if (avg >= 90)
           return "A";
        else if (avg >= 80 && avg < 90)
           return "B";
        else if (avg >= 70 && avg < 80)
           return "C";
        else if (avg >= 60 && avg < 70)
           return "D";
        else
           return "E";
    }
    
    
    
}
