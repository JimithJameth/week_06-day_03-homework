package strategy_pattern;
import behaviours.*;

public class QuadBike implements Driveable{

String type;
int averageSpeed;
String engineCapacity;

public QuadBike(String type, int averageSpeed, String engineCapacity) {
this.averageSpeed = averageSpeed;
this.engineCapacity = engineCapacity;
this.type = type;
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

public String getType(){
  return this.type;
}

}