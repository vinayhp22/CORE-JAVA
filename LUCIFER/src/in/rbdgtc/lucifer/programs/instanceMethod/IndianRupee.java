package in.rbdgtc.lucifer.programs.instanceMethod;

public class IndianRupee {

	public int rupay;
	public boolean isNote;
	public String symbol = "₹";
	public String code = "INR";
	public String issuedBy;
	public String unit = "Rupee";

	public int[] bankNotes; // 1, 2, 5, 10, 20, 50, 100, 200, 500 , 2000
	public int[] coins; // 1, 2, 5, 10
	public String[] officialUsers; // "India","Bhutan", "Nepal"
	public String[] otherCurrencies; // "US Dollar", "Pound sterling", "Euro","Japanese yen","Renminbi"
	public String[] top5Currencies;// "US Dollar","Euro","Sterling","Japanese Yen","Swiss Franc"
	public int[] withdrawalInATM;

	public IndianRupee(int rupay, boolean isNote, String symbol, String code, String issuedBy, String unit,
			int[] bankNotes, int[] coins, String[] officialUsers, String[] otherCurrencies, String[] top5Currencies,
			int[] withdrawalInATM) {

		this.rupay = rupay;
		this.isNote = isNote;
		this.symbol = symbol;
		this.code = code;
		this.issuedBy = issuedBy;
		this.unit = unit;

		this.bankNotes = bankNotes;
		this.coins = coins;
		this.officialUsers = officialUsers;
		this.otherCurrencies = otherCurrencies;
		this.top5Currencies = top5Currencies;
		this.withdrawalInATM = withdrawalInATM;

	}

	public void display() {

		System.out.println("Rupay : " + this.rupay);
		System.out.println("Is it Note : " + this.isNote);
		System.out.println("Symbol : " + this.symbol);
		System.out.println("Code : " + this.code);
		System.out.println("Issued By :" + this.issuedBy);
		System.out.println("Unit :" + this.unit);

		System.out.println(System.lineSeparator() + "====Bank Notes====");
		for (int i = 0; i < bankNotes.length; i++) {
			int j = bankNotes[i];
			System.out.println(j);
		}
		System.out.println(System.lineSeparator() + "====Coins====");
		for (int i = 0; i < coins.length; i++) {
			int j = coins[i];
			System.out.println(j);
		}
		System.out.println(System.lineSeparator() + "====Official Users====");
		for (int i = 0; i < officialUsers.length; i++) {
			String string = officialUsers[i];
			System.out.println(string);
		}

		System.out.println(System.lineSeparator() + "====Other Currencies====");
		for (int i = 0; i < otherCurrencies.length; i++) {
			String string = otherCurrencies[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Top 5 Currencies====");
		for (int i = 0; i < top5Currencies.length; i++) {
			String string = top5Currencies[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "====Withdrawal In ATM====");
		for (int i = 0; i < withdrawalInATM.length; i++) {
			int j = withdrawalInATM[i];
			System.out.println(j);
		}
	}
}
