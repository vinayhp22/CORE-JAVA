package com.capgemini.kantara.thing1.pillar;

public class Company {

	public String name;
	public String type;

	public Company(String name, String type) {
		this.name = name;
		this.type = type;
	}

	public void showOff() {
		System.out.println("Running Company.....");
		System.out.println("name : " + name);
		System.out.println("type : " + type);
	}
}
