package People;

import Flight.Flight;

public class FlightManager extends Person {

    private Flight flight;

    public FlightManager (String name, Flight flight) {
        super(name);
        this.flight = flight;
    }

    //"The weight of bag per person is the weight reserved for passenger bags divided by the capacity"
    public Double getBaggageAllowancePerPassenger(Flight flight) {
        return (flight.getFlightBaggageAllowance() / flight.getPlane().getCapacityOfPlane());
    };

    public Double getTotalBaggageWeightOnFlight(Flight flight) {
        return (flight.getNumberOfPassengers() * getBaggageAllowancePerPassenger(flight));
    }

    public Double getRemainingBaggageSpaceOnFlight(Flight flight) {
        Double RemainingSpace = flight.getFlightBaggageAllowance();
        Double TotalBaggageWeight = getTotalBaggageWeightOnFlight(flight);
        return RemainingSpace - TotalBaggageWeight;
    }

}
