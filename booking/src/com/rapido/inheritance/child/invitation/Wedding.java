package com.rapido.inheritance.child.invitation;

import com.rapido.inheritance.constants.CardType;
import com.rapido.inheritance.custom.Invitation;

public class Wedding extends Invitation {

	public String venue;

	public Wedding(CardType type, double price, int copies, String venue) {
		super(type, price, copies);
		this.copies=copies;
		System.out.println("Const : Wedding...");
	}

	/*public Wedding(CardType type) {
		System.out.println("Default const of Wedding...");
		super.type = type;
		
	}*/
	
	
}
