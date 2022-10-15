package com.institute.mech.instanceCreation;

public class Fish {

	public String name;
	public String type;
	public double price;
	public double weight;
	public double length;

	
	public Fish(String name) {
		this.name = name;
	}

	public Fish(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public Fish(String name, String type, double price) {
		this.name = name;
		this.type = type;
		this.price = price;

	}

	public Fish(String name, String type, double price, double weight) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.weight = weight;
	}

	public Fish(String name, String type, double price, double weight, double length) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.weight = weight;
		this.length = length;
	}

	public Fish(String name, double price, double weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public Fish(double weight, double length) {
		this.weight = weight;
		this.length = length;
	}

	public Fish(String name, double price) {
		this.name = name;
		this.price = price;
	}

}
