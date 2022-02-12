import java.util.ArrayList;

public class Flight {
    private String destination;
    private String departure;
    private String flightNumber;
    private String departureTime;
    private Pilot pilot;
    private ArrayList<CabinCrewMember>cabinCrewMembers;
    private ArrayList<Passenger>passengers;
    private Plane plane;


    public Flight(String destination, String departure, String flightNumber, String departureTime, Pilot pilot, Plane plane){
        this.destination = destination;
        this.departure = departure;
        this.flightNumber = flightNumber;
        this.departureTime = departureTime;
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>();
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;

    }
}
