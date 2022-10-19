package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.IndianRupee;

public class IndianRupeeRunner {

	public static void main(String[] args) {

		int[] bankNotes = { 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000 };
		int[] coins = { 1, 2, 5, 10 };
		String[] officialUsers = { "India", "Bhutan", "Nepal" };
		String[] otherCurrencies = { "US Dollar", "Pound sterling", "Euro", "Japanese yen", "Renminbi" };
		String[] top5Currencies = { "US Dollar", "Euro", "Sterling", "Japanese Yen", "Swiss Franc" };
		int[] withdrawalInATM = { 100, 200, 500, 2000 };

		IndianRupee indianRupee = new IndianRupee(5, true, "₹", "INR", "RBI", "Rupee", bankNotes, coins, officialUsers,
				otherCurrencies, top5Currencies, withdrawalInATM);

		indianRupee.display();

	}

}
