
public class Customer {
	private String id;
	private String name;
	private String email;
	private String country;
	private String address;

public Customer(String id, String name, String email, String country, String address) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.country = country;
	this.address = address;
}

public String getId() {	return id;}
public void setId(String id) {	this.id = id;}

public String getName() {	return name;}
public void setName(String name) {	this.name = name;}

public String getEmail() {	return email;}
public void setEmail(String email) {	this.email = email;}

public String getCountry() {	return country;}
public void setCountry(String country) {	this.country = country;}

public String getAddress() {	return address;}
public void setAddress(String address) {	this.address = address;}

public Customer(Customer otherCustomer) {
	this.id = otherCustomer.id;
	this.name = otherCustomer.name;
	this.email = otherCustomer.email;
	this.country = otherCustomer.country;
	this.address = otherCustomer.address;
}



}
