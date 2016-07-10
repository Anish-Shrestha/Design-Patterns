package lab12_2;

import java.util.List;

public abstract class Model {
	protected int baseTicketPrice = 300;
	protected int fixedFlightCost = 50000;

	public abstract long getRevenue(List<Flight> flights);
}
