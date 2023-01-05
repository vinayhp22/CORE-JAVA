package com.rapido.overRiding.child.satellite;

import com.rapido.overRiding.custom.Satellite;

public class Moon extends Satellite {

	public String satelliteTo = "Earth";

	public Moon() {
		super(384400, true);
	}

	@Override
	public void display() {
		System.out.println(this.satelliteTo);
		super.display();
	}
}
