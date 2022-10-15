package in.rbdgtc.lucifer.programs.chaining;

public class Tractor {

	// name, brand, price, color, hp, model
	// 6 const with chaining

	public String name;
	public String brand;
	public int price;
	public String color;
	public double hp;
	public int model = 2022;

	public Tractor() {
		System.out.println("default const...");
	}

	public Tractor(String name) {
		this.name = name;
		System.out.println("Constructor with String..");
	}

	public Tractor(String name, String brand) {
		this(name);
		this.brand = brand;
		System.out.println("Constructor with String & String..");
	}

	public Tractor(String name, String brand, int price) {
		this(name, brand);
		this.price = price;
		System.out.println("Constructor with String, String & String...");
	}

	public Tractor(String name, String brand, int price, String color) {
		this(name, brand, price);
		this.color = color;
		System.out.println("Constructor with String, String, String & double...");
	}

	public Tractor(String name, int price) {
		this(name);
		this.price = price;
		System.out.println("Const with String & price...");
	}

}
