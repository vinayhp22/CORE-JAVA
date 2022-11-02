package com.capgemini.kantara.thing1.country;

public class Country {

	public String name;
	public President president = new President();
	public City[] cities;

	public Country(String name) {
		this.name = name;
	}

	public void setPresident(President president) {
		this.president = president;
	}

	public void setCities(City[] cities) {
		this.cities = cities;
		
	}

	public void showOff() {
		System.out.println("Country runnning....");
		System.out.println("name : " + this.name);

		president.showOff();
		
		if (this.cities != null) {
			for (int i = 0; i < cities.length; i++) {
				City city = cities[i];
				if (city != null) {
				city.showOff();	
				}else {
					System.out.println("City is null in "+i+" th index");
				}
			}
		}else {
			System.out.println("City is null...");
		}
		
		
	}

}
