package com.capgemini.kantara.thing1.person;

public class Company {
	public String name;
	public String ownerName;
	public Address address;

	public Company(String name, String ownerName, Address address) {
		this.name = name;
		this.ownerName = ownerName;
		this.address = address;
	}

	public void showOff() {
		System.out.println("======= Company ======");
		System.out.println("name : " + name);
		System.out.println("ownerName : " + ownerName);
		if (address != null) {
			address.showOff();
		} else {
			System.out.println("Address is empty or not filled.");
		}
	}
}
