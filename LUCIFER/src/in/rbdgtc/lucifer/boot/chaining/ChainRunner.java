package in.rbdgtc.lucifer.boot.chaining;

import in.rbdgtc.lucifer.programs.chaining.Chain;

public class ChainRunner {

	public static void main(String[] args) {

		// type price length material weight stolen usedFor fresh

		Chain chain1 = new Chain();
		System.out.println("Type : " + chain1.type);
		System.out.println("Price : " + chain1.price);
		System.out.println("Length : " + chain1.length);
		System.out.println("Material : " + chain1.material);
		System.out.println("Weight : " + chain1.weight);
		System.out.println("Stolen : " + chain1.stolen);
		System.out.println("Used For : " + chain1.usedFor);
		System.out.println("Fresh : " + chain1.fresh);

		System.out.println("=====================================");

		Chain chain2 = new Chain("Ring");

		System.out.println("Type : " + chain2.type);
		System.out.println("Price : " + chain2.price);
		System.out.println("Length : " + chain2.length);
		System.out.println("Material : " + chain2.material);
		System.out.println("Weight : " + chain2.weight);
		System.out.println("Stolen : " + chain2.stolen);
		System.out.println("Used For : " + chain2.usedFor);
		System.out.println("Fresh : " + chain2.fresh);

		System.out.println("=====================================");

		Chain chain3 = new Chain("Ring", 500000);

		System.out.println("Type : " + chain3.type);
		System.out.println("Price : " + chain3.price);
		System.out.println("Length : " + chain3.length);
		System.out.println("Material : " + chain3.material);
		System.out.println("Weight : " + chain3.weight);
		System.out.println("Stolen : " + chain3.stolen);
		System.out.println("Used For : " + chain3.usedFor);
		System.out.println("Fresh : " + chain3.fresh);

		System.out.println("=====================================");

		Chain chain4 = new Chain("Ring", 500000, 68.67);

		System.out.println("Type : " + chain4.type);
		System.out.println("Price : " + chain4.price);
		System.out.println("Length : " + chain4.length);
		System.out.println("Material : " + chain4.material);
		System.out.println("Weight : " + chain4.weight);
		System.out.println("Stolen : " + chain4.stolen);
		System.out.println("Used For : " + chain4.usedFor);
		System.out.println("Fresh : " + chain4.fresh);

		System.out.println("=====================================");

		Chain chain5 = new Chain("Ring", 500000, 68.67, "Low grade Gold");

		System.out.println("Type : " + chain5.type);
		System.out.println("Price : " + chain5.price);
		System.out.println("Length : " + chain5.length);
		System.out.println("Material : " + chain5.material);
		System.out.println("Weight : " + chain5.weight);
		System.out.println("Stolen : " + chain5.stolen);
		System.out.println("Used For : " + chain5.usedFor);
		System.out.println("Fresh : " + chain5.fresh);

		System.out.println("=====================================");

		Chain chain6 = new Chain("Ring", 500000, 68.67, "Low grade Gold", 69.56);
		System.out.println("Type : " + chain6.type);
		System.out.println("Price : " + chain6.price);
		System.out.println("Length : " + chain6.length);
		System.out.println("Material : " + chain6.material);
		System.out.println("Weight : " + chain6.weight);
		System.out.println("Stolen : " + chain6.stolen);
		System.out.println("Used For : " + chain6.usedFor);
		System.out.println("Fresh : " + chain6.fresh);

		System.out.println("=====================================");

		Chain chain7 = new Chain("Ring", 500000, 68.67, "Low grade Gold", false);
		System.out.println("Type : " + chain7.type);
		System.out.println("Price : " + chain7.price);
		System.out.println("Length : " + chain7.length);
		System.out.println("Material : " + chain7.material);
		System.out.println("Weight : " + chain7.weight);
		System.out.println("Stolen : " + chain7.stolen);
		System.out.println("Used For : " + chain7.usedFor);
		System.out.println("Fresh : " + chain7.fresh);

		System.out.println("=====================================");

		Chain chain8 = new Chain("Ring", 500000, 68.67, "Low grade Gold", "Used for Fingers");
		System.out.println("Type : " + chain8.type);
		System.out.println("Price : " + chain8.price);
		System.out.println("Length : " + chain8.length);
		System.out.println("Material : " + chain8.material);
		System.out.println("Weight : " + chain8.weight);
		System.out.println("Stolen : " + chain8.stolen);
		System.out.println("Used For : " + chain8.usedFor);
		System.out.println("Fresh : " + chain8.fresh);

		System.out.println("==================The END===================");
	}

}
