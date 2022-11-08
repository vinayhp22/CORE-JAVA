package com.rapido.inheritance.child.bachelorParty;

import com.rapido.inheritance.custom.BachelorParty;

public class InAmerica extends BachelorParty {

	public String symbolize = "The last night freedom as an unmarrieed guy";

	public InAmerica(String occasion, String activity, int members) {
		super(occasion, activity, members);
		System.out.println("Const : InAmerica extends BachelorParty");
	}

}
