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
  public void hasType(){
    assertEquals("Jamie", driver.getName());
  }
}