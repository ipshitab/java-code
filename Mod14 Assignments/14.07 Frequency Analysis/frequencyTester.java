/**
 * Class frequencyTester tests the performance of the frequency analysis of the 
 * letters in a message and tests the results to decipher a secret message.
 *
 * @Ipshita Bhatnagar
 * @3/23
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class frequencyTester
{
     public static void main(String[] args) throws IOException
   {
      //getting input from user
      Scanner in = new Scanner(System.in);
      System.out.println("Enter the name of the input file: ");
      String inputName = in.nextLine();
      String outputName = inputName + "Freq.txt";
      inputName += ".txt";
      frequency myFreq = new frequency(inputName, outputName);
      //PrintWriter outFile = new PrintWriter(new File(outputName));
      myFreq.countFreq();
      myFreq.printFreq();
      myFreq.writeFile();
   }
}
