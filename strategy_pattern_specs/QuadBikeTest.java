import static org.junit.Assert.*;
import org.junit.*;
import strategy_pattern.*;

public class QuadBikeTest {

  QuadBike quadbike;
  Driver driver;
  

  @Before
  public void before(){
    quadbike = new QuadBike(30, "50cc");
    driver = new Driver("Jamie", quadbike );
  }

  @Test
    public void averageSpeed(){
      assertEquals(30,quadbike.getAverageSpeed());
    }
  }
