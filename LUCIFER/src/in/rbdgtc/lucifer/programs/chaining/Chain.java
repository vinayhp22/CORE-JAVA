package in.rbdgtc.lucifer.programs.chaining;

public class Chain {
	// type price length material weight stolen usedFor fresh
	// 8const with chaining

	public String type; // "Ring"
	public int price; // 500000
	public double length = 566.3; // 68cms
	public String material = "Guru yavdo ond kodapa..."; // "Gold";
	public double weight = 6695.6; // 66.23
	public boolean stolen = true; // false
	public String usedFor = "Gotillllaaa.."; // fingers
	public boolean fresh = false; // true

	public Chain() {
		System.out.println("Default Const...");
	}

	public Chain(String type) {
		this.type=type;
		System.out.println("Const with String...");
	}

	public Chain(String type, int price) {
		this(type);
		this.price=price;
		System.out.println("Const with String & int...");
	}

	public Chain(String type, int price, double length) {
		this(type, price);
		this.length=length;
		System.out.println("Const with String, int & double...");
	}

	public Chain(String type, int price, double length, String material) {
		this(type, price, length);
		this.material=material;
		System.out.println("Const with String, int, double & String....");
	}

	public Chain(String type, int price, double length, String material, double weight) {
		this(type, price, length, material);
		this.weight=weight;
		System.out.println("Const with String, int, double, String & double....");
	}

	public Chain(String type, int price, double length, String material, boolean stolen) {
		this(type, price, length, material);
		this.stolen=stolen;
		System.out.println("Const with String, int, double & boolean....");
	}

	public Chain(String type, int price, double length, String material, String usedFor) {
		this(type, price, length, material);
		this.usedFor=usedFor;
		System.out.println("Const with String, int, double & String....");
	}
}
