
/**
 * Class Pineapples calculates the trajectory of a projectile based on launch 
 * angles and launch velocities
 *
 * @Ipshita Bhatnagar
 * @12/28
 */
public class Pineapples
{
    public void Pineapples()
    {
        
    }
    
    //this method calculates the trajectory distance based on speed and angle
    public double calcDistance(double speedMPH, double angleDegrees)
    {
        // miles per hour to meters per second
        double speedMps = speedMPH*0.447;
        //converting degrees to radians
        double angleRadians = Math.toRadians(2 * angleDegrees);
        double distance = ((Math.pow(speedMps,2)) * Math.sin(angleRadians))/9.8;
        return distance;
        
    }
}
