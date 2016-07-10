package lab12_2;

import java.util.ArrayList;
import java.util.List;

public class AirLinesCompany {
	private Model model;
	public List<Flight> flights = new ArrayList<>();

	public AirLinesCompany(Model model) {
		this.model = model;
	}

	//Set strategy
	public void setModel(Model model) {
		this.model = model;
	}

	public void addFlight(Flight item) {
		this.flights.add(item);
	}

	public void removeFlight(Flight item) {
		this.flights.remove(item);
	}

	public long getRevenue() {
		return model.getRevenue(flights);
	}

}