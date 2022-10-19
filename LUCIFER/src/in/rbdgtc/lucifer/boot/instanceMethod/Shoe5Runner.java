package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.Shoe5;

public class Shoe5Runner {

	public static void main(String[] args) {

		String[] otherCompetaters = { "Adidas", "Nike", "NIVIA", "Sparx" };
		String[] otherTypes = { "Sneakers", "Running Shoe", "Walking Shoe", "Boot" };
		char[] sizes = { 'S', 'M', 'L' };
		String[] otherWebsites = { "FlipKart", "Myntra", "Snapdeal" };
		int[] pricesInOtherWebsites = { 600, 756, 1044, 999 };
		String[] toWhom = { "Men", "Women", "Kids" };

		Shoe5 shoe = new Shoe5("PUMA", "Casual", 889, "AMAZON.in", true, otherCompetaters, otherTypes, sizes,
				otherWebsites, pricesInOtherWebsites, toWhom);

		shoe.display();

	}

}
