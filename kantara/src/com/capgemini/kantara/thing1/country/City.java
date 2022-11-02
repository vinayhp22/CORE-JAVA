package com.capgemini.kantara.thing1.country;

public class City {

	public Name name;
	public boolean capital;
	public double areaInSquareKilometers;

	public City(Name name) {
		super();
		this.name = name;
	}

	public void showOff() {
		System.out.println(System.lineSeparator());
		System.out.println("City running...");
		name.showOff();
		System.out.println("capital : " + this.capital);
		System.out.println("areaInSquareKilometers : " + this.areaInSquareKilometers);

	}
}
