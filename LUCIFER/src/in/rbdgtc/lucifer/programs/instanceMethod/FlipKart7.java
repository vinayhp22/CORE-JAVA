package in.rbdgtc.lucifer.programs.instanceMethod;

public class FlipKart7 {

	public String commerceWebsiteName;
	public String profileName;
	public long profileNumber;
	public String productName;
	public int price;

	public String[] categories;
	public String[] paymentMode;
	public String[] groceries;
	public String[] deliveryAddress;
	public String[] offers;
	public String[] carts;

	public FlipKart7(String commerceWebsiteName, String profileName, long profileNumber, String productName, int price,
			String[] categories, String[] paymentMode, String[] groceries, String[] deliveryAddress, String[] offers,
			String[] carts) {

		this.commerceWebsiteName = commerceWebsiteName;
		this.profileName = productName;
		this.profileNumber = profileNumber;
		this.productName = productName;
		this.price = price;

		this.categories = categories;
		this.paymentMode = paymentMode;
		this.groceries = groceries;
		this.deliveryAddress = deliveryAddress;
		this.offers = offers;
		this.carts = carts;

	}

	public void display() {

		System.out.println("Commerce Website Name : " + this.commerceWebsiteName);
		System.out.println("Product Name : " + this.productName);
		System.out.println("Profile Number : " + this.profileNumber);
		System.out.println("Product Name : " + this.productName);
		System.out.println("Price :" + this.price);

		System.out.println(System.lineSeparator() + "====Categories====");
		for (int i = 0; i < categories.length; i++) {
			String string = categories[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Payment Mode====");
		for (int i = 0; i < paymentMode.length; i++) {
			String string = paymentMode[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Groceries====");
		for (int i = 0; i < groceries.length; i++) {
			String string = groceries[i];
			System.out.println(string);
		}

		System.out.println(System.lineSeparator() + "====Delivery Address====");
		for (int i = 0; i < deliveryAddress.length; i++) {
			String string = deliveryAddress[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Offers====");
		for (int i = 0; i < offers.length; i++) {
			String string = offers[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Carts====");
		for (int i = 0; i < carts.length; i++) {
			String string = carts[i];
			System.out.println(string);
		}
	}
}
