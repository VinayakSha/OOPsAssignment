package oopsAssignment;

public class Customer {
	private static final String Addressdetails="1st Main Road,BTM,Bangalore ";
	private String customerName;
	String residentialAddress;
	public Customer(String customerName, String residentialAddress) {
		super();
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	public void getCustomerDetails() {
		System.out.println("CustomerName is "+ customerName);
		System.out.println("Residential Address is"+ Addressdetails);
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

}


