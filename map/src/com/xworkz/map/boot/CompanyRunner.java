package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import javax.crypto.Mac;

public class CompanyRunner {

	public static void main(String[] args) {
		Map<String, String> companies = new HashMap<String, String>();
		companies.put("Oracle", "www.Oracle.com");
		companies.put("Google", "www.google.com");
		companies.put("Facebook", "www.facebook.com");
		companies.put("SAP", "www.sap.com");
		companies.put("IBM", "www.ibm.com");
		companies.put("xworkz", "www.x-workz.in");
		companies.put("Tesla", "www.tesla.com");
		companies.put("TCS", "www.tcs.com");
		companies.put("MySQL AB", "www.mysqlab.com");
		companies.put("Ivoyant", "www.ivoyant.com");
		
		System.out.println("Loop keys ==================");
		Set<String> keys = companies.keySet();
		keys.forEach(e->System.out.println(e));
		
		System.out.println("\nLoop values=============");
		Collection<String> values = companies.values();
		values.forEach(e -> System.out.println(e));

		System.out.println("\nLoop Entries =============");
		Collection<Entry<String, String>> entries = companies.entrySet();
		System.out.println(entries);
		entries.forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
		
		
	}
}
