package com.rapido.overRiding.custom;

public class PoliticalParty {

	public String flag;
	public boolean nationalParty;

	public PoliticalParty(String flag, boolean nationalParty) {
		super();
		this.flag = flag;
		this.nationalParty = nationalParty;
	}

	public void display() {
		System.out.println(this.flag);
		System.out.println(this.nationalParty);
	}
}
