package strategy_pattern;
import behaviours.*;

public class Driver {
  
  String name;
  private Driveable vehicle;

  public Driver(String name, Driveable vehicle){
    this.name = name;
    this.vehicle = vehicle;
  }

  public String getName(){
    return this.name;
  }

  public Driveable getVehicle(){
    return this.vehicle;
  }

  public void setVehicle(Driveable vehicle){
  this.vehicle = vehicle;
  }
}

  