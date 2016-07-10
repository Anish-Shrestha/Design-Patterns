package lab12_2;

import java.util.List;

public class TwoClass extends Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		Double revenue = 0.0;
		for (Flight flight : flights) {
			double businessClass = (flight.getNumberOfSeats() * 1.5 * baseTicketPrice) / 3;
			double coachClass = (flight.getNumberOfSeats() * baseTicketPrice * 0.75 * 2) / 3;
			double fixedFlightClass = fixedFlightCost * 1.1;
			revenue += businessClass + coachClass + fixedFlightClass;
		}
		return revenue.longValue();
	}

}
