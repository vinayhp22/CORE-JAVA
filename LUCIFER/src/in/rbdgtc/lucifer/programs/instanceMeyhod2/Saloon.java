package in.rbdgtc.lucifer.programs.instanceMeyhod2;

public class Saloon {

	public static String shopName;
	public String shopOwnerName = "Mallesh";
	public String shopLocation;
	public int areaPinCode;
	public long shopContactNumber;

	public Saloon(String shopLocation) {
		this.shopLocation = shopLocation;
	}

	public void setAreaPinCode(int areaPinCode) {
		this.areaPinCode = areaPinCode;
	}

	public void display() {
		System.out.println("shopName : " + Saloon.shopName);
		System.out.println("shopOwnerName : " + this.shopOwnerName);
		System.out.println("shopLocation : " + this.shopLocation);
		System.out.println("areaPinCode : " + this.areaPinCode);
		System.out.println("shopContactNumber : " + this.shopContactNumber);

	}

	static {
		shopName = "Mens Saloon Shop";
	}

}
