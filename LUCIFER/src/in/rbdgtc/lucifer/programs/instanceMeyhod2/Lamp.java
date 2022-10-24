package in.rbdgtc.lucifer.programs.instanceMeyhod2;

public class Lamp {

	public static String brand; // Living Essence
	public String name; // Twilight Ceramic Oval Table Lamp
	public int price; // 995
	public String color = "White & Tan"; // White & Tan
	public String countryOfOrigin; // China

	public Lamp(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void display() {
		System.out.println("Brand : " + Lamp.brand);
		System.out.println("Name : " + this.name);
		System.out.println("Price : " + this.price);
		System.out.println("Color : " + this.color);
		System.out.println("Country of Origin : " + this.countryOfOrigin);

	}
	
	static {
		brand= "Living Essence";
	}
}
