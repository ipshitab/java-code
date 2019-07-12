
/**
 * class GameTerrainTester tests all the terrains.
 *
 * @Ipshita Bhatnagar
 * @2/12
 */
public class GameTerrainTester
{
    public static void main(String []args)
    {

        Terrain one =  new Terrain(12, 45);
        Mountain two = new Mountain(13, 15, 7);
        Forest three =  new Forest(24, 16, 11);
        WinterMountain four =  new WinterMountain(40, 10, 13, 15.6);
        Lake five = new Lake(23, 43, 67.3);
        RainForest six = new RainForest(17, 27, 7, 34.2);
        
        // Terrain
        System.out.println("For Terrain one: ");
        System.out.println("Terrain  " + one.getTerrainSize());
        System.out.println();

        // Mountain
        System.out.println("For Mountain two: ");
        System.out.println(" Number of mountains are " + two.getnumMountains() + ", "
        + " Mountain " + two.getTerrainSize());
        	                 
        System.out.println();

        // Forest
        System.out.println("For Forest three: ");
        System.out.println("Number of trees are " + three.getnumTrees()
        + ", Forest " + three.getTerrainSize());
        	     
        System.out.println();

        // Winter Mountain
        System.out.println("For Winter Mountain four: ");
        System.out.println(" Temp is " + four.gettemperature()
        + ", Number of mountains are "  + four.getnumMountains()
        + ", Winter Mountain " + four.getTerrainSize());
                           
        System.out.println();
        
        // Lake
        System.out.println("For Lake five: ");
        System.out.println(" Depth of water is " + five.getdepthOfWater()
        + ", Lake " + five.getTerrainSize());
                           
        System.out.println();
        
        // Rain Forest
        System.out.println("For Rain Forest six: ");
        System.out.println(" Amount of rain is " + six.amountOfRain()
        + ", Number of trees are "  + six.getnumTrees()
        + ", Rain Forest " + six.getTerrainSize());
                           
        System.out.println();
    }
}
