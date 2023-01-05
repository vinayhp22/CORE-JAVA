package com.rapido.inheritance.boot;

import com.rapido.inheritance.child.bachelorParty.InAmerica;
import com.rapido.inheritance.custom.BachelorParty;

public class BachelorPartyRunner {

	public static void main(String[] args) {

		BachelorParty party = new InAmerica("Marriage", "over drinking", 6);
		if (party instanceof InAmerica) {
			InAmerica america = (InAmerica) party;
			System.out.println(america.occasion);
			System.out.println(america.activity);
			System.out.println(america.members);
			System.out.println(america.symbolize);
		} else {
			System.out.println("ClassCastException...");
		}

	}

}
