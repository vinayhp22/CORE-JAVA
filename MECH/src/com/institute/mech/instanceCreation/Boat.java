package com.institute.mech.instanceCreation;

public class Boat {

	public String name;
	public String color;
	public String companyName;
	public String type;
	public String owner;

	public Boat() {
		System.out.println("Deafult constructor..");
	}

	public Boat(String name) {
		System.out.println("String referenced constructor..");
		this.name = name;
	}

	public Boat(String name, String color) {
		this(name);
		System.out.println("String and String referenced constructor..");
		this.color = color;
	}

	public Boat(String name, String color, String companyName) {
		this(name, color);
		this.companyName = companyName;
	}

	public Boat(String name, String color, String companyName, String type) {
		this(name, color, companyName);
		this.type = type;
	}

	public Boat(String name, String color, String companyName, String type, String owner) {
		this(name, color, companyName, type);
		this.owner = owner;
	}

}
