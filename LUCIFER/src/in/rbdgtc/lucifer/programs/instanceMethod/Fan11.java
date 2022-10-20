package in.rbdgtc.lucifer.programs.instanceMethod;

public class Fan11 {

	public double price;
	public int noOfWings;
	public String material;
	public String brand;
	public int productRating;

	public String[] category;
	public String[] brands;
	public String[] seller;
	public boolean[] energySaving;
	public String[] types;
	public String[] top5Manufaturers;

	public Fan11(double price, int noOfWings, String material, String brand, int productRating, String[] category,
			String[] brands, String[] seller, boolean[] energySaving, String[] types, String[] top5Manufaturers) {
		this.price = price;
		this.noOfWings = noOfWings;
		this.material = material;
		this.brand = brand;
		this.productRating = productRating;

		this.category = category;
		this.brands = brands;
		this.seller = seller;
		this.energySaving = energySaving;
		this.types = types;
		this.top5Manufaturers = top5Manufaturers;
	}

	public void display() {
		System.out.println("class fan started");
		System.out.println(this.price);
		System.out.println(this.noOfWings);
		System.out.println(this.material);
		System.out.println(this.brand);
		System.out.println(this.productRating);

		System.out.println(System.lineSeparator() + "=====Category====");
		for (int i = 0; i < category.length; i++) {
			System.out.println(category[i]);
		}
		
		System.out.println(System.lineSeparator() + "=====Brands====");
		for (int i = 0; i < brands.length; i++) {
			System.out.println(brands[i]);
		}
		
		System.out.println(System.lineSeparator() + "=====Seller====");
		for (int i = 0; i < seller.length; i++) {
			System.out.println(seller[i]);
		}

		System.out.println(System.lineSeparator() + "=====Energy Saving====");
		for (int i = 0; i < energySaving.length; i++) {
			System.out.println(energySaving[i]);
		}
		
		System.out.println(System.lineSeparator() + "=====Types====");
		for (int i = 0; i < types.length; i++) {
			String string = types[i];
			System.out.println(string);
		}
		
		System.out.println(System.lineSeparator() + "=====Top 5 Manufaturers====");
		for (int i = 0; i < top5Manufaturers.length; i++) {
			String string = top5Manufaturers[i];
			System.out.println(string);
		}
	}
}
