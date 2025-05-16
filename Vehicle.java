
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Vehicle
{
 private String type;   
 public Vehicle(String type){
   this.type = type;
 }
   public void displayType(){
       System.out.println("Vehicle Type:"+ type);
   }
   public abstract double calculateFuelCost(int miles);
   public abstract int maxLoad();
}
