package in.rbdgtc.lucifer.programs.instanceMeyhod2;

import in.rbdgtc.lucifer.programs.instanceMeyhod2.constants.TypeOfCracker;

public class Cracker {

	public static String brand;
	public TypeOfCracker type = TypeOfCracker.NA; // literal
	public String onlineSite; // const
	public double price; // method
	public double quantity; // ref

	public Cracker(String onlineSite) {
		this.onlineSite = onlineSite;
		this.type = TypeOfCracker.SKY_SHOTS;
		System.out.println("As per 2018 Supreme Court Order, Online Sale of Firecrackers are not Permitted!");
	}

	public void setPrice(double price) {
		this.price = price;

	}

	public  void display() {
		System.out.println("Brand : "+Cracker.brand);
		System.out.println("Type : "+this.type);
		System.out.println("Online Site : "+this.onlineSite);
		System.out.println("Price : "+this.price);
		System.out.println("Quantity :"+this.quantity);
	}
	
	public void totalPrice() {
		double total=this.price*this.quantity;
		System.out.println("Total Price : "+total);
	}
	
	static {
		brand="Sivakasi";
		
	}

}
