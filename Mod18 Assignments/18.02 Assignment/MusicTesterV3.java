/**
 * Class MusicTesterV3 creates several sequential search methods and performs the 
 * searches using a collection of music
 *
 * @Ipshita Bhatnagar
 * @4/21
 */
public class MusicTesterV3
{
    public static void main (String[] args)
    {
        MusicV3[] songs = new MusicV3[10];
        
        songs[0] = new MusicV3("Yellow", 2000, "Coldplay");
        songs[1] = new MusicV3("Love Yourself", 2016, "Justin Bieber");
        songs[2] = new MusicV3("Eye Of The Tiger", 1982, "Survivor");
        songs[3] = new MusicV3("when the party is over", 2018, "Billie Eilish");
        songs[4] = new MusicV3("Hurts So Good", 1982, "John Cougar");
        songs[5] = new MusicV3("Viva La Vida", 2008, "Coldplay");
        songs[6] = new MusicV3("Congratulations", 2017, "Post Malone");
        songs[7] = new MusicV3("Hot Stuff", 1979, "Donna Summer");
        songs[8] = new MusicV3("Sunny", 1966, "Bobby Hebb");
        songs[9] = new MusicV3("Just A Dream", 1958, "Jimmy Clanton And His Rockets");
        
        System.out.println("     <<<< List Before Sorting >>>> \n");
        printMusic(songs);
        
        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< titles in ascending order >>>>\n");
        sortTitle(songs);
        printMusic(songs);
        System.out.println();
        
        int test = binarySearchTitle(songs, "Just A Dream");
        if(test != -1)
            System.out.println("Found: " + songs[test]);
        else
            System.out.println("Not found. " );
            
        System.out.println();
        
        test = binarySearchTitle(songs, "Capo");
        if(test != -1)
            System.out.println("Found: " + songs[test]);
        else
            System.out.println("Capo: Not found. " );
            
        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< years in ascending order >>>>\n");
        sortYear(songs);
        printMusic(songs);
        System.out.println();
           
        test = binarySearchYear(songs, 1982);
        if(test != -1)
            System.out.println("Found: " + songs[test]);
        else
            System.out.println("Not found. " );
            
        System.out.println();
        
        test = binarySearchYear(songs, 2020);
        if(test != -1)
            System.out.println("Found: " + songs[test]);
        else
            System.out.println("2020: Not found. " );
          
        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< artist in ascending order >>>>\n");
        sortArtist(songs);
        printMusic(songs);   
        System.out.println();
            
        test = binarySearchArtist(songs, "Coldplay");
        if(test != -1)
            System.out.println("Found: " + songs[test]);
        else
            System.out.println("Not found. " );
            
        System.out.println();
        
        test = binarySearchArtist(songs, "NLE Choppa");
        if(test != -1)
            System.out.println("Found: " + songs[test]);
        else
            System.out.println("NLE Choppa: Not found. " );   
    }
    
    //print table
    public static void printMusic(MusicV3[] songs)
    {
        System.out.println("Song                       Year            Artist");
        System.out.println("--------------------------------------------------");
        for(int i = 0; i < songs.length; i++)
            System.out.println(songs[i]);
    }

    //selection
    //sort by title
    public static void sortTitle(MusicV3[] source)
    {
        int i;
        int k;
        int posMax;
        MusicV3 temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getTitle().compareTo(source[posMax].getTitle()) > 0 )
                    posMax = k;
            }

            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
        }
    }   
        
  
   //title binary search
   public static int binarySearchTitle(MusicV3[] songs, String toFind)
   {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if(songs[probe].getTitle().compareTo(toFind) > 0)
               high = probe;
            else
               low = probe;
            }
        
        if( (low >= 0) && (songs[low].getTitle().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;       
   }
   
   //selection
   //sort by year
    public static void sortYear(MusicV3[] source)
    {
        int i;
        int k;
        int posMax;
        MusicV3 temp;
        //ascending
        
        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                if ( source[ k ].getYear() > source[ posMax ].getYear() )
                        posMax = k;
            }
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
        }
    }
    
   //year binary search
   public static int binarySearchYear(MusicV3[] songs, int toFind)
   {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if(songs[probe].getYear() > toFind)
               high = probe;
            else
               low = probe;
            }
        
        if( (low >= 0) && (songs[low].getYear() == toFind ))
            return low;
        else
            return -1;       
   }
   
    //selection
    //sort by artist
    public static void sortArtist(MusicV3[] source)
    {
        int i;
        int k;
        int posMax;
        MusicV3 temp;

        for( i = source.length - 1 ; i >= 0 ; i-- )
        {
            // find largest element in the i elements
            posMax = 0;
            for( k = 0 ; k <= i ; k++ )
            {
                if(source[k].getArtist().compareTo(source[posMax].getArtist()) > 0 )
                    posMax = k;
            }

            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
        }
    }   
        
  
   //artist binary search
   public static int binarySearchArtist(MusicV3[] songs, String toFind)
   {
        int high = songs.length;
        int low = -1;
        int probe;

        while( high - low > 1 )
        {
            probe = ( high + low ) / 2;
            if(songs[probe].getArtist().compareTo(toFind) > 0)
               high = probe;
            else
               low = probe;
            }
        
        if( (low >= 0) && (songs[low].getArtist().compareTo(toFind) == 0 ))
            return low;
        else
            return -1;       
   }
}