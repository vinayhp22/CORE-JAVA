package com.capgemini.kantara.boot;

import com.capgemini.kantara.constants.Gender;
import com.capgemini.kantara.thing1.country.City;
import com.capgemini.kantara.thing1.country.Country;
import com.capgemini.kantara.thing1.country.Name;
import com.capgemini.kantara.thing1.country.President;

public class CountryRunner {

	public static void main(String[] args) {

		Country country = new Country("INDIA");
		President president = new President();
		president.setName("Droupadi Murmu");
		president.setGender(Gender.FEMALE);
		country.setPresident(president);

		Name name = new Name("Delhi", "Indraprastha", "NCT of Delhi");
		City city1 = new City(name);
		city1.capital = true;
		city1.areaInSquareKilometers = 1483;

		Name name1 = new Name("Banglore", "Bengaval-uru", "Bengaluru");
		City city2 = new City(name1);
		city2.areaInSquareKilometers = 743;

		City[] cities = { city1, city2 };

		country.setCities(cities);

		country.showOff();

	}

}
