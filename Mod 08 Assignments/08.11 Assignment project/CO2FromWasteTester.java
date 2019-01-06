/**
 * @This class tests the calculations of the amount of carbon dioxide produced in a year from waste by a household and the comparision to 
 * how recycling can reduce the CO2 footprint.
 *
 * @Ipshita Bhatnagar
 * @12/25
 *
 */
import java.util.ArrayList;

public class CO2FromWasteTester
{
   public static void main(String[] args)
   {
       ArrayList<CO2FromWaste> households = new ArrayList<CO2FromWaste>();
           households.add(new CO2FromWaste(4, true, false, false, true));
           households.add(new CO2FromWaste(3, true, true, false, true));
           households.add(new CO2FromWaste(2, true, true, true, true));
           households.add(new CO2FromWaste(5, false, false, false, true));
           households.add(new CO2FromWaste(1, false, true, false, true));
           households.add(new CO2FromWaste(6, true, false, false, false));

       for(CO2FromWaste dataRecord : households)
       {
          dataRecord.calcGrossWasteEmission();
          dataRecord.calcWasteReduction();
          dataRecord.calcNetWasteReduction();
       }

       System.out.println("|       |        |                                         |             Pounds of CO2             |");
       System.out.println("|       |        |       Household Waste Recycled          |   Total    |             |     Net    |");
       System.out.println("| Index | People |  Paper   |  Plastic |  Glass  |  Cans   |  Emission  |  Reduction  |  Emission  |");
       System.out.println("|-------|--------|----------|----------|---------|---------|------------|-------------|------------|");

       CO2FromWaste dataRecord;

       for(int index = 0; index < households.size(); index ++)
       {
           System.out.printf("|%7d",index);
           System.out.printf("|%8d",households.get(index).getNumPeople());
           System.out.printf("|%10s",households.get(index).getPaper());
           System.out.printf("|%10s",households.get(index).getPlastic());
           System.out.printf("|%9s",households.get(index).getGlass());
           System.out.printf("|%9s",households.get(index).getCans());
           System.out.printf("|%12.1f",households.get(index).getEmissions());
           System.out.printf("|%13.1f",households.get(index).getReduction());
           System.out.printf("|%12.1f|",households.get(index).getNetEmissions());
           System.out.println();
       }
   }
}