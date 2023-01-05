package com.rapido.inheritance.boot;

import com.rapido.inheritance.child.catering.CorporateCatering;
import com.rapido.inheritance.custom.Catering;

public class CateringRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Catering catering = new CorporateCatering("SIMPLY", 10.5, 15, "TCS campus");

		if (catering instanceof CorporateCatering) {
			CorporateCatering corporate = (CorporateCatering) catering;
			System.out.println(corporate.name);
			System.out.println(corporate.exp);
			System.out.println(corporate.cookers);
			System.out.println(corporate.venue);
		}
	}

}
