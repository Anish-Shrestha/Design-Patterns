package Lesson8.Builder;

public class Address {
	
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;

	public Address(String streetAddress, String city, String state, String zipCode) {
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public boolean isValid() {
		if (streetAddress.isEmpty() && city.isEmpty() && state.isEmpty()
				&& zipCode.isEmpty()) {
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Street:"+this.streetAddress+ " City:"+this.city+ "State:"+this.state + " Zipcode:"+this.zipCode;
	}
}
