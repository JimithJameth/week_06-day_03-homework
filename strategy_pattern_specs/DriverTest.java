import static org.junit.Assert.*;
import org.junit.*;
import strategy_pattern.*;

public class DriverTest {
  
  Driver driver;
  DodgemCar dodgemcar;
  

  @Before
  public void before(){
    dodgemcar = new DodgemCar("Red", 20, 2);
    driver = new Driver("Jamie", dodgemcar );
  }

  @Test
  public void hasName(){
    assertEquals("Jamie", driver.getName());
  }

  @Test
  public void canSetVehicle(){
    QuadBike quadbike = new QuadBike("Blue", 30, "50cc");
    driver.setVehicle(quadbike);
    assertEquals(quadbike,driver.getVehicle());
  }
}