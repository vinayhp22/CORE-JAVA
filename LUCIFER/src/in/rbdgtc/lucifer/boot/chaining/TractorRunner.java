package in.rbdgtc.lucifer.boot.chaining;

import in.rbdgtc.lucifer.programs.chaining.Tractor;

public class TractorRunner {

	public static void main(String[] args) {

		Tractor tractor1 = new Tractor();
		System.out.println("Name : " + tractor1.name);
		System.out.println("Brand : " + tractor1.brand);
		System.out.println("Price : Rs. " + tractor1.price);
		System.out.println("Color : " + tractor1.color);
		System.out.println("Power : " + tractor1.hp + "kW");
		System.out.println("Model : " + tractor1.model);

		System.out.println("============================");

		Tractor tractor2 = new Tractor("Mahindra JIVO 365 di 4wd");
		System.out.println("Name : " + tractor2.name);
		System.out.println("Brand : " + tractor2.brand);
		System.out.println("Price : Rs. " + tractor2.price);
		System.out.println("Color : " + tractor2.color);
		System.out.println("Power : " + tractor2.hp + "kW");
		System.out.println("Model : " + tractor2.model);

		System.out.println("============================");

		Tractor tractor3 = new Tractor("Mahindra JIVO 365 di 4wd", "Mahindra & Mahidra");
		System.out.println("Name : " + tractor3.name);
		System.out.println("Brand : " + tractor3.brand);
		System.out.println("Price : Rs. " + tractor3.price);
		System.out.println("Color : " + tractor3.color);
		System.out.println("Power : " + tractor3.hp + "kW");
		System.out.println("Model : " + tractor3.model);

		System.out.println("============================");

		Tractor tractor4 = new Tractor("Mahindra JIVO 365 di 4wd", "Mahindra & Mahidra", 550000);
		System.out.println("Name : " + tractor4.name);
		System.out.println("Brand : " + tractor4.brand);
		System.out.println("Price : Rs. " + tractor4.price);
		System.out.println("Color : " + tractor4.color);
		System.out.println("Power : " + tractor4.hp + "kW");
		System.out.println("Model : " + tractor4.model);

		System.out.println("============================");

		Tractor tractor5 = new Tractor("Mahindra JIVO 365 di 4wd", "Mahindra & Mahidra", 550000, "Red");
		System.out.println("Name : " + tractor5.name);
		System.out.println("Brand : " + tractor5.brand);
		System.out.println("Price : Rs. " + tractor5.price);
		System.out.println("Color : " + tractor5.color);
		System.out.println("Power : " + tractor5.hp + "kW");
		System.out.println("Model : " + tractor5.model);

		System.out.println("============================");

		Tractor tractor6 = new Tractor("Mahindra JIVO 365 di 4wd", 550000);
		System.out.println("Name : " + tractor6.name);
		System.out.println("Brand : " + tractor6.brand);
		System.out.println("Price : Rs. " + tractor6.price);
		System.out.println("Color : " + tractor6.color);
		System.out.println("Power : " + tractor6.hp + "kW");
		System.out.println("Model : " + tractor6.model);

		System.out.println("============================");

		System.out.println("The End....");
	}

}
