package com.rapido.overRiding.child.politicalParty;

import com.rapido.overRiding.custom.PoliticalParty;

public class BJP extends PoliticalParty {

	public String Leader = "Narendra Modi";

	public BJP() {
		super("Lotus", true);
	}
	
	public void display() {
		super.display();
		System.out.println(this.Leader);
	}

}
