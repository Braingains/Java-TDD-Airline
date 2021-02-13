package People;

import Flight.Flight;

public class Passenger extends Person {


    private int numberOfBags;
    private Flight flight;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
        this.flight = null;
    }

    public int getNumberOfBags() {
        return this.numberOfBags;
    }

    public Flight getFlight() {
        return this.flight;
    }
    public void setFlight(Flight flight){
        this.flight = flight;
    }
}
