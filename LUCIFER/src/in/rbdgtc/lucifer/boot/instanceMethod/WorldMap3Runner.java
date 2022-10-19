package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.WorldMap3;

public class WorldMap3Runner {

	public static void main(String[] args) {

		String[] asia = { "India", "Russia", "Sri Lanka", "Iran", "Afghanistan", "Bangladesh", "Nepal", "Bhuthan" };
		String[] africa = { "South Africa", "Sudan", "Niger", "Nigeria", "Mali", "Egypt", "Libya" };
		String[] southAmerica = { "Brazil", "Argentina", "Peru", "Chile", "Colombia", "Equador", "Venezuela" };
		String[] northAmerica = { "USA", "Canada", "Mexico" };
		String[] europe = { "Ukraine", "UK", "Germany", "France" };
		String[] countriesSurroundedByMyCountry = { "PAPI Pakistan", "CHINA", "Bangladesh", "Nepal", "Bhutan",
				"Afghanistan", "Srilanka" };

		WorldMap3 worldMap = new WorldMap3("INDIA", "Asia", 91, "Indian Ocean", "Indian Standard Time (IST)", asia,
				africa, southAmerica, northAmerica, europe, countriesSurroundedByMyCountry);

		worldMap.display();

	}

}
