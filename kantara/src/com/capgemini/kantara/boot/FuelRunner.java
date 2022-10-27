package com.capgemini.kantara.boot;

import com.capgemini.kantara.thing1.Fuel;

public class FuelRunner {

	public static void main(String[] args) {

		Fuel fuel = new Fuel(true, 101, 108.3);
		fuel.showOff();

	}

}
