package com.ivoyant.multipleInheritance.classes;

import com.ivoyant.multipleInheritance.interfaces.KarnatakaRTO;

public class VijayaLakshmi extends JavaTrainee implements KarnatakaRTO{

	public VijayaLakshmi(String name, int age, double salary, double height, double weight) {
		super(name, age, salary, height, weight);
		System.out.println("Running VijayaLakshmi const");
	}

	@Override
	public boolean paidTax(double taxAmount) {
		System.out.println("Overided paidTax");
		return true;
	}

	@Override
	public double gst() {
		System.out.println("Overided gst");
		return 15000;
	}

	@Override
	public double vat() {
		System.out.println("Overided vat");
		return 10000;
	}

}
