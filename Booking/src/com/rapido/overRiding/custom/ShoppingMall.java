package com.rapido.overRiding.custom;

public class ShoppingMall {

	public String location;
	public String city;

	public ShoppingMall(String location, String city) {
		super();
		this.location = location;
		this.city = city;
	}

	public void display(){
		System.out.println(this.location);
		System.out.println(this.city);
	}
}
