package oopsAssignment;

public class Address {
	private String addressLine;
	private String city;

	public Address(String addressLine, String city) {
		super();
		this.addressLine = addressLine;
		this.city = city;
	}

	void getAddressDetails()
	{
		System.out.println("Address Details are:"+ addressLine+city);

	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}


























	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
