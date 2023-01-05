package com.rapido.overRiding.child.criminal;

import com.rapido.overRiding.custom.Criminal;

public class Ravi extends Criminal {

	public String location = "J-spiders";

	public Ravi() {
		super("Dada Ravi", "Kumala Kayi kalla", "Male", false);
	}

	public void display() {
		super.display();
		System.out.println(this.location);
	}

}
