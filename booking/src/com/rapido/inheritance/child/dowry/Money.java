package com.rapido.inheritance.child.dowry;

import com.rapido.inheritance.custom.Dowry;

public class Money extends Dowry {

	public int money;

	public Money(String act, int year, String occation) {
		super(act, year, occation);
		System.out.println("Const : Money");
	}

}
