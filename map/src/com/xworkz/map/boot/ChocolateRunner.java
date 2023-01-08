package com.xworkz.map.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocolateRunner {
	public static void main(String[] args) {
		
		Map<String, Double> chocolates = new HashMap<String, Double>();
		chocolates.put("Cadbury Silk", 520D);
		chocolates.put("KitKat", 80D);
		chocolates.put("Keto Cups Almound Butter", 928.58D);
		chocolates.put("Harrys Kisses", 41D);
		chocolates.put("Nuts chocolate", 595D);
		chocolates.put("Best Bite Belgium chocolate", 299D);
		chocolates.put("Cadbury Bournvelle Cranberry Dark", 72D);
		chocolates.put("Febelle ganache", 851D);
		chocolates.put("Cadbury Bournvelle Rich Cocoa Dark", 72D);
		chocolates.put("Ferrero Rocher Moments", 125D);
		
		System.out.println("Loop keys==========");
		Set<String> keys =chocolates.keySet();
		keys.forEach(e->System.out.println(e));
		
		System.out.println("\nLoop Values============");
		Collection<Double> values = chocolates.values();
		values.forEach(e->System.out.println(e));
		
		System.out.println("\nLoop Entries=============");
		Collection<Entry<String, Double>> entries = chocolates.entrySet();
		System.out.println(entries);
		entries.forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	}
}
