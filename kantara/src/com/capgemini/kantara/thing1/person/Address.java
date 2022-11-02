package com.capgemini.kantara.thing1.person;

public class Address {
	public Location location;

	public Address(Location location) {
		this.location = location;
	}

	public void showOff() {
		System.out.println("===--LOCATION--===");
		if (location != null) {
			location.showOff();
		} else {
			System.out.println("Location is empty or not filled.");
		}
	}
}
