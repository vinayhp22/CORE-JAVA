package com.xworkz.boot;

import java.util.Collection;
import java.util.TreeSet;

public class SweetsRunner {

	public static void main(String[] args) {
		
		Collection<String> collection = new TreeSet();		
		collection.add("Jamun");
		String sweet = "Rasgulla";
		String sweet1 = "Jelebi";
		collection.add(sweet);
		collection.add(sweet1);
		collection.add("Payasam");
		collection.add("Shrikhand");
		collection.add("Halwa");
		collection.add("Laddu");
		collection.add("Mysore Pak");
		collection.add("Mitai");
		collection.add("Badam Halwa");
		collection.add("Khaja");
		collection.add("Kayi Obbattu");
		collection.add("Kulfi");

		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());
		
	}

}
