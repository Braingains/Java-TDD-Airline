import People.Crew.Pilot;
import People.Crew.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot ("Tia Kofi", RankType.CAPTAIN, "RPDRUKS2");

    }

    @Test
    public void hasName() {
        assertEquals("Tia Kofi", pilot.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(RankType.CAPTAIN, pilot.getRank());
    }

    @Test
    public void hasLicenceNumber() {
        assertEquals("RPDRUKS2", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("I picked a bad day to stop sniffing glue.", pilot.flyPlane("I picked a bad day to stop sniffing glue."));
    }
}
