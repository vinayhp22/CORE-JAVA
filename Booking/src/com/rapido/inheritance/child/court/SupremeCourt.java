package com.rapido.inheritance.child.court;

import com.rapido.inheritance.custom.Court;

public class SupremeCourt extends Court {

	public String country="INDIA";
	public int establishedYear=1935;
	
	public SupremeCourt(Court court) {
		System.out.println("Running SC....");
	}
}
