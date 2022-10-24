package in.rbdgtc.lucifer.programs.instanceMeyhod2;

public class Mango {

	public static String name; // Raspuri mango
	public String grownIn = "in and around Bengaluru, Ramanagara, Kolar, Chikkaballapura, Tumakuru";
	public boolean sweet;
	public double price;
	public double quantity;

	public Mango(boolean sweet) {
		this.sweet = sweet;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void display() {
		System.out.println("name : " + name);
		System.out.println("grownIn : " + this.grownIn);
		System.out.println("sweet : " + this.sweet);
		System.out.println("price : " + this.price);
		System.out.println("quantity : " + this.quantity);
	}

	static {
		name = "Raspuri mango";
	}
}
