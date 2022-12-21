package com.xworkz.boot2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MetroCityNamesRunner {

	public static void main(String[] args) {
		Collection<String> cities = new ArrayList<String>();
		cities.add("Bengaluru");
		cities.add("Chennai");
		cities.add("Hyderbad");
		cities.add("Mumbai");
		cities.add("Kochi");
		
		System.out.println(cities+"\n");
		
		for (String city : cities) {
			System.out.println(city);
		}
		System.out.println("\n Iterator=====> \n");

		Iterator<String> cityName = cities.iterator();
		while (cityName.hasNext()) {
			String name = (String) cityName.next();
			System.out.println(name);
		}
	}
}
