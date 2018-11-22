
/**
 * Class Family calculates the probability whether a family with two children 
 * will consist of two boys, a boy and a girl, or two girls.
 *
 * @Ipshita Bhatnagar
 * @11/4/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        int countbb = 0;
        int countgg = 0;
        int countbg = 0;
        int total = 0;
        
        String token = "";
        File fileName = new File("maleFemaleInFamily.txt");
        Scanner inFile = new Scanner(fileName);

        //while loop will continue while inFile has a next token to read
        while( inFile.hasNextLine() )
        {
            token = inFile.nextLine( ).toUpperCase();//read next token from file
            if (token.equals("BB"))
                countbb++;
            else if (token.equals("GG"))
                countgg++;
            else if (token.equals("GB") || (token.equals("BG")))
                countbg++;
        }//end while
        inFile.close();
        
        total = countbb + countgg + countbg;
        
        double perbb = (((double)countbb)/total)*100;
        double pergg = (((double)countgg/total)*100);
        double perbg = (((double)countbg/total)*100);
        
        System.out.println("Composition statistics for families with two children.");
        System.out.println();
        System.out.println("Total number of families: " + total);
        System.out.println();
        System.out.println("Number of familes with");
        System.out.println("2 boys: " + countbb + " represents " + perbb + "%");
        System.out.println("2 girls: " + countgg + " represents " + pergg + "%");
        System.out.println("1 boy and 1 girl: " + countbg + " represents " + perbg + "%");
    }
}
