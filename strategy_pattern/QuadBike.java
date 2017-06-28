package strategy_pattern;
import behaviours.*;

public class QuadBike implements Drivable{

int averageSpeed;
int engineCapacity;

public QuadBike(int averageSpeed, String engineCapacity) {
this.averageSpeed = averageSpeed;
this.engineCapacity = engineCapacity;
}

public int getAverageSpeed(){
  return this.averageSpeed;
}

public int getEngineCapacity(){
  return this.engineCapacity;
}

}