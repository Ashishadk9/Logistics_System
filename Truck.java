
/**
 * Write a description of class Truck here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Truck extends Vehicle
{
    public static final double CostPerMile= 0.50;
    public static final int MaxLoad= 5000;
    public Truck(){
        super("Truck");
    }
    public double calculateFuelCost(int miles){
        return miles * CostPerMile;
    }
    public int maxLoad(){
        return MaxLoad;
    }
}
