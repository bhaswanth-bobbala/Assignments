package ques1.spring.assiggnmnet;

public class Customer {
	int customerId;
	String customerName;
	long customerContact;
	Address customerAddress;
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	/*
	 * public Customer(int customerId, String customerName, long customerContact,
	 * Address customerAddress) { super(); this.customerId = customerId;
	 * this.customerName = customerName; this.customerContact = customerContact;
	 * this.customerAddress = customerAddress; }
	 */
	
	public String toString() {
		return "[ ID : "+customerId+" Name : "+customerName+" Number : "+customerContact+" "+customerAddress+"]";
	}

}
