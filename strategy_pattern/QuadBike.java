package strategy_pattern;
import behaviours.*;

public class QuadBike implements Driveable{

int averageSpeed;
String engineCapacity;

public QuadBike(int averageSpeed, String engineCapacity) {
this.averageSpeed = averageSpeed;
this.engineCapacity = engineCapacity;
}

public int getAverageSpeed(){
  return this.averageSpeed;
}

public String getEngineCapacity(){
  return this.engineCapacity;
}

public int driveDistance(int distance){
  int time = distance/this.averageSpeed*60;
  return time;
}

}