package in.rbdgtc.lucifer.boot.instanceMeyhod2;

import in.rbdgtc.lucifer.programs.instanceMeyhod2.Flower;

public class FlowerRunner {

	public static void main(String[] args) {

		Flower flower = new Flower("Birthday");
		flower.setLocation("Karnataka");
		flower.indication = "A strong passion";
		flower.display();
	}

}
