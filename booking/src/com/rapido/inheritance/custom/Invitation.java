package com.rapido.inheritance.custom;

import com.rapido.inheritance.constants.CardType;

public class Invitation {

	public CardType type;
	public double price;
	public int copies;
	
	public Invitation(CardType type, double price, int copies) {
		super();
		this.type = type;
		this.price = price;
		this.copies = copies;
		System.out.println("Const : Invitation...");
	}
	
	
	
	
}
