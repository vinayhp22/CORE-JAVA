package com.rapido.overRiding.child.shoppingMall;

import com.rapido.overRiding.custom.ShoppingMall;

public class Orion extends ShoppingMall {

	public boolean cinema = true;
	
	public Orion() {
	super("RajajiNagar", "Blr");
	}
	
	public void display() {
		super.display();
		System.out.println(this.cinema);
	}
}
