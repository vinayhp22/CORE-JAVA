package in.rbdgtc.lucifer.programs.instanceMethod;

public class Bakery10 {

	public String name;
	public long contactNo;
	public String location;
	public int noOfDoors;
	public int rating;

	public String[] availableItems;
	public String[] typeOfPuffs;
	public String[] typeOfCakes;
	public String[] icecreamFlavours;
	public String[] biscuits;
	public boolean[] chacolatesAvailable;

	public Bakery10(String name, long contactNo, String location, int noOfDoors, int rating, String[] availableItems,
			String[] typeOfPuffs, String[] typeOfCakes, String[] icecreamFlavours, String[] biscuits,
			boolean[] chacolatesAvailable) {
		this.name = name;
		this.contactNo = contactNo;
		this.location = location;
		this.noOfDoors = noOfDoors;
		this.rating = rating;
		
		this.availableItems = availableItems;
		this.typeOfPuffs = typeOfPuffs;
		this.typeOfCakes = typeOfCakes;
		this.icecreamFlavours = icecreamFlavours;
		this.biscuits = biscuits;
		this.chacolatesAvailable = chacolatesAvailable;
	}

	public void display() {

		System.out.println("Name : " + this.name);
		System.out.println("Contact No : " + this.contactNo);
		System.out.println("Location : " + this.location);
		System.out.println("No. Of Doors : " + this.noOfDoors);
		System.out.println("Rating : " + this.rating);

		System.out.println(System.lineSeparator() + "=====Available Items====");
		for (int i = 0; i < availableItems.length; i++) {
			String ref = availableItems[i];
			System.out.println(ref);

		}
		System.out.println(System.lineSeparator() + "=====Type Of Puffs====");
		for (int i = 0; i < typeOfPuffs.length; i++) {
			String ref1 = typeOfPuffs[i];
			System.out.println(ref1);

		}
		System.out.println(System.lineSeparator() + "=====Type Of Cakes====");
		for (int i = 0; i < typeOfCakes.length; i++) {
			String ref2 = typeOfCakes[i];
			System.out.println(ref2);
		}
		System.out.println(System.lineSeparator() + "=====Icecream Flavours====");
		for (int i = 0; i < icecreamFlavours.length; i++) {
			String ref3 = icecreamFlavours[i];
			System.out.println(ref3);
		}
		System.out.println(System.lineSeparator() + "=====Biscuits====");
		for (int i = 0; i < biscuits.length; i++) {
			String ref4 = biscuits[i];
			System.out.println(ref4);
		}
		System.out.println(System.lineSeparator() + "=====Chacolates Available====");
		for (int i = 0; i < chacolatesAvailable.length; i++) {
			boolean b = chacolatesAvailable[i];
			System.out.println(b);
		}

	}

}