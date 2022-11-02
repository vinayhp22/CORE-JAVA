package com.capgemini.kantara.thing1.person;

public class Location {
	public int no;
	public String street;
	public City city;
	public State state;
	public Country country;

	public Location(int no, String street, City city, State state, Country country) {
		this.no = no;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public void showOff() {
		System.out.println("=======Location=======");
		System.out.println("Door No. : " + no);
		if (city != null) {
			city.showOff();
		} else {
			System.out.println("Location is empty or not filled.");
		}

		if (state != null) {
			state.showOff();
		} else {
			System.out.println("State is empty or not filled.");
		}

		if (country != null) {
			country.showOff();
		} else {
			System.out.println("Country is empty or not filled.");
		}
	}

}
