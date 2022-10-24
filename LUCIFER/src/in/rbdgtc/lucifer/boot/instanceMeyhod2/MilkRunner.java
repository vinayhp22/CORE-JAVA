package in.rbdgtc.lucifer.boot.instanceMeyhod2;

import in.rbdgtc.lucifer.programs.instanceMeyhod2.Milk;

public class MilkRunner {

	public static void main(String[] args) {

		Milk milk = new Milk(22);
		milk.setQuantity(1);
		milk.headQuaters = "Dairy Circle, Benagluru";
		milk.display();
	}

}
