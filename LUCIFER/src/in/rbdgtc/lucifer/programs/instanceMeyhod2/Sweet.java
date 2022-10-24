package in.rbdgtc.lucifer.programs.instanceMeyhod2;

import in.rbdgtc.lucifer.programs.instanceMeyhod2.constants.SweetBrand;

public class Sweet {

	public static String name;  //static block
	public SweetBrand brand = SweetBrand.NA; //literal
	public String shopName; //const
	public double pricePerKG; //method
	public double quantityInKG; //ref

	public Sweet(String shopName) {
		this.shopName = shopName;
		this.brand=SweetBrand.ANAND_SWEETS;
	}

	public void setPrice(double pricePerKG) {
		this.pricePerKG = pricePerKG;
	}	
	
	public void totalPrice() {
		double total=pricePerKG*quantityInKG;
		System.out.println("Total Price : "+total);
	}

	public void display() {
		System.out.println("Name : " + Sweet.name);
		System.out.println("Brand : " + this.brand);
		System.out.println("Shop Name : " + this.shopName);
		System.out.println("Price Per KG : " + this.pricePerKG);
		System.out.println("Quantity In KG : " + this.quantityInKG);
	}

	static {
		name = "Mysore Pak";
	}
}
