package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.Hotel12;

public class Hotel12Runner {

	public static void main(String[] args) {

		String[] menu = { "dosa", "idli", "pongal" };
		String[] branches = { "vijaynagr", "jaynagar" };
		String[] employeeNames = { "ramesh", "suresh" };
		String[] mainIngredients = { "salt", "rice", "sambar powder", "water" };

		Hotel12 hotel = new Hotel12("krishna", "yes", 10, 15, "1989", menu, branches, employeeNames, mainIngredients, mainIngredients);

		hotel.display();
	}

}
