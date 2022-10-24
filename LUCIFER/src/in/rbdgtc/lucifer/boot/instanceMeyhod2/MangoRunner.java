package in.rbdgtc.lucifer.boot.instanceMeyhod2;

import in.rbdgtc.lucifer.programs.instanceMeyhod2.Mango;

public class MangoRunner {

	public static void main(String[] args) {

		Mango mango = new Mango(true);
		mango.setPrice(105.66);
		mango.quantity = 5;
		mango.display();

	}

}
