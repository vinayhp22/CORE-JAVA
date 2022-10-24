package in.rbdgtc.lucifer.programs.instanceMeyhod2;

public class ShirtBrand {

	public static String brand;
	public String country = "USA";
	public String chiefExecutiveOfficer_CEO;
	public long customerCareNumber;
	public String headQuarters;

	public ShirtBrand(String chiefExecutiveOfficer_CEO) {
		this.chiefExecutiveOfficer_CEO = chiefExecutiveOfficer_CEO;
	}

	public void setCustomerCareNumber(long customerCareNumber) {
		this.customerCareNumber = customerCareNumber;
	}

	public void display() {
		System.out.println("brand : " + ShirtBrand.brand);
		System.out.println("country : " + this.country);
		System.out.println("CEO : " + this.chiefExecutiveOfficer_CEO);
		System.out.println("customerCareNumber : " + this.customerCareNumber);
		System.out.println("headQuarters : " + this.headQuarters);
	}

	static {
		brand = "Levis";
	}
}
