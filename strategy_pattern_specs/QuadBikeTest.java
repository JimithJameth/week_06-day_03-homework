import static org.junit.Assert.*;
import org.junit.*;
import strategy_pattern.*;

public class QuadBikeTest {

  QuadBike quadbike;
  Driver driver;
  

  @Before
  public void before(){
    quadbike = new QuadBike("Blue",30, "50cc");
    driver = new Driver("Jamie", quadbike );
  }

  @Test
    public void averageSpeed(){
      assertEquals(30,quadbike.getAverageSpeed());
    }
      
  @Test
    public void driveDistance(){
      assertEquals(60,quadbike.driveDistance(30));
      }
  }
