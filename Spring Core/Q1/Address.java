/*
 * Create an Address class with the following attributes:- street, city, state, zip, country
Create an Customer class with the following attributes:- customerId, customerName,
customerContact, customerAddress.
Inject the Address bean into Customer bean using setter injection
Create a Test class with main() method, get Customer bean from ApplicationContext
object and print details of Customer.
Also write the JUnit Test cases for above program.
- Modify the above application and inject the bean using constructor injection
- Use XML based Configuraion.
 */

package ques1.spring.assiggnmnet;

public class Address {
	String street;
	String city;
	String state;
	long zip;
	String country;
		
	public void setStreet(String street) {
		this.street = street;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setZip(long zip) {
		this.zip = zip;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	/*
	 * public Address(String street, String city, String state, long zip, String
	 * country) { super(); this.street = street; this.city = city; this.state =
	 * state; this.zip = zip; this.country = country; }
	 */
	 
	
	public String toString() {
		return "Address : ( Street : "+street+" City : "+city+" State : "+state+" zip : "+zip+" Counrty : "+country+")";
	}

}
