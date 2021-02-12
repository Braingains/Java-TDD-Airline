import People.Crew.CabinCrewMember;
import People.Crew.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Ellie Diamond", RankType.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName() {
        assertEquals("Ellie Diamond", cabinCrewMember.getName());
    }

    @Test
    public void hasRank() {
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canMakeAnnouncement() {
        assertEquals("Prepare for water landing!", cabinCrewMember.announce("Prepare for water landing!"));
    }

}
