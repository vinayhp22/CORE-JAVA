package in.rbdgtc.lucifer.programs.instanceMethod;

public class Hotel12 {

	public String hotelName;
	public String hygineic;
	public int noOfTables;
	public int noOfEmployees;
	public String establishedYear;

	public String[] type;
	public String[] menu;
	public int[] biriyaniPrices;
	public String[] branches;
	public String[] employeeNames;
	public String[] mainIngredients;

	public Hotel12(String hotelName, String hygenic, int noOfTable, int noOfEmployees, String establishedYear,
			String[] type, String[] menu, int[] biriyaniPrices, String[] branches, String[] employeeNames,
			String[] mainIngredients) {
		
		this.type=type;
		this.biriyaniPrices=biriyaniPrices;
		this.branches = branches;
		this.hotelName = hotelName;
		this.employeeNames = employeeNames;
		this.hygineic = hygenic;
		this.noOfTables = noOfTable;
		this.noOfEmployees = noOfEmployees;
		this.establishedYear = establishedYear;
		this.menu = menu;
		this.mainIngredients = mainIngredients;

	}

	public void display() {

		System.out.println(this.hotelName);
		System.out.println(this.hygineic);
		System.out.println(this.noOfTables);
		System.out.println(this.noOfEmployees);
		System.out.println(this.establishedYear);

		for (int i = 0; i < menu.length; i++) {
			String ref1 = menu[i];
			System.out.println(ref1);
		}
		for (int i = 0; i < branches.length; i++) {
			String ref2 = branches[i];
			System.out.println(ref2);
		}
		for (int i = 0; i < employeeNames.length; i++) {
			String ref3 = employeeNames[i];
			System.out.println(ref3);
		}
		for (int i = 0; i < mainIngredients.length; i++) {
			String ref4 = mainIngredients[i];
			System.out.println(ref4);
			
		}
	}

}
