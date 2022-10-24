package in.rbdgtc.lucifer.programs.instanceMeyhod2;

public class Milk {

	public static String brand = "Nandini";
	public String name = "Subham";
	public int price;
	public int quantity;
	public String headQuaters;

	public Milk(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void display() {
		System.out.println("brand : "+Milk.brand);
		System.out.println("name : "+this.name);
		System.out.println("price : "+this.price);
		System.out.println("quantity : "+this.quantity);
		System.out.println("headQuaters : "+this.headQuaters);
		
	}
	static {
		brand = "Nandini";
	}
}
