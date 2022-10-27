package com.capgemini.kantara.thing1;

public class Weapon {

	public String name;
	public String use;
	public double weight;

	public Weapon(String name, String use, double weight) {
		this.name = name;
		this.use = use;
		this.weight = weight;
	}

	public void showOff() {
		System.out.println("Weapon Running....");
		System.out.println("name : " + name);
		System.out.println("use : " + use);
		System.out.println("weight : " + weight);
	}

}
