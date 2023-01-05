package com.rapido.inheritance.boot;

import com.rapido.inheritance.child.dowry.Money;
import com.rapido.inheritance.custom.Dowry;

public class DowryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dowry dowry = new Money("Dowry Prohibition Act", 1961, "marriage");
		if (dowry instanceof Money) {
			Money money = (Money) dowry;
			money.money = 50000000;
			System.out.println(money.act);
			System.out.println(money.year);
			System.out.println(money.occation);
			System.out.println(money.money);
		}
	}

}
