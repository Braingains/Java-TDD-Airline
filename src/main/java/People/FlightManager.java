package People;

import Flight.Flight;

public class FlightManager extends Person {

    private Flight flight;

    public FlightManager (String name, Flight flight) {
        super(name);
        this.flight = flight;
    }

//    public Double calculateBaggageAllowancePerPassenger(Passenger passenger, Flight flight) {
//        Double planeWeightAllowance = (flight.plane.getTotalWeight() / 2);
//    };

}
