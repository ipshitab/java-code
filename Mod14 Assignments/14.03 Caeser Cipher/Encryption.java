/**
 * Class Encryption encodes a message using a Caesar Shift.
 *
 * @author Ipshita Bhatnagar
 * @version 3/3
 */
public class Encryption
{
    private static String[] Alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private String[] cipherAlphabet = new String[26];
    private int shiftKey;

    /**
     * Constructor for objects of class Encryption
     */
    public Encryption(int key)
    {
        // initialise instance variables
        shiftKey = key;
        generateCipher();
    }
    
    public String[] encrypt(String inputdata)
    {
        String[] encryptText = new String[inputdata.length()];
        String input = inputdata.toLowerCase();
        
        for (int i = 0; i < input.length(); i++)
        {
            int indxfound = -1;
            char mychar = input.charAt(i);
            for (int j = 0; j < 26; j++)
            {
                if (Alphabet[j].equals(String.valueOf(mychar)))
                {
                    indxfound = j;
                    break;
                }
            }
            if (indxfound == -1)
            {
                encryptText[i] = String.valueOf(mychar);
            }
            else
            {
                encryptText[i] = cipherAlphabet[indxfound];
            }
        }
        return encryptText;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */                                                                                                                                                 
    private void generateCipher()
    {
        for (int i = 0; i < 26; i++)
        {
           if (((i + shiftKey) < 26) && ((i + shiftKey) >= 0))
           {
               cipherAlphabet[i] = Alphabet[i + shiftKey];
           }
           else
           {
               cipherAlphabet[i] = Alphabet[(i + shiftKey) - 26];
          }
        }   
    }
    
    public void printC()
    {
        System.out.println("Alphabet: ");
        for (int i = 0; i < 26; i++)
        {
            System.out.print(Alphabet[i]);
        }
        System.out.println();
        System.out.println("Cipher Alphabet: ");
        for (int i = 0; i < 26; i++)
        {
            System.out.print(cipherAlphabet[i]);
        }
    }
}