package com.rapido.inheritance.child.catering;

import com.rapido.inheritance.custom.Catering;

public class CorporateCatering extends Catering {

	public String venue;

	public CorporateCatering(String name, double exp, int cookers, String venue) {
		super(name, exp, cookers);
		this.venue = venue;
		System.out.println("Const : CorporateCatering ");
	}

}
