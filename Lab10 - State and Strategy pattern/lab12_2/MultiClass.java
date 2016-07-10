package lab12_2;

import java.util.List;

public class MultiClass extends Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		Double revenue = 0.0;
		for (Flight flight : flights) {
			double firstClass = (flight.getNumberOfSeats() * 4 * baseTicketPrice) / 10;
			double businessClass = (flight.getNumberOfSeats() * baseTicketPrice * 1.5) / 5;
			double coachClass = (flight.getNumberOfSeats() * baseTicketPrice * 0.75 * 7) / 10;
			double fixedFlightClass = fixedFlightCost * 1.2;
			revenue += firstClass + businessClass + coachClass + fixedFlightClass;
		}
		return revenue.longValue();
	}
}
