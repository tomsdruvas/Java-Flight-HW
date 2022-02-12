import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("John", RankType.Captain);
    }

    @Test
    public void testPilotHasName(){
        assertEquals("John", cabinCrewMember.getName());
    }

    @Test
    public void testRankOfCabinCrewMember(){
        assertEquals(RankType.Captain, cabinCrewMember.getRank());
    }
}
