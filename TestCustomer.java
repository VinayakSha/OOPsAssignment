package oopsAssignment;

public class TestCustomer extends Customer
{
	public TestCustomer(String customerName, String residentialAddress) {
		super(customerName, residentialAddress);
		// TODO Auto-generated constructor stub
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestCustomer tc=new TestCustomer("DHAVAl","1st Main Road BTM,Bangalore");
tc.getResidentialAddress();
tc.getCustomerName();
	}

}
