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

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

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
        EDItoYYZ = new Flight(testPilots, testCabinCrewMembers, plane1,"kW33N", "YYZ", "EDI", "10:30");
        EDItoYYZ2 = new Flight(testPilots, testCabinCrewMembers, plane2,"kW33N", "YYZ", "EDI", "10:30");

        flightManager = new FlightManager("Graham Norton", EDItoYYZ);
    }

    @Test
    public void hasName() {
        assertEquals ("Graham Norton", flightManager.getName());
    }
    @Test
    public void calculatePassengerBaggageAllowance() {
        assertEquals(80, flightManager.getBaggageAllowancePerPassenger(EDItoYYZ), 0.1 );
    }     //does this mean each bag weighs the same as a person!? I think I'm just overthinking this.

    @Test
    public void calculateTotalBaggageWeightOnFlight() {
        EDItoYYZ.bookPassengerOnFlight(passenger1);
        EDItoYYZ.bookPassengerOnFlight(passenger2);
        assertEquals(160, flightManager.getTotalBaggageWeightOnFlight(EDItoYYZ), 0.1);
    }
}
