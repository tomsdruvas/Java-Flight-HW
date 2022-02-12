import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Joe", 2);
    }
    @Test
    public void testHasName(){
        assertEquals("Joe", passenger.getName());
    }
    @Test
    public void testBagsNumb(){
        assertEquals(2, passenger.getNumberOfBags());
    }

}
