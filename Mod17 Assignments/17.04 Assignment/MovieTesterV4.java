/**
 * Class MovieTester lists movies and sorts them based on title, 
 * year created, or movie studio in ascending and descending order.
 *
 * @Ipshita Bhatnagar
 * @4/20
 */
public class MovieTesterV4
{
    public static void main(String[] args)
      { 
        MovieV4[] movies = new MovieV4[10];
        movies[0] = new MovieV4("Lady and the Tramp", 1955, "Disney");
        movies[1] = new MovieV4("King Kong", 2005, "Universal Studios");
        movies[2] = new MovieV4("Peter Pan", 1953, "Disney");
        movies[3] = new MovieV4("The Lost City", 1920, "Warner Bros.");
        movies[4] = new MovieV4("The Beautiful and Damned", 1922, "Warner Bros.");
        movies[5] = new MovieV4("Jurassic World", 2015, "Universal Studios");
        movies[6] = new MovieV4("Fantasia", 1940, "Disney");
        movies[7] = new MovieV4("Furious 7", 2015, "Universal Studios");
        movies[8] = new MovieV4("Ted", 2012, "Universal Studios");
        movies[9] = new MovieV4("Heroes of the Street", 1922, "Warner Bros.");
        
        System.out.println("     <<<< List Before Sorting >>>> \n");
        printMovies(movies);
        
        mergeTitle(movies, 0, movies.length-1);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< titles in ascending order >>>>\n");
        printMovies(movies);
        
        System.out.println();
        
        mergeYears(movies, 0, movies.length-1);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< years in ascending order >>>>\n");
        printMovies(movies);
        
        System.out.println();
        
        mergeStudios(movies, 0, movies.length-1);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< studios in ascending order >>>>\n");
        printMovies(movies);
      }
      
    //method to print
    public static void printMovies(MovieV4[] list)
    {
        System.out.println(" Movies                        Year   Studio       ");
        System.out.println("**********************************************");
        for(int i = 0; i < list.length; i++)
            System.out.println( list[i] );
    }
        
    //methods
    //merging titles, ascending (order = 1)
    public static void mergeTitle(MovieV4[] a, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeTitle( a, low, mid);       // recursive call
        mergeTitle( a, mid + 1, high);   // recursive call
                
        merge( a, low, mid, high);
    }
    
    public static void merge(MovieV4[] a, int low, int mid, int high)
    {
        MovieV4[] temp = new MovieV4[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;
        //System.out.println("low = "+ low + " mid = "+ mid + " high = "+ high);
        //System.out.println(" i = "+ i + " j = "+ j );
        //System.out.println("a[i] Title is : "+ a[ i ].getTitle());
        //System.out.println("a[j] Title is : "+ a[j].getTitle());
        int comp = a[ i ].getTitle().compareTo(a[ j ].getTitle());
        //System.out.println(" comp is = "+ comp);

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if( comp < 0)
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            //System.out.println(" tmp["+n+"] = "+ temp[n]);
            n++;
         }

        for( int k = low ; k <= high ; k++ ){
               a[ k ] = temp[ k - low ];
                //System.out.println(" new a["+k+"] =  " + a[k]);
         }
    }
   
    
    //merging years
    public static void mergeYears(MovieV4[] a, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeYears( a, low, mid );       // recursive call
        mergeYears( a, mid + 1, high);   // recursive call
                
        merge( a, low, mid, high);
    }
    
     public static void mergeYears(MovieV4[] a, int low, int mid, int high )
    {
        MovieV4[] temp = new MovieV4[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if( a[ i ].getYear() < a[ j ].getYear() )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            n++;
        }
    }
    
    //merging studios
    public static void mergeStudios(MovieV4[] a, int low, int high)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeTitle( a, low, mid);       // recursive call
        mergeTitle( a, mid + 1, high);   // recursive call
                
        merge( a, low, mid, high);
    }
    
    public static void mergeStudios(MovieV4[] a, int low, int mid, int high)
    {
        MovieV4[] temp = new MovieV4[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;
        //System.out.println("low = "+ low + " mid = "+ mid + " high = "+ high);
        //System.out.println(" i = "+ i + " j = "+ j );
        //System.out.println("a[i] Title is : "+ a[ i ].getTitle());
        //System.out.println("a[j] Title is : "+ a[j].getTitle());
        int comp = a[ i ].getStudio().compareTo(a[ j ].getStudio());
        //System.out.println(" comp is = "+ comp);

        while( i <= mid || j <= high )
        {
            if( i > mid )
            {
                temp[ n ] = a[ j ];
                j++;
            }
            else if( j > high )
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else if( comp < 0)
            {
                temp[ n ] = a[ i ];
                i++;
            }
            else
            {
                temp[ n ] = a[ j ];
                j++;
            }
            //System.out.println(" tmp["+n+"] = "+ temp[n]);
            n++;
         }

        for( int k = low ; k <= high ; k++ ){
               a[ k ] = temp[ k - low ];
                //System.out.println(" new a["+k+"] =  " + a[k]);
         }
    }
}