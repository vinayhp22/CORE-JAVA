package in.rbdgtc.lucifer.boot.instanceMeyhod2;

import in.rbdgtc.lucifer.programs.instanceMeyhod2.Cracker;

public class CrackerRunner {

	public static void main(String[] args) {
		
		Cracker cracker = new Cracker("https://crackersonline.in/");
		cracker.quantity=50;
		cracker.setPrice(10);
		cracker.display();
		cracker.totalPrice();
		
	}

}
