package Flight;

import People.Crew.CabinCrewMember;
import People.Crew.Pilot;
import People.Passenger;
import Plane.Plane;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destinationAirport;
    private String departureAirport;
    private LocalDateTime departureTime;
    private int availableSeats;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrewMembers, Plane plane, String flightNumber, String destinationAirport, String departureAirport, LocalDateTime departureTime) {
        this.pilots = pilots;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destinationAirport = destinationAirport;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.availableSeats = plane.getCapacityOfPlane();
    }

    public int getNumberOfPilots(){
        return this.pilots.size();
    }

    public int getNumberOfCabinCrew() {
        return this.cabinCrewMembers.size();
    }

    public int getNumberOfPassengers() {
        return this.passengers.size();
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestinationAirport() {
        return this.destinationAirport;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public LocalDateTime getDepartureTime() {
        return this.departureTime;
    }

    public int getAvailableSeats() {
        return this.availableSeats;
    }

    public String bookPassengerOnFlight(Passenger passenger, Flight flight) {
        if (getAvailableSeats() > 1){
            this.passengers.add(passenger);
            this.availableSeats -= 1;
            passenger.setFlight(flight);
            return String.format ("%s's booking confirmed", passenger.getName());

        }
        return "booking failed: flight full";
    }

    public double getFlightBaggageAllowance() {
        return (plane.getWeightReservedForBaggage());
    }
}
