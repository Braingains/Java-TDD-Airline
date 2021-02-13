package People;

import Flight.Flight;

public class Passenger extends Person {

    private int numberOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags) {
        super(name);
        this.numberOfBags = numberOfBags;
        this.flight = null;
        this.seatNumber = seatNumber;
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
    public int getSeatNumber() {
        return this.seatNumber;
    }
    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
