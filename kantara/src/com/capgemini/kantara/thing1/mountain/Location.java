package com.capgemini.kantara.thing1.mountain;

public class Location {

	public String street;
	public String city;
	public String state;
	public long pincode;
	public String country;

	public Location(String street, String city, String state, long pincode, String country) {
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}
	
	public void showOff() {
		System.out.println("Location Running");
		System.out.println("street : "+street);
		System.out.println("city : "+city);
		System.out.println("state : "+state);
		System.out.println("pincode : "+pincode);
		System.out.println("country : "+country);
	}

}
