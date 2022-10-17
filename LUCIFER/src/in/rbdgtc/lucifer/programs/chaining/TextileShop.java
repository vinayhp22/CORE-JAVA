package in.rbdgtc.lucifer.programs.chaining;

public class TextileShop {
	/*
	 * ownerName, ownerWifeName, ownerDaughterName, ownerDaughterNumber,
	 * ownerNoOfWifes, shopNo, contactNo 8const with chaining
	 */
	public String ownerName;
	public String ownerWifeName;
	public String ownerDaughterName;
	public long ownerDaughterNumber;
	public int ownerNoOfWifes;
	public String shopNo;
	public long contactNo;

	public TextileShop() {
		System.out.println("Default Const..");
	}

	public TextileShop(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("Const with String..");
	}

	public TextileShop(String ownerName, String ownerWifeName) {
		this(ownerName);
		this.ownerWifeName = ownerWifeName;
		System.out.println("Const with String & String..");
	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName) {
		this(ownerName, ownerWifeName);
		this.ownerDaughterName = ownerDaughterName;
		System.out.println("Const with String, String & String..");
	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, long ownerDaughterNumber) {
		this(ownerName, ownerWifeName, ownerDaughterName);
		this.ownerDaughterNumber = ownerDaughterNumber;
		System.out.println("Const with String, String, String & long..");
	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, int ownerNoOfWifes) {
		this(ownerName, ownerWifeName, ownerDaughterName);
		this.ownerNoOfWifes = ownerNoOfWifes;
		System.out.println("Const with String, String, String & int..");
	}

	public TextileShop(String ownerName, String ownerWifeName, String ownerDaughterName, String shopNo) {
		this(ownerName, ownerWifeName, ownerDaughterName);
		this.shopNo = shopNo;
		System.out.println("Const with String, String, String & String..");
	}

	public TextileShop(String ownerName, String ownerWifeName, long contactNo) {
		this(ownerName, ownerWifeName);
		this.contactNo = contactNo;
		System.out.println("Const with String, String & long..");
	}

}
