/**
 * Class ChipsTester keeps inventory of a product and prints it in various 
 * ways
 *
 * @Ipshita Bhatnagar
 * @4/21
 */
public class ChipsTester
{
    public static void main(String[] args)
    {
        Chips[] snacks = new Chips[10];
        snacks[0] = new Chips("Barbeque", 234, 12.3, 110);
        snacks[1] = new Chips("Sour Cream & Onion", 235, 15.7, 100);
        snacks[2] = new Chips("Dill Pickle", 236, 11.47, 200);
        snacks[3] = new Chips("Salt and Vinegar", 237, 15, 67);
        snacks[4] = new Chips("Jalapeno", 238, 12, 90);
        snacks[5] = new Chips("Cool Ranch Doritos", 239, 17, 117);
        snacks[6] = new Chips("Lay's Original", 240, 8.2, 71);
        snacks[7] = new Chips("Sun Chips", 241, 9.43, 234);
        snacks[8] = new Chips("Cheetos", 242, 10.9, 123);
        snacks[9] = new Chips("Onion Rings", 243, 18, 260);
        
        System.out.println("     <<<< List Before Sorting >>>> \n");
        printChips(snacks);
        
        //selection sort
        selectionproductNum(snacks, 1);

        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< product number in ascending order >>>>\n");
        printChips(snacks);
        
        //selection sort
        selectionproductNum(snacks, 2);

        System.out.println("\n   <<<< After Sorting >>>>");
        System.out.println("<<<< product number in descending order >>>>\n");
        printChips(snacks);
        
        //insertion sort
        snacks = insertionName(snacks, 1);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< chips in ascending order >>>>\n");
        printChips(snacks);
        
        //insertion sort
        snacks = insertionName(snacks, 2);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< chips in descending order >>>>\n");
        printChips(snacks);
        
        //merge sort
        mergeSort(snacks, 0, snacks.length-1, 1);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< price in ascending order >>>>\n");
        printChips(snacks);
        
        //merge sort
        mergeSort(snacks, 0, snacks.length-1, 2);

        System.out.println("\n     <<<< After Sorting >>>>");
        System.out.println("<<<< price in descending order >>>>\n");
        printChips(snacks);
    }

    //method to print
    public static void printChips(Chips[] list)
    {
        System.out.println(" Chips          Product Number    Price   Quantity");
        System.out.println("**************************************************");
        for(int i = 0; i < list.length; i++)
            System.out.println( list[i] );
    }
    
    //sorting product number, ascending (order = 1) descending (order != 1)
    //selection sort
    public static void selectionproductNum(Chips[] source, int order)
    {
        int i;
        int k;
        int posMax;
        Chips temp;
        //ascending
        if (order == 1)
        {
            for ( i = source.length - 1 ; i >= 0 ; i-- )
            {
                // find largest element in the i elements
                posMax = 0;
                for ( k = 0 ; k <= i ; k++ )
                {
                    if ( source[ k ].getproductNum() > source[ posMax ].getproductNum() )
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
                    if ( source[ k ].getproductNum() < source[ posMax ].getproductNum() )
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
    
    //ascending (order = 1) & descending (order != 1) order for product name
    //insertion sort
    public static Chips[] insertionName(Chips[] source, int order)
    {
        Chips[] dest = new Chips[ source.length ];
        
        //ascending
        if (order == 1)
        {
            for( int i = 0 ; i < source.length ; i++ )
            {
                Chips next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getName().compareTo( dest[k-1].getName() ) > 0 )
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
                Chips next = source[ i ];
                int insertIndex = 0;
                int k = i;
                while( k > 0 && insertIndex == 0 )
                {
                    if( next.getName().compareTo( dest[k-1].getName() ) < 0 )
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
    
    //ascending (order = 1) & descending (order != 1) order for price
    //merge sort
    public static void mergeSort(Chips[] a, int low, int high, int order)
    {
        if( low == high )
            return;

        int mid = ( low + high ) / 2;

        mergeSort( a, low, mid, order );       // recursive call
        mergeSort( a, mid + 1, high, order);   // recursive call
       
        merge( a, low, mid, high, order);
    }
    
    public static void merge( Chips[] a, int low, int mid, int high, int order)
    {
        Chips[] temp = new Chips[ high - low + 1 ];

        int i = low, j = mid + 1, n = 0;
        
        //ascending
        if (order == 1)
        {
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
                else if( a[ i ].getPrice() < a[ j ].getPrice() )
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

            for( int k = low ; k <= high ; k++ )
                a[ k ] = temp[ k - low ];
        } 
        //descending
        else
        {
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
                else if( a[ i ].getPrice() > a[ j ].getPrice() )
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

            for( int k = low ; k <= high ; k++ )
                a[ k ] = temp[ k - low ];
        }    
    }
}