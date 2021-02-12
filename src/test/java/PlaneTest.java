import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.GOING_hUg3);
        plane2 = new Plane(PlaneType.GOING_B1g);
        plane3 = new Plane(PlaneType.GOING_W33);
    }

    @Test
    public void hasCapacity() {
        assertEquals(200, plane1.getCapacity());
    }

    @Test
    public void hasTotalWeight() {
        assertEquals(32000.0, plane1.getTotalWeight(), 0.01);
    }
}
