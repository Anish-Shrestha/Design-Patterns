package lab12_2;

public class Flight {
	private String flightNumber;
	private int numberOfSeats;

	public Flight(String flightNumber, int numberOfSeats) {
		this.flightNumber = flightNumber;
		this.numberOfSeats = numberOfSeats;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", numberOfSeats=" + numberOfSeats + "]";
	}

}
