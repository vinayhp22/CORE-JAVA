package com.rapido.overRiding.child.director;

import com.rapido.overRiding.custom.Director;

public class PrashanthNeel extends Director {

	public String topMovie = "Kgf";

	public PrashanthNeel() {
		super("SandalWood", 5);
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println(this.topMovie);
	}

}
