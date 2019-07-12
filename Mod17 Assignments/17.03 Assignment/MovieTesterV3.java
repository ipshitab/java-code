/**
 * Class MovieTester lists movies and sorts them based on title, 
 * year created, or movie studio in ascending and descending order.
 *
 * @Ipshita Bhatnagar
 * @4/20
 */
public class MovieTesterV3
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
           
        selectionTitle(movies, 1);

        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< titles in ascending order >>>>\n");
        printMovies(movies);
        
        selectionTitle(movies, 2);

        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< titles in descending order >>>>\n");
        printMovies(movies);
        
        selectionYear(movies, 1);

        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< years in ascending order >>>>\n");
        printMovies(movies);
        
        selectionYear(movies, 2);

        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< years in descending order >>>>\n");
        printMovies(movies);
        
        selectionStudio(movies, 1);

        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< studios in ascending order >>>>\n");
        printMovies(movies);
        
        selectionStudio(movies, 2);

        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< studios in descending order >>>>\n");
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
    //sorting titles, ascending (order = 1) descending (order != 1)
    public static void selectionTitle(Movie[] source, int order)
    {
        int i;
        int k;
        int posMax;
        Movie temp;
        //ascending
        if (order == 1)
        {
            for ( i = source.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    int comp =  source[ k ].getTitle().compareTo(source[ posMax ].getTitle());
                    if (comp > 1)
                    posMax = k;
                }
                // swap the item with the largest cost 
                // with the element in position i
                // now the item is in its proper location
                temp = source[ i ];
                source[ i ] = source[posMax ];
                source[ posMax ] = temp;
            }
        }
        //decending
        else
        {
            for ( i = source.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    int comp =  source[ k ].getTitle().compareTo(source[ posMax ].getTitle());
                    if (comp < 1)
                    posMax = k;
                }
                // swap the item with the largest cost 
                // with the element in position i
                // now the item is in its proper location
                temp = source[ i ];
                source[ i ] = source[posMax ];
                source[ posMax ] = temp;
            }
        }
    }
    
    //sorting years, ascending (order = 1) descending (order != 1)
    public static void selectionYear(Movie[] source, int order)
    {
        int i;
        int k;
        int posMax;
        Movie temp;
        //ascending
        if (order == 1)
        {
            for ( i = source.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( source[ k ].getYear() > source[ posMax ].getYear() )
                        posMax = k;
                    }
                    // swap the item with the largest cost 
                    // with the element in position i
                    // now the item is in its proper location
                    temp = source[ i ];
                    source[ i ] = source[posMax ];
                    source[ posMax ] = temp;
            }
        }
        //descending
        else
        {
            for ( i = source.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( source[ k ].getYear() < source[ posMax ].getYear() )
                        posMax = k;
                    }
                    // swap the item with the largest cost 
                    // with the element in position i
                    // now the item is in its proper location
                    temp = source[ i ];
                    source[ i ] = source[posMax ];
                    source[ posMax ] = temp;
            }
        }
    }
    
    //sorting studios, ascending (order = 1) descending (order != 1)
    public static void selectionStudio(Movie[] source, int order)
    {
        int i;
        int k;
        int posMax;
        Movie temp;
        //ascending
        if (order == 1)
        {
            for ( i = source.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {   
                    int comp =  source[ k ].getStudio().compareTo(source[ posMax ].getStudio());
                    if (comp > 1)
                       posMax = k;
                }
                // swap the item with the largest cost 
                // with the element in position i
                // now the item is in its proper location
                temp = source[ i ];
                source[ i ] = source[posMax ];
                source[ posMax ] = temp;
            }
        }
        //descending
        else
        {
            for ( i = source.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {   
                    int comp =  source[ k ].getStudio().compareTo(source[ posMax ].getStudio());
                    if (comp < 1)
                        posMax = k;
                }
                // swap the item with the largest cost 
                // with the element in position i
                // now the item is in its proper location
                temp = source[ i ];
                source[ i ] = source[posMax ];
                source[ posMax ] = temp;
            }
        }
    }
}