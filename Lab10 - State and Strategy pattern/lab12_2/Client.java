package lab12_2;

public class Client {
	public static void main(String[] args) {
		
		AirLinesCompany airLine = new AirLinesCompany(new SinglePrice());

		Flight americanAir = new Flight("AA3261", 150);
		Flight qatarAir = new Flight("QR321", 240);

		// Add AirLine
		airLine.addFlight(americanAir);
		airLine.addFlight(qatarAir);

		// Get Revenue of AirLine
		float revenue = airLine.getRevenue();
		System.out.println("AirLine SinglePrices Revenue : " + revenue);

		airLine.setModel(new TwoClass());
		revenue = airLine.getRevenue();
		System.out.println("AirLine TwoClasses Revenue : " + revenue);

		airLine.setModel(new MultiClass());
		revenue = airLine.getRevenue();
		System.out.println("AirLine MultiClasses Revenue : " + revenue);
	}
}