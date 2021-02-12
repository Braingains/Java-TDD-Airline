import People.Crew.CabinCrewMember;
import People.Crew.Pilot;
import People.Passenger;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private String departureTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrewMembers, ArrayList<Passenger> passengers, Plane plane, String flightNumber, String destinationAirport, String departureAirport, String departureTime) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }



}
