package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.GeneralStore6;

public class GeneralStore6Runner {

	public static void main(String[] args) {

		String[] paymentOptions = { "Cash", "UPI" };
		String[] itemTypes = { "Chai", "Cool Drinks", "Daily using products", "Groceries" };
		String[] coolDrinks = { "Sting", "7up", "Coke" };
		String[] shampoo = { "TressMe", "Dove" };
		String[] soaps = { "Santoor", "Mysore Sandal" };
		double[] packingCovers = { 0.5, 1, 1.5, 2, 5, 10 };

		GeneralStore6 generalStore6 = new GeneralStore6("Bairaveshwara General Store", "BasaveshwarNagar", 560079,
				"Ramesh", "6am - 10pm", paymentOptions, itemTypes, coolDrinks, shampoo, soaps, packingCovers);

		generalStore6.display();
	}

}
