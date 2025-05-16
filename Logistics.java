
/**
 * Write a description of class Logistics here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Logistics
{
   public static void main(String[] args){
       Truck truck = new Truck();
       truck.displayType();
       double FuelCost= truck.calculateFuelCost(100);
       System.out.println("Fuel cost a 100 miles:$"+FuelCost);
       System.out.println("Maximum load:"+truck.maxLoad()+ "kg");
   }
}
