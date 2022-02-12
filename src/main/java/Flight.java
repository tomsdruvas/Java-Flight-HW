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

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }
    public int passengerListSize(){
        return this.passengers.size();
    }

    public void addPassengerToFlight(Passenger passenger){
        if(this.passengerListSize() < this.plane.getPlaneType().getCapacity()){
        this.passengers.add(passenger);
        };
    }

    public void addCrewMemberToFlight(CabinCrewMember crewMember){
        this.cabinCrewMembers.add(crewMember);
    }

    public int getAvailableSeats(){
        return this.plane.getPlaneType().getCapacity() - this.passengerListSize();
    }


}
