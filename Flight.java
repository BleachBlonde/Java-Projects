package assignment_2;

@SuppressWarnings("unused")
class Flight {
	private String flightAirline, fa, flightOrigin, fo, flightDestination, fd;
	private int flightNumber, fn;
	
	public Flight(String flightAirline, int flightNumber, String flightOrigin, String flightDestination) {
		fa = flightAirline;
		fn = flightNumber;
		fo = flightOrigin;
		fd = flightDestination;
     }
	
     public String getAirline () {
    	 return fa;
     }
     
     public int getFlightNumber () {
          return fn;
     }
     
     public String getOrigin () {
          return fo;
     }
     
     public String getDestination () {
          return fd;
     }
     
     public void setAirline (String flightAirline) {
          fa = flightAirline;
     }
     
     public void setFlightNumber (int flightNumber) {
          fn = flightNumber;
     }
     
     public void setOrigin (String flightOrigin) {
          fo = flightOrigin;
     }

     public void setDestination (String flightDestination) {
          fd = flightDestination;
     }
     public String toString () {
    	 return fa + " flight #" + fn + " \nFrom: " + fo +";\tTo: " + fd;
     }
}