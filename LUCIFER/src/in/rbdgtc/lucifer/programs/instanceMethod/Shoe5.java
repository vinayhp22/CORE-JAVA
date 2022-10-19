package in.rbdgtc.lucifer.programs.instanceMethod;

public class Shoe5 {

	public String brand;
	public String type;
	public int price;
	public String website;
	public boolean forMen;

	public String[] otherCompetaters;
	public String[] otherTypes;
	public char[] sizes;
	public String[] otherWebsites;
	public int[] pricesInOtherWebsites;
	public String[] toWhom;

	public Shoe5(String brand, String type, int price, String website, boolean forMen, String[] otherCompetaters,
			String[] otherTypes, char[] sizes, String[] otherWebsites, int[] pricesInOtherWebsites, String[] toWhom) {

		this.brand = brand;
		this.type = type;
		this.price = price;
		this.website = website;
		this.forMen = forMen;

		this.otherCompetaters = otherCompetaters;
		this.otherTypes = otherTypes;
		this.sizes = sizes;
		this.otherWebsites = otherWebsites;
		this.pricesInOtherWebsites = pricesInOtherWebsites;
		this.toWhom = toWhom;

	}

	public void display() {

		System.out.println("Brand : " + this.brand);
		System.out.println("Type : " + this.type);
		System.out.println("Price : " + this.price);
		System.out.println("Website : " + this.website);
		System.out.println("For Men :" + this.forMen);

		System.out.println(System.lineSeparator() + "====Other Competaters====");
		for (int i = 0; i < otherCompetaters.length; i++) {
			String string = otherCompetaters[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Other Types====");
		for (int i = 0; i < otherTypes.length; i++) {
			String string = otherTypes[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Sizes====");
		for (int i = 0; i < sizes.length; i++) {
			char c = sizes[i];
			System.out.println(c);
		}

		System.out.println(System.lineSeparator() + "====Other Websites====");
		for (int i = 0; i < otherWebsites.length; i++) {
			String string = otherWebsites[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Prices In Other Websites====");
		for (int i = 0; i < pricesInOtherWebsites.length; i++) {
			int j = pricesInOtherWebsites[i];
			System.out.println(j);
		}
		System.out.println(System.lineSeparator() + "====To Whom====");
		for (int i = 0; i < toWhom.length; i++) {
			String string = toWhom[i];
			System.out.println(string);
		}

	}
}
