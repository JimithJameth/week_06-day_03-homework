package strategy_pattern;
import behaviours.*;

public class DodgemCar implements Drivable{
  
String type;
int averageSpeed;
int numberOfSeats;

public DodgemCar(String type, int averageSpeed, int numberOfSeats) {
this.averageSpeed = averageSpeed;
this.type = type;
this.numberOfSeats = numberOfSeats;
}
public String getType(){
  return this.type;
}

public int getAverageSpeed(){
  return this.averageSpeed;
}

public int numberOfSeats(){
  return this.numberOfSeats;
}
public int driveDistance(int distance){
  return 0;
}

}
