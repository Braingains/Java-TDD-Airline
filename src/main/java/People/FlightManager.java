package People;

import Flight.Flight;

public class FlightManager extends Person {

    private Flight flight;

    public FlightManager (String name, Flight flight) {
        super(name);
        this.flight = flight;
    }

}
