package com.xworkz.boot2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AnimalRunner {

	public static void main(String[] args) {

		Collection<String> animals = new ArrayList<String>();
		String prani1 = "Dog";
		String prani2 = "Cat";
		String prani3 = "Cow";
		String prani4 = "HUMAN BEING";
		String prani5 = "Goat";
		String prani6 = "Lion";
		String prani7 = "Tiger";
		String prani8 = "Rabbit";
		String prani9 = "Donkey";
		String prani10 = "Snake";
		
		animals.add(prani1);
		animals.add(prani2);
		animals.add(prani3);
		animals.add(prani4);
		animals.add(prani5);
		animals.add(prani6);
		animals.add(prani7);
		animals.add(prani8);
		animals.add(prani9);
		animals.add(prani10);
		
		System.out.println(animals);
		for (String element : animals) {
			System.out.println(element);
		}
		
		System.out.println("\n Iterator=====> \n");
		Iterator<String> pranis = animals.iterator();
		
		while(pranis.hasNext()) {
			System.out.println(pranis.next());
		}
	}

}
