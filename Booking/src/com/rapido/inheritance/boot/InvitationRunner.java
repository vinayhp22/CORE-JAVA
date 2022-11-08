package com.rapido.inheritance.boot;

import com.rapido.inheritance.child.invitation.Wedding;
import com.rapido.inheritance.constants.CardType;

public class InvitationRunner {

	public static void main(String[] args) {
	
		Object object= new Wedding(CardType.FACE2FACE, 50, 5000, "Magadi");
		
		if(object instanceof Wedding ) {
		Wedding wedding = (Wedding) object;
		System.out.println(wedding.type);
		System.out.println(wedding.price);
		System.out.println(wedding.copies);
		System.out.println(wedding.venue);
		}
}

}
