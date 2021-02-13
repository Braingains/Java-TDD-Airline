import Flight.Flight;
import People.Crew.CabinCrewMember;
import People.Crew.Pilot;
import People.Crew.RankType;
import People.FlightManager;
import People.Passenger;
import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    Pilot pilot1;
    Pilot pilot2;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Plane plane1;
    Plane plane2;
    Flight EDItoYYZ;
    Flight EDItoYYZ2;
    FlightManager flightManager;


    @Before
    public void before() {
        pilot1 = new Pilot("Tayce", RankType.CAPTAIN, "RPDRUKS21");
        pilot2 = new Pilot("A'Whorea", RankType.FIRST_OFFICER, "RPDRUKS22");
        cabinCrewMember1 = new CabinCrewMember("Bimini Bon-Boulash", RankType.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Joe Black", RankType.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Rupaul Charles", 4);
        passenger2 = new Passenger("Michelle Visage", 67);
        plane1 = new Plane (PlaneType.GOING_hUg3);
        plane2 = new Plane (PlaneType.GOING_TEST);
        ArrayList<Pilot> testPilots = new ArrayList<Pilot>();
        testPilots.add(pilot1);
        testPilots.add(pilot2);
        ArrayList<CabinCrewMember> testCabinCrewMembers = new ArrayList<CabinCrewMember>();
        testCabinCrewMembers.add(cabinCrewMember1);
        testCabinCrewMembers.add(cabinCrewMember2);
        ArrayList<Passenger> testPassengers = new ArrayList<Passenger>();
        EDItoYYZ = new Flight(testPilots, testCabinCrewMembers, plane1,"kW33N", "YYZ", "EDI", LocalDateTime.of(2021, 2, 13, 10, 30));
        EDItoYYZ2 = new Flight(testPilots, testCabinCrewMembers, plane2,"kW33N", "YYZ", "EDI", LocalDateTime.of(2021, 2, 13, 10, 30));

        flightManager = new FlightManager("Graham Norton", EDItoYYZ);
    }

    @Test
    public void hasName(){
        assertEquals("Rupaul Charles", passenger1.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(4, passenger1.getNumberOfBags());
    }
    @Test
    public void hasFlight() {
        passenger1.setFlight(EDItoYYZ);
        assertEquals(EDItoYYZ, passenger1.getFlight());
    }
    //Not sure how to test for randomness, I ran this several times though and it does work, he has a different seat
    //within the desired range each time.
//    @Test
//    public void hasSeatNumber() {
//        EDItoYYZ.bookPassengerOnFlight(passenger1, EDItoYYZ);
//        assertEquals(0, passenger1.getSeatNumber());
//    }

}
