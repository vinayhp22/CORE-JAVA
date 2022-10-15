package com.institute.mech.boot;

import com.institute.mech.instanceCreation.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish1 = new Fish(null);
		Fish fish2 = new Fish(null, null);
		Fish fish3 = new Fish(null, null, 0);
		Fish fish4 = new Fish(null, null, 0, 0);
		Fish fish5 = new Fish(null, null, 0, 0, 0);
		Fish fish6 = new Fish(null, 0, 0);
		Fish fish7 = new Fish(0, 0);
		Fish fish8 = new Fish(null, 0);

		System.out.println("=====Fish(String name)=====");
		System.out.println(fish1.name);
		System.out.println("=====Fish(String name, String type)=====");
		System.out.println(fish2.name);
		System.out.println(fish2.type);
		System.out.println("=====Fish(String name, String type, double price)=====");
		System.out.println(fish3.name);
		System.out.println(fish3.type);
		System.out.println(fish3.price);
		System.out.println("=====Fish(String name, String type, double price, double weight)=====");
		System.out.println(fish4.name);
		System.out.println(fish4.type);
		System.out.println(fish4.price);
		System.out.println(fish4.weight);
		System.out.println("=====Fish(String name, String type, double price, double weight, double length)=====");
		System.out.println(fish5.name);
		System.out.println(fish5.type);
		System.out.println(fish5.price);
		System.out.println(fish5.weight);
		System.out.println(fish5.length);
		System.out.println("=====Fish(String name, double price, double weight)=====");
		System.out.println(fish6.name);
		System.out.println(fish6.price);
		System.out.println(fish6.weight);
		System.out.println("=====Fish(double weight, double length=====");
		System.out.println(fish7.weight);
		System.out.println(fish7.length);
		System.out.println("=====Fish(String name, double price)=====");
		System.out.println(fish8.name);
		System.out.println(fish8.price);

		fish1 = new Fish("Katla");
		fish2 = new Fish("Katla", "Fresh Water Fish");
		fish3 = new Fish("Katla", "Fresh Water Fish", 100.5);
		fish4 = new Fish("Katla", "Fresh Water Fish", 100.5, 6.7);
		fish5 = new Fish("Katla", "Fresh Water Fish", 100.5, 6.7, 76.3);
		fish6 = new Fish("Katla", 100.5, 6.7);
		fish7 = new Fish(6.7, 76.3);
		fish8 = new Fish("Katla", 100.5);

		System.out.println("=====Fish(String name)=====");
		System.out.println(fish1.name);
		System.out.println("=====Fish(String name, String type)=====");
		System.out.println(fish2.name);
		System.out.println(fish2.type);
		System.out.println("=====Fish(String name, String type, double price)=====");
		System.out.println(fish3.name);
		System.out.println(fish3.type);
		System.out.println(fish3.price);
		System.out.println("=====Fish(String name, String type, double price, double weight)=====");
		System.out.println(fish4.name);
		System.out.println(fish4.type);
		System.out.println(fish4.price);
		System.out.println(fish4.weight);
		System.out.println("=====Fish(String name, String type, double price, double weight, double length)=====");
		System.out.println(fish5.name);
		System.out.println(fish5.type);
		System.out.println(fish5.price);
		System.out.println(fish5.weight);
		System.out.println(fish5.length);
		System.out.println("=====Fish(String name, double price, double weight)=====");
		System.out.println(fish6.name);
		System.out.println(fish6.price);
		System.out.println(fish6.weight);
		System.out.println("=====Fish(double weight, double length=====");
		System.out.println(fish7.weight);
		System.out.println(fish7.length);
		System.out.println("=====Fish(String name, double price)=====");
		System.out.println(fish8.name);
		System.out.println(fish8.price);

	}

}
