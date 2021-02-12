import People.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Lawrence Cheney", 1);
    }

    @Test
    public void hasName(){
        assertEquals("Lawrence Cheney", this.passenger.getName());
    }

    @Test
    public void hasBags(){
        assertEquals(1, this.passenger.getNumberOfBags());
    }

}
