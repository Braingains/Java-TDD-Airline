import People.Crew.CabinCrewMember;
import People.Crew.Pilot;
import People.Crew.RankType;
import People.Passenger;
import org.junit.Before;

import java.util.ArrayList;

public class FlightTest {

    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane1;
    Plane plane2;
    Flight EDItoYYZ;
    Flight PSLtoPER;

    @Before
    public void before() {
        pilot1 = new Pilot("Tayce", RankType.CAPTAIN, "RPDRUKS21");
        pilot2 = new Pilot("A'Whorea", RankType.FIRST_OFFICER, "RPDRUKS22");
        cabinCrewMember1 = new CabinCrewMember("Bimini Bon-Boulash", RankType.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Joe Black", RankType.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Rupaul Charles", 4);
        passenger2 = new Passenger("Michelle Visage", 67);
        plane1 = new Plane (PlaneType.GOING_hUg3);
        plane2 = new Plane (PlaneType.GOING_W33);
        ArrayList<Pilot> testPilots = new ArrayList<Pilot>();
        ArrayList<CabinCrewMember> testCabinCrewMembers = new ArrayList<CabinCrewMember>();
        EDItoYYZ = new Flight(testPilots, testCabinCrewMembers, plane1,"kW33N", "YYZ", "EDI", "10:30");

    }
}
