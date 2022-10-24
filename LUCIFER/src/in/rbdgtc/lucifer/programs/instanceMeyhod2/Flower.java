package in.rbdgtc.lucifer.programs.instanceMeyhod2;

public class Flower {
	public static String name;
	public int rosesInBunches = 30;
	public String occasion; // Birthday
	public String locationOfFarming; // Karnataka
	public String indication; // a strong passion

	public Flower(String occasion) {
		this.occasion = occasion;
	}

	public void setLocation(String locationOfFarming) {
		this.locationOfFarming = locationOfFarming;
	}

	public void display() {
		System.out.println("Name : " + Flower.name);
		System.out.println("Roses In Bunches : " + this.rosesInBunches);
		System.out.println("Occasion : " + this.occasion);
		System.out.println("Location Of Farming : " + this.locationOfFarming);
		System.out.println(Flower.name +" Indicates : " + this.indication);
	}

	static {
		name = "Red Rose Bouquet";
	}
}
