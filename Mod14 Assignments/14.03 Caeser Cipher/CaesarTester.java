/**
 * Class CaesarTester tests the encoding and decoding.
 *
 * @author Ipshita Bhatnagar
 * @version 3/3
 */
import java.util.Scanner;
public class CaesarTester
{
    public static void main(String []args)
    {
       Scanner in = new Scanner(System.in);
       System.out.println("Input a shift key value from 0-25: ");
       int shift = in.nextInt();
       while (shift > 25 || shift < 0)
       {
           System.out.println("Please pick a valid number");
           System.out.println("Input a shift key value from 0-25: ");
           shift = in.nextInt();
       }
       
       Encryption enc = new Encryption(shift);
       enc.printC();
       
       Decryption dec = new Decryption(shift);
       
       System.out.println();
       System.out.println("Type '1' for encryption, '2' for decryption, any other number to quit: ");
       int input = in.nextInt();
       String inputText = "";
       //encryption
       if (input == 1)
       { 
            System.out.println("Input a plaintext message (enter q to quit): ");
            inputText = in.nextLine();
            inputText = in.nextLine();
            while (!inputText.equals("q"))
            {
               //System.out.println("Input a plaintext message (enter q to quit): ");
               //inputText = in.nextLine();
               System.out.println("The encrypted text is:  ");
               String[] outputText = enc.encrypt(inputText);
               for (int i = 0; i < outputText.length; i++)
               {
                   System.out.print(outputText[i]);
               }
               System.out.println();
               System.out.println("Input a plaintext message (enter q to quit): ");
               inputText = in.nextLine();
            }
       }
       
       //decryption
       if (input == 2)
       { 
            System.out.println("Input a decrypted message (enter q to quit): ");
            inputText = in.nextLine();
            inputText = in.nextLine();
            while (!inputText.equals("q"))
            {
               System.out.println("The plain text is:  ");
               String[] outputText = dec.decrypt(inputText);
               for (int i = 0; i < outputText.length; i++)
               {
                   System.out.print(outputText[i]);
               }
               System.out.println();
               System.out.println("Input a decrypted message (enter q to quit): ");
               inputText = in.nextLine();
            }
       }
    }
}
