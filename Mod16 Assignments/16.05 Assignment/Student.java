/**
 * Class Student includes methods for students and gradess
 *
 * @Ipshita Bhatnagar
 * @4/20
 */
import java.util.*;
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    double[] myScores; 
    
    /**
     * Constructor for objects of class Student
     */
    public Student(String name, double score1, double score2, double score3, double score4, double score5)
    {
        // initialise instance variables
        myScores = new double[5];
        this.name = name;
        myScores[0] = score1;
        myScores[1] = score2;
        myScores[2] = score3;
        myScores[3] = score4;
        myScores[4] = score5;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getScore(int quizIndex)
    {
        // put your code here
        return myScores[quizIndex];
    }
    
    public void setScore(int quizIndex, double newScore)
    {
       myScores[quizIndex] = newScore;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String n)
    {
        name = n;
    }
    
    public String toString()
    {
        return name + " received the score of: " + myScores;
    }
    
    
    
    
    
}
