import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Jimmy", RankType.Captain, "AB123");
    }

    @Test
    public void getLicenseNumber() {
        assertEquals("AB123", pilot.getLicenseNumber());
    }
}