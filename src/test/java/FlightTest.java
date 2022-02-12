import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlightTest {
    Flight flight;
    Pilot pilot;
    Plane plane;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;



    @BeforeEach
    void setUp() {
        cabinCrewMember1 = new CabinCrewMember("Jack", RankType.LeadFlightAttendant);
        cabinCrewMember2 = new CabinCrewMember("Sean", RankType.FligthAttendant);
        passenger1 = new Passenger("Paul", 3);
        passenger2 = new Passenger("Ronald", 4);
        passenger3 = new Passenger("Donald", 4);
        plane = new Plane(PlaneType.BOEING123);
        pilot = new Pilot("JoJo", RankType.Captain, "AB123");
        flight = new Flight("EDI", "GLA", "GLA47", "16:00", pilot, plane);
        flight.addCrewMemberToFlight(cabinCrewMember1);
        flight.addCrewMemberToFlight(cabinCrewMember2);
        flight.addPassengerToFlight(passenger1);
        flight.addPassengerToFlight(passenger2);
    }

    @Test
    void getDestination() {
        assertEquals("EDI", flight.getDestination());
    }

    @Test
    void getDeparture() {
        assertEquals("GLA", flight.getDeparture());
    }

    @Test
    void getFlightNumber() {
        assertEquals("GLA47", flight.getFlightNumber());
    }

    @Test
    void getDepartureTime() {
        assertEquals("16:00", flight.getDepartureTime());
    }

    @Test
    void getPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    void getCabinCrewMembers() {
        assertEquals(2,flight.getCabinCrewMembers().size());

    }

    @Test
    void getPassengers() {
        assertEquals(2,flight.passengerListSize());
    }

    @Test
    void getPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    void passengerListSize() {
        assertEquals(2, flight.passengerListSize());

    }

    @Test
    void addPassengerToFlight() {
        flight.addPassengerToFlight(passenger3);
        assertEquals(3, flight.passengerListSize());

    }

    @Test
    void testRemainingSeatsFree(){
        assertEquals(98, flight.getAvailableSeats());
    }

    @Test
    void pilotFlyingThePlane(){
        assertEquals("I'm flying the plane", pilot.flyThePlane());
    }
    @Test
    void testMessageToPassenger(){
        assertEquals("We are all good", cabinCrewMember1.relayMessage());
    }
}