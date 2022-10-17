package in.rbdgtc.lucifer.boot.chaining;

import in.rbdgtc.lucifer.programs.chaining.TextileShop;

public class TextileShopRunner {

	public static void main(String[] args) {

		TextileShop textileShop1 = new TextileShop();
		System.out.println("Owner Name : " + textileShop1.ownerName);
		System.out.println("Owner's wife name : " + textileShop1.ownerWifeName);
		System.out.println("Owner's Daughter Name : " + textileShop1.ownerDaughterName);
		System.out.println("Owner's Daughter Num : " + textileShop1.ownerDaughterNumber);
		System.out.println("No. of wives, the owner had : " + textileShop1.ownerNoOfWifes);
		System.out.println("Shop number : " + textileShop1.shopNo);
		System.out.println("Contact Number : " + textileShop1.contactNo);

		System.out.println("=============================");

		TextileShop textileShop2 = new TextileShop("Jai Ram");
		System.out.println("Owner Name : " + textileShop2.ownerName);
		System.out.println("Owner's wife name : " + textileShop2.ownerWifeName);
		System.out.println("Owner's Daughter Name : " + textileShop2.ownerDaughterName);
		System.out.println("Owner's Daughter Num : " + textileShop2.ownerDaughterNumber);
		System.out.println("No. of wives, the owner had : " + textileShop2.ownerNoOfWifes);
		System.out.println("Shop number : " + textileShop2.shopNo);
		System.out.println("Contact Number : " + textileShop2.contactNo);

		System.out.println("=============================");

		TextileShop textileShop3 = new TextileShop("Jai Ram", "Laxmakka");
		System.out.println("Owner Name : " + textileShop3.ownerName);
		System.out.println("Owner's wife name : " + textileShop3.ownerWifeName);
		System.out.println("Owner's Daughter Name : " + textileShop3.ownerDaughterName);
		System.out.println("Owner's Daughter Num : " + textileShop3.ownerDaughterNumber);
		System.out.println("No. of wives, the owner had : " + textileShop3.ownerNoOfWifes);
		System.out.println("Shop number : " + textileShop3.shopNo);
		System.out.println("Contact Number : " + textileShop3.contactNo);

		System.out.println("=============================");

		TextileShop textileShop4 = new TextileShop("Jai Ram", "Laxmakka", "Sita Mahalaxmi");
		System.out.println("Owner Name : " + textileShop4.ownerName);
		System.out.println("Owner's wife name : " + textileShop4.ownerWifeName);
		System.out.println("Owner's Daughter Name : " + textileShop4.ownerDaughterName);
		System.out.println("Owner's Daughter Num : " + textileShop4.ownerDaughterNumber);
		System.out.println("No. of wives, the owner had : " + textileShop4.ownerNoOfWifes);
		System.out.println("Shop number : " + textileShop4.shopNo);
		System.out.println("Contact Number : " + textileShop4.contactNo);

		System.out.println("=============================");

		TextileShop textileShop5 = new TextileShop("Jai Ram", "Laxmakka", "Sita Mahalaxmi", 89705698696l );
		System.out.println("Owner Name : " + textileShop5.ownerName);
		System.out.println("Owner's wife name : " + textileShop5.ownerWifeName);
		System.out.println("Owner's Daughter Name : " + textileShop5.ownerDaughterName);
		System.out.println("Owner's Daughter Num : " + textileShop5.ownerDaughterNumber);
		System.out.println("No. of wives, the owner had : " + textileShop5.ownerNoOfWifes);
		System.out.println("Shop number : " + textileShop5.shopNo);
		System.out.println("Contact Number : " + textileShop5.contactNo);

		System.out.println("=============================");

		TextileShop textileShop6 = new TextileShop("Jai Ram", "Laxmakka", "Sita Mahalaxmi", 12);
		System.out.println("Owner Name : " + textileShop6.ownerName);
		System.out.println("Owner's wife name : " + textileShop6.ownerWifeName);
		System.out.println("Owner's Daughter Name : " + textileShop6.ownerDaughterName);
		System.out.println("Owner's Daughter Num : " + textileShop6.ownerDaughterNumber);
		System.out.println("No. of wives, the owner had : " + textileShop6.ownerNoOfWifes);
		System.out.println("Shop number : " + textileShop6.shopNo);
		System.out.println("Contact Number : " + textileShop6.contactNo);

		System.out.println("=============================");

		TextileShop textileShop7 = new TextileShop("Jai Ram", "Laxmakka", "Sita Mahalaxmi", "ABC1256");
		System.out.println("Owner Name : " + textileShop7.ownerName);
		System.out.println("Owner's wife name : " + textileShop7.ownerWifeName);
		System.out.println("Owner's Daughter Name : " + textileShop7.ownerDaughterName);
		System.out.println("Owner's Daughter Num : " + textileShop7.ownerDaughterNumber);
		System.out.println("No. of wives, the owner had : " + textileShop7.ownerNoOfWifes);
		System.out.println("Shop number : " + textileShop7.shopNo);
		System.out.println("Contact Number : " + textileShop7.contactNo);

		System.out.println("=============================");

		TextileShop textileShop8 = new TextileShop("Jai Ram", "Laxmakka", 9486636566l);
		System.out.println("Owner Name : " + textileShop8.ownerName);
		System.out.println("Owner's wife name : " + textileShop8.ownerWifeName);
		System.out.println("Owner's Daughter Name : " + textileShop8.ownerDaughterName);
		System.out.println("Owner's Daughter Num : " + textileShop8.ownerDaughterNumber);
		System.out.println("No. of wives, the owner had : " + textileShop8.ownerNoOfWifes);
		System.out.println("Shop number : " + textileShop8.shopNo);
		System.out.println("Contact Number : " + textileShop8.contactNo);

		System.out.println("=============================");

		System.out.println("=========.....The End....===========");

	}

}
