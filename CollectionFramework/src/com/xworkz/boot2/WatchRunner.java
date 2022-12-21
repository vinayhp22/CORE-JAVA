package com.xworkz.boot2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class WatchRunner {
	public static void main(String[] args) {
		Collection<String> watches = new ArrayList<String>();
		watches.add("Titan");
		watches.add("Apple");
		watches.add("Boat");
		watches.add("Fasttrack");
		watches.add("Samsung");

		for (String element : watches) {
			System.out.println(element);
		}

		System.out.println("\n Iterator=====> \n");

		Iterator<String> iterator = watches.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}
}
