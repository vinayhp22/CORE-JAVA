package com.capgemini.kantara.thing1;

import com.capgemini.kantara.constants.FuelType;

public class Fuel {

	public Brand brand = new Brand("Indian Oil", "B520A56389HH", "Goraguntepalya", 4);
	public boolean special;// :true,
	public FuelType type = FuelType.PETROL;
	public int price;
	public double quantity;

	public Fuel(boolean special, int price, double quantity) {

		this.special = special;
		this.price = price;
		this.quantity = quantity;
	}

	public void totalPrice() {

		double totalPrice = this.price * this.quantity;
		System.out.println("totalPrice : " + totalPrice);
	}

	public void showOff() {
		
		brand.showOff();
		System.out.println("special : " + special);
		System.out.println("type : " + type);
		System.out.println("price : " + price);
		System.out.println("quantity : " + quantity);
		totalPrice();

	}

}
/*
 * Fuel: brand:custom,special:true,type:enum,price,quantity
 * showOff()-->brand.showOff totalPrice()
 * Brand:name,gstNo,location:custom,rating showOff()
 */