package com.xworkz.boot;

import java.util.Collection;
import java.util.HashSet;

public class BikeRunner {

	public static void main(String[] args) {

		Collection<String> collection = new HashSet();
		collection.add("Pulsar NS200");
		collection.add("Pulsar 220F");
		collection.add("Pulsar N250");
		collection.add("Ninja Kawasaki");
		collection.add("Splender Plus");
		collection.add("Pulsar NS200");
		collection.add("Yamaha RX-100");
		collection.add("Yamaha R15");
		collection.add("RE Hunter 350");
		collection.add("Honda Activa");
		collection.add("KTM 200 Duke");
		collection.add("KTM 250 Duke");
		collection.add("Yamaha MT 15");
		collection.add("Apache RTR 160");
		collection.add("Honda Shine");
		collection.add("Hero Xpulse 4V");
		collection.add("Java Yezdi");
		collection.add("Dominar 400");
		collection.add("Honda");
		System.out.println(collection.size());
		collection.clear();
		System.out.println(collection.size());

	}

}
