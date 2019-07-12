/**
 * Class ListTester tests the implementation of the sequential and binary search 
 * algorithms on a collection of contacts
 *
 * @Ipshita Bhatnagar
 * @4/27
 */
import java.util.*;
public class ListTester
{
    public static void main (String[] args) 
   {  
      Contact[] myContacts = new Contact[10];
      myContacts[0] = new Contact("Ipshita Bhatnagar", "aunt", "July 8", "240-987-2378", "ipshita.bh@yahoo.com");
      myContacts[1] = new Contact("Chloe Wilson", "sister", "October 5", "240-345-1289", "chloe.wil@yahoo.com");
      myContacts[2] = new Contact("Adam Kolb", "brother", "September 17", "240-409-2383", "adam.ko@yahoo.com");
      myContacts[3] = new Contact("Serena McDonald", "cousin", "July 8", "301-515-6728", "serena.mcD@gmail.com");
      myContacts[4] = new Contact("Lorayn Aponte", "aunt", "January 12", "240-555-4443", "lorayn.ap@yahoo.com");
      myContacts[5] = new Contact("Dot Dover", "sister", "December 21", "301-252-6678", "dot.dover@gmail.com");
      myContacts[6] = new Contact("Brooke Boyland", "aunt", "June 30", "240-123-8678", "brooke.boy@yahoo.com");
      myContacts[7] = new Contact("Chase Singer", "dad", "April 19", "240-231-9085", "chase.si@yahoo.com");
      myContacts[8] = new Contact("Rileigh Hull", "cousin", "August 11", "240-987-8378", "ri.hull@hotmsil.com");
      myContacts[9] = new Contact("Peter Kelly", "uncle", "November 18", "301-423-3588", "p.kelly@yahoo.com");
      
      System.out.println("     <<<< List Before Sorting >>>> \n");
      printList(myContacts);
        
      System.out.println("\n   <<<< After Sorting >>>>");
      System.out.println("<<<< names in ascending order >>>>\n");
      sortName(myContacts);
      printList(myContacts);
      System.out.println();
        
      int test = binarySearchName(myContacts, "Peter Kelly");
      if(test != -1)
          System.out.println("Found: " + myContacts[test]);
      else
          System.out.println("Not found. " );
            
      System.out.println();
      
      test = binarySearchName(myContacts, "Ryan Bass");
      if(test != -1)
          System.out.println("Found: " + myContacts[test]);
      else
          System.out.println("Ryan Bass not found. " );
            
      System.out.println();
      
      System.out.println("\n   <<<< After Sorting >>>>");
      System.out.println("<<<< relaionships in ascending order >>>>\n");
      sortRelation(myContacts);
      printList(myContacts);
      System.out.println();
      
      test = binarySearchRelation(myContacts, "aunt");
      if(test != -1)
          System.out.println("Found: " + myContacts[test]);
      else
          System.out.println("Not found. " );
          
      System.out.println();
      
      test = binarySearchRelation(myContacts, "mom");
      if(test != -1)
          System.out.println("Found: " + myContacts[test]);
      else
          System.out.println("mom not found. " );
          
      System.out.println();
          
      System.out.println("\n\nSearching for July 8: ");
      findBday(myContacts, "July 8");
      
      System.out.println();
      
      System.out.println("\n\nSearching for July 9: ");
      findBday(myContacts, "July 9");
      
      System.out.println();
          
      System.out.println("\n\nSearching for 240-409-2383: ");
      findNum(myContacts, "240-409-2383");
      
      System.out.println();
      
      System.out.println("\n\nSearching for 240-904-6783: ");
      findNum(myContacts, "240-904-6783");
      
      System.out.println();
          
      System.out.println("\n\nSearching for lorayn.ap@yahoo.com: ");
      findEmail(myContacts, "lorayn.ap@yahoo.com");
      
      System.out.println();
      
      System.out.println("\n\nSearching for lorayn.aponte@gmail.com: ");
      findEmail(myContacts, "lorayn.aponte@gmail.com");
   } 
   
   public static void printList(Contact[] itemList) 
   {
       for(Contact item: itemList)
           System.out.println(item);
   }
   
   //selection
   //sort by name
   public static void sortName(Contact[] source)
   {
       int i;
       int k;
       int posMax;
       Contact temp;

       for( i = source.length - 1 ; i >= 0 ; i-- )
       {
           // find largest element in the i elements
           posMax = 0;
           for( k = 0 ; k <= i ; k++ )
           {
               if(source[k].getentryName().compareTo(source[posMax].getentryName()) > 0 )
                   posMax = k;
           }

           temp = source[ i ];
           source[ i ] = source[posMax ];
           source[ posMax ] = temp;
       }
   }   
        
   //title binary search
   public static int binarySearchName(Contact[] songs, String toFind)
   {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if(songs[probe].getentryName().compareTo(toFind) > 0)
               high = probe;
            else
               low = probe;
            }
        
        if( (low >= 0) && (songs[low].getentryName().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;       
   }
   
   //selection
   //sort by relationship
   public static void sortRelation(Contact[] source)
   {
       int i;
       int k;
       int posMax;
       Contact temp;

       for( i = source.length - 1 ; i >= 0 ; i-- )
       {
           // find largest element in the i elements
           posMax = 0;
           for( k = 0 ; k <= i ; k++ )
           {
               if(source[k].getRelation().compareTo(source[posMax].getRelation()) > 0 )
                   posMax = k;
           }

           temp = source[ i ];
           source[ i ] = source[posMax ];
           source[ posMax ] = temp;
       }
   }   
        
   //title binary search
   public static int binarySearchRelation(Contact[] myContacts, String toFind)
   {
        int high = myContacts.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if(myContacts[probe].getRelation().compareTo(toFind) > 0)
               high = probe;
            else
               low = probe;
            }
        
        if( (low >= 0) && (myContacts[low].getRelation().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;       
   }
   
   //sequential search for birthdays
   public static void findBday(Contact[] myContacts, String toFind)
    {
        int found = -1;

        for(int i = 0; i < myContacts.length; i++)
        {
            if(myContacts[i].getBirthday().compareTo(toFind) == 0)
            {
                found = i;
                break;   //terminates the for loop 
            }
        }
        
        if(found != -1)
        {  // we have found the person
            System.out.println("We found " + toFind + " in the roster: ");
            System.out.println(myContacts[found]);
        }
        else
            System.out.println(toFind + " is not in the roster");
    }
   
   //sequential search for number
   public static void findNum(Contact[] myContacts, String toFind)
    {
        int found = -1;

        for(int i = 0; i < myContacts.length; i++)
        {
            if(myContacts[i].getNumber().compareTo(toFind) == 0)
            {
                found = i;
                break;   //terminates the for loop 
            }
        }
        
        if(found != -1)
        {  // we have found the person
            System.out.println("We found " + toFind + " in the roster: ");
            System.out.println(myContacts[found]);
        }
        else
            System.out.println(toFind + " is not in the roster");
    }
    
   //sequential search for email
   public static void findEmail(Contact[] myContacts, String toFind)
    {
        int found = -1;

        for(int i = 0; i < myContacts.length; i++)
        {
            if(myContacts[i].getEmail().compareTo(toFind) == 0)
            {
                found = i;
                break;   //terminates the for loop 
            }
        }
        
        if(found != -1)
        {  // we have found the person
            System.out.println("We found " + toFind + " in the roster: ");
            System.out.println(myContacts[found]);
        }
        else
            System.out.println(toFind + " is not in the roster");
    }
}