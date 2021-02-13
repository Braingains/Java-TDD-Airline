import People.FlightManager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;

    @Before
    public void before() {
        flightManager = new FlightManager("Graham Norton");
    }

    @Test
    public void hasName() {
        assertEquals ("Graham Norton", flightManager.getName());
    }
}
