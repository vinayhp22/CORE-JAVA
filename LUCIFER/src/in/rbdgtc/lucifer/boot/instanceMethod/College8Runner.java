package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.College8;

public class College8Runner {

	public static void main(String[] args) {

		String[] branchas = { "CSE", "ECS", "ME", "Civi", "Automobile" };
		String[] collegeNames = { "GEC Chamarajanagar", "GEC Hassan", "GEC KUshalNAgar" };
		String[] places = { "chamarajanagara", "hassan", "mandya", "davanagere" };
		String[] collageColors = { "White", "Red", "brown", "yellow" };

		College8 college8 = new College8("Davanagere", collageColors, 2, branchas, 4, places, "Venkatesh",
				collegeNames);

		college8.display();
	}

}
