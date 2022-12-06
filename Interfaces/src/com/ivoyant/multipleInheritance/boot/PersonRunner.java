package com.ivoyant.multipleInheritance.boot;

import com.ivoyant.multipleInheritance.classes.VijayaLakshmi;

public class PersonRunner {

	public static void main(String[] args) {

		VijayaLakshmi lakshmi = new VijayaLakshmi("VijayaLakshmi", 21, 100000, 5.1, 50);
		System.out.println(lakshmi.name);
		System.out.println(lakshmi.age);
		System.out.println(lakshmi.salary);
		System.out.println(lakshmi.height);
		System.out.println(lakshmi.weight);
		lakshmi.completedProgram();
		lakshmi.eat();
		lakshmi.executeProgram();
		lakshmi.gst();
		lakshmi.paidTax(10000);
		lakshmi.sleep();
		lakshmi.training();
		lakshmi.uploadedTask();
		lakshmi.vat();
	}

}
