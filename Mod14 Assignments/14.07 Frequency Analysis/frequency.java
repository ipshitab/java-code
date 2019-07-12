/**
 * Class frequency performs a frequency analysis of the letters in a message 
 * and uses the results to decipher a secret message.
 *
 * @Ipshita Bhatnagar
 * @3/23
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class frequency
{
    // instance variables - replace the example below with your own
    private String inputFile;
    private String outputFile;
    private Integer[] countArray = new Integer[26];
    private Double[] percentArray = new Double[26];
    private char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    
    private int charCount = 0;
    
    //array of integer size 26, initialize with '0'
    /**
     * Constructor for objects of class frequency
     */
    public frequency(String inputFile, String outputFile)
    {
        // initialize instance variables
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public void countFreq() throws IOException
    {
        //open inputfile
        File inFile = new File(inputFile);
        Scanner scanner = new Scanner(inFile);
        for(int j = 0; j < 26; j++)
          {
              countArray[j] = 0;
              percentArray[j] = 0.0;
           }
        while(scanner.hasNextLine())
        {
            // read each character, convert it into lowercase
            String line = scanner.nextLine().toLowerCase();
            for(int i = 0; i < line.length(); i++)
            {
                if(line.charAt(i) == 'a')
                    countArray[0]++;
                if(line.charAt(i) == 'b')
                    countArray[1]++;
                    charCount++;
                if(line.charAt(i) == 'c')
                    countArray[2]++;
                if(line.charAt(i) == 'd')
                    countArray[3]++;
                if(line.charAt(i) == 'e')
                    countArray[4]++;
                if(line.charAt(i) == 'f')
                    countArray[5]++;
                if(line.charAt(i) == 'g')
                    countArray[6]++;
                if(line.charAt(i) == 'h')
                    countArray[7]++;
                if(line.charAt(i) == 'i')
                    countArray[8]++;
                if(line.charAt(i) == 'j')
                    countArray[9]++;
                if(line.charAt(i) == 'k')
                    countArray[10]++;
                if(line.charAt(i) == 'l')
                    countArray[11]++;
                if(line.charAt(i) == 'm')
                    countArray[12]++;
                if(line.charAt(i) == 'n')
                    countArray[13]++;
                if(line.charAt(i) == 'o')
                    countArray[14]++;
                if(line.charAt(i) == 'p')
                    countArray[15]++;
                if(line.charAt(i) == 'q')
                    countArray[16]++;
                if(line.charAt(i) == 'r')
                    countArray[17]++;
                if(line.charAt(i) == 's')
                    countArray[18]++;
                if(line.charAt(i) == 't')
                    countArray[19]++;
                if(line.charAt(i) == 'u')
                    countArray[20]++;
                if(line.charAt(i) == 'v')
                    countArray[21]++;
                if(line.charAt(i) == 'w')
                    countArray[22]++;
                if(line.charAt(i) == 'x')
                    countArray[23]++;
                if(line.charAt(i) == 'y')
                    countArray[24]++;
                if(line.charAt(i) == 'z')
                    countArray[25]++;
            }
        }
        scanner.close();
        for (int i = 0; i < 26; i++)
            charCount += countArray[i];
        for (int i = 0; i < 26; i++)
        {
          percentArray[i] = ((countArray[i])/(float)charCount)*100.0;   
        }
    }
    public void printFreq()
    {
      for (int k = 0; k < 26; k++)
      {
          System.out.print(alphabet[k] + " = " + countArray[k] + " -  ");
          System.out.printf("%.2f", percentArray[k]);
          System.out.println("%"); 
       }
    }
    public void writeFile() throws IOException
    {
       PrintWriter outFile = new PrintWriter(new File(outputFile));
        for (int k = 0; k < 26; k++)
       {
        outFile.print(alphabet[k] + " = " + countArray[k] + " -  ");
        outFile.printf("%.2f", percentArray[k]);
        outFile.println("%"); 
       }
       outFile.close ( );    //close the file when finished
    }
}
