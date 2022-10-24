package in.rbdgtc.lucifer.boot.instanceMeyhod2;

import in.rbdgtc.lucifer.programs.instanceMeyhod2.Sweet;

public class SweetRunner {

	public static void main(String[] args) {

		Sweet sweet = new Sweet("Kanthi Sweets");
		sweet.setPrice(100.5);
		sweet.quantityInKG = 5;
		sweet.display();
		sweet.totalPrice();

	}

}
