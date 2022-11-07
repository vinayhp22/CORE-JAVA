package com.rapido.inheritance.child.court;

import com.rapido.inheritance.custom.Court;

public class HighCourt extends Court{

	public String state="Karnataka";
	public int noOfStatesUnderJurisdiction=1;
	
	public HighCourt(Court court) {
		System.out.println("Running HC....");
	}
}
