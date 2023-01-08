package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PinCodeRunner {
	public static void main(String[] args) {

		Map<Double, String> pincodes = new HashMap<Double, String>();
		pincodes.put(572133D, "Medigeshi");
		pincodes.put(560001D, "Majestic");
		pincodes.put(560079D, "BasaveshwarNagar");
		pincodes.put(560070D, "Vijayanagar");
		pincodes.put(560065D, "Rajajinagar");
		pincodes.put(800001D, "Mumbai Central");
		pincodes.put(600001D, "Delhi Central");
		pincodes.put(600001D, "Hyderbad Central");
		pincodes.put(560006D, "Electronic City");
		pincodes.put(91D, "India");

		System.out.println("Loops Keys =================");
		Set<Double> keys = pincodes.keySet();
		keys.forEach(e -> System.out.println(e));

		System.out.println("\nLoop values=============");
		Collection<String> values = pincodes.values();
		values.forEach(e -> System.out.println(e));

		System.out.println("\nLoop Entries =============");
		Collection<Entry<Double, String>> entries = pincodes.entrySet();
		System.out.println(entries);
		entries.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

	}
}
