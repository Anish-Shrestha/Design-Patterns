package lab12_2;

import java.util.List;

public class SinglePrice extends Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		long revenue = 0;
		for (Flight flight : flights) {
			int flightRevenue = flight.getNumberOfSeats() * baseTicketPrice - fixedFlightCost;
			revenue += flightRevenue;
		}
		return revenue;
	}

}
