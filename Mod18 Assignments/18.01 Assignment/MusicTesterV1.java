/**
 * Class MusicTesterV1 creates several sequential search methods and performs the 
 * searches using a collection of music
 *
 * @Ipshita Bhatnagar
 * @4/21
 */
public class MusicTesterV1
{
    public static void main (String[] args)
    {
        Music[] songs = new Music[10];
        
        songs[0] = new Music("Yellow", 2000, "Coldplay");
        songs[1] = new Music("Love Yourself", 2016, "Justin Bieber");
        songs[2] = new Music("Eye Of The Tiger", 1982, "Survivor");
        songs[3] = new Music("when the party is over", 2018, "Billie Eilish");
        songs[4] = new Music("Hurts So Good", 1982, "John Cougar");
        songs[5] = new Music("Viva La Vida", 2008, "Coldplay");
        songs[6] = new Music("Congratulations", 2017, "Post Malone");
        songs[7] = new Music("Hot Stuff", 1979, "Donna Summer");
        songs[8] = new Music("Sunny", 1966, "Bobby Hebb");
        songs[9] = new Music("Just A Dream", 1958, "Jimmy Clanton And His Rockets");
        
        System.out.println("     <<<< List Before Searching >>>> \n");
        printMusic(songs);
        
        System.out.println();
        System.out.println("\n\nSearching for Just A Dream: ");
        findTitle(songs, "Just A Dream");
        
        System.out.println();
        System.out.println("\n\nSearching for Lovely: ");
        findTitle(songs, "Lovely");
        
        System.out.println();
        System.out.println("\n\nSearching for Coldplay: ");
        findArtist(songs, "Coldplay");
        
        System.out.println();
        System.out.println("\n\nSearching for 1982: ");
        findYear(songs, 1982);
    }
    
    //print table
    public static void printMusic(Music[] songs)
    {
        System.out.println("Song                       Year            Artist");
        System.out.println("--------------------------------------------------");
        for(int i = 0; i < songs.length; i++)
            System.out.println(songs[i]);
    }

    public static void findTitle(Music[] songs, String toFind)
    {
        int found = -1;

        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getTitle().compareTo(toFind) == 0)
            {
                found = i;
                break;   //terminates the for loop 
            }
        }
        
        if(found != -1)
        {  
            System.out.println("We found " + toFind + " in the list: ");
            System.out.println(songs[found]);
        }
        else
            System.out.println(toFind + " is not in the list");
    }
   
    public static void findArtist(Music[] songs, String toFind)
    {
        int found = 0;

        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getArtist().compareTo(toFind) == 0)
            {
                System.out.println(songs[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   
            System.out.println(toFind + " is not in the list");
        }
    }
    
    public static void findYear(Music[] songs, int toFind)
    {
        int found = 0;

        for(int i = 0; i < songs.length; i++)
        {
            if(songs[i].getYear() == toFind)
            {
                System.out.println(songs[i]);
                found++;
            }
        }
        
        if(found == 0)
        {   
            System.out.println(toFind + " is not in the list");
        }
    }
}