import Flight.Flight;
import People.Crew.CabinCrewMember;
import People.Crew.Pilot;
import People.Crew.RankType;
import People.Passenger;
import Plane.Plane;
import Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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
    Flight EDItoYYZ2;


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
    }

    @Test
    public void hasPilots() {
        assertEquals(2, EDItoYYZ.getNumberOfPilots());
    }

    @Test
    public void hasCabinCrew() {
        assertEquals(2, EDItoYYZ.getNumberOfCabinCrew());
    }
    @Test
    public void hasPlane() {
        assertEquals(plane1, EDItoYYZ.getPlane());
    }
    @Test
    public void hasFlightNumber() {
        assertEquals("kW33N", EDItoYYZ.getFlightNumber());
    }
    @Test
    public void hasDestinationAirport() {
        assertEquals("YYZ", EDItoYYZ.getDestinationAirport());
    }
    @Test
    public void hasDepartureAirport() {
        assertEquals("EDI", EDItoYYZ.getDepartureAirport());
    }
    @Test
    public void hasDepartureTime() {
        assertEquals(LocalDateTime.of(2021, 2, 13, 10, 30), EDItoYYZ.getDepartureTime());
    }
    @Test
    public void initiallyHasNoPassengers() {
        assertEquals(0, EDItoYYZ.getNumberOfPassengers());
    }
    @Test
    public void hasAvailableSeats() {
        assertEquals(200, EDItoYYZ.getAvailableSeats());
    }
    @Test
    public void canBookPassenger() {
        EDItoYYZ.bookPassengerOnFlight(passenger1);
        assertEquals(199, EDItoYYZ.getAvailableSeats());
    }
    @Test
    public void canBookPassenger2() {
        assertEquals("Rupaul Charles's booking confirmed", EDItoYYZ.bookPassengerOnFlight(passenger1));
    }
    @Test
    public void cannotBookOntoFullFlight() {
        EDItoYYZ2.bookPassengerOnFlight(passenger1);
        assertEquals("booking failed: flight full", EDItoYYZ2.bookPassengerOnFlight(passenger2));


    }
    @Test
    public void canGetFlightBaggageAllowance() {
        assertEquals(80.0, EDItoYYZ2.getFlightBaggageAllowance(), 0.1);
    }
}
