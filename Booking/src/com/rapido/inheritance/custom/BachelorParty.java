package com.rapido.inheritance.custom;

public class BachelorParty {

	public String occasion;
	public String activity;
	public int members;

	public BachelorParty(String occasion, String activity, int members) {
		super();
		this.occasion = occasion;
		this.activity = activity;
		this.members = members;
		System.out.println("Const : BachelorParty....");
	}

}
