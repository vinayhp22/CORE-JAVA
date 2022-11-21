package com.rapido.inheritance.boot;

import com.rapido.inheritance.child.StarScrewDriver;
import com.rapido.inheritance.custom.ScrewDriver;

public class ScrewDriverRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ScrewDriver driver= new ScrewDriver(); not possible bcz protected const
		StarScrewDriver driver= new StarScrewDriver();
	}

}
