/**
 * Class MovieTester lists movies and sorts them based on title, 
 * year created, or movie studio in ascending and descending order.
 *
 * @Ipshita Bhatnagar
 * @4/20
 */
public class MovieTester
{
    public static void main(String[] args)
      { 
        Movie[] movies = new Movie[10];
        movies[0] = new Movie("Lady and the Tramp", 1955, "Disney");
        movies[1] = new Movie("King Kong", 2005, "Universal Studios");
        movies[2] = new Movie("Peter Pan", 1953, "Disney");
        movies[3] = new Movie("The Lost City", 1920, "Warner Bros.");
        movies[4] = new Movie("The Beautiful and Damned", 1922, "Warner Bros.");
        movies[5] = new Movie("Jurassic World", 2015, "Universal Studios");
        movies[6] = new Movie("Fantasia", 1940, "Disney");
        movies[7] = new Movie("Furious 7", 2015, "Universal Studios");
        movies[8] = new Movie("Ted", 2012, "Universal Studios");
        movies[9] = new Movie("Heroes of the Street", 1922, "Warner Bros.");
        
        System.out.println("     <<<< List Before Sorting >>>> \n");
        printMovies(movies);
            
        movies = insertionMovie(movies, 1);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by movies in ascending order >>>>\n");
        printMovies(movies);
            
        movies = insertionMovie(movies, 2);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by movies in descending order >>>>\n");
        printMovies(movies);
            
        movies = insertionYear(movies, 2);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year in descending order  >>>>\n");
        printMovies(movies);
        
        movies = insertionYear(movies, 1);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by year in ascending order  >>>>\n");
        printMovies(movies);
            
        movies = insertionStudio(movies, 1);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio in ascending order  >>>>\n");
        printMovies(movies);
            
        movies = insertionStudio(movies, 2);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< by studio in descending order  >>>>\n");
        printMovies(movies);
      }
      
    //method to print
    public static void printMovies(Movie[] list)
    {
        System.out.println(" Movies                        Year   Studio       ");
        System.out.println("**********************************************");
        for(int i = 0; i < list.length; i++)
            System.out.println( list[i] );
    }
        
    //methods
    //ascending (order = 1) & descending (order != 1) order for movies
    public static Movie[] insertionMovie(Movie[] source, int order)
    {
        Movie[] dest = new Movie[ source.length ];
        
        //ascending
        if (order == 1)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getTitle().compareTo( dest[k-1].getTitle() ) > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }   
                dest[ insertIndex ] = next;
            }
        }
        //descending
        else
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getTitle().compareTo( dest[k-1].getTitle() ) < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
                dest[ insertIndex ] = next;
            }
        }
        return dest;
    }
    
    //ascending (order = 1) & descending (order != 1) order for years
    public static Movie[] insertionYear(Movie[] source, int order)
    {
        Movie[] dest = new Movie[ source.length ];
        
        //descending
        if (order == 2)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if(next.getYear() < dest[k-1].getYear() )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
                dest[ insertIndex ] = next;
            }
        }
        //ascending
        else
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if(next.getYear() > dest[k-1].getYear() )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
                dest[ insertIndex ] = next;
            }
        }
        return dest;
    }
    
    //ascending (order = 1) & descending (order != 1) order for studios
    public static Movie[] insertionStudio(Movie[] source, int order)
    {
        Movie[] dest = new Movie[ source.length ];
        
        //ascending
        if (order == 1)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getStudio().compareTo( dest[k-1].getStudio() ) > 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }
                dest[ insertIndex ] = next;
            }
            return dest;
        }
        //descending
        else
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Movie next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getStudio().compareTo( dest[k-1].getStudio() ) < 0 )
                    {
                        insertIndex = k;
                    }
                    else
                    {
                        dest[ k ] = dest[ k - 1 ];
                    }
                    k--;
                }   
                dest[ insertIndex ] = next;
            }
        }
        return dest;
    }
}