import static org.junit.Assert.*;
import org.junit.*;
import strategy_pattern.*;

public class DodgemCarTest {

  DodgemCar dodgemcar;
  

  @Before
  public void before(){
    dodgemcar = new DodgemCar("Red", 20, 2);
    // driver = new Driver("Jamie", dodgemcar );
  }

  @Test
  public void hasType(){
    assertEquals("Red", dodgemcar.getType());
  }

  @Test
  public void averageSpeed(){
    assertEquals(20, dodgemcar.getAverageSpeed());
  }
}