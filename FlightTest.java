package assignment_2;

public class FlightTest {
    public static void main (String[] args) {
    	
    	Flight flight1 = new Flight("South West", 111, "Louisville", "HollyWood");
    	Flight flight2 = new Flight("Allegient", 123, "Canada", "Dubai");
    	
    	System.out.println(flight1);
    	flight1.setFlightNumber(1337);
    	flight1.setOrigin("Louisville");
    	System.out.println ("\tReassigned Number: " + flight1.getFlightNumber());
    	flight1.setDestination("Hawaii");
    	System.out.println ("\tNew destination place: " + flight1.getDestination());
    	
    	System.out.println("\n" + flight2);
    	flight2.setAirline("Paper Planes United");
    	System.out.println("\tNew Airline: " + flight2.getAirline());
    }
}
