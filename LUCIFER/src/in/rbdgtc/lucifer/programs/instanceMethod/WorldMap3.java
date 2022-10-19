package in.rbdgtc.lucifer.programs.instanceMethod;

public class WorldMap3 {

	public String myCountry;
	public String myContinent;
	public int myCountryCode;
	public String oceanSurroundedByMyCountry;
	public String myStandardTime;

	public String[] asia;
	public String[] africa;
	public String[] southAmerica;
	public String[] northAmerica;
	public String[] europe;
	public String[] countriesSurroundedByMyCountry;

	public WorldMap3(String myCountry, String myContinent, int myCountryCode, String oceanSurroundedByMyCountry,
			String myStandardTime, String[] asia, String[] africa, String[] southAmerica, String[] northAmerica,
			String[] europe, String[] countriesSurroundedByMyCountry) {

		this.myCountry = myCountry;
		this.myContinent = myContinent;
		this.myCountryCode = myCountryCode;
		this.oceanSurroundedByMyCountry = oceanSurroundedByMyCountry;
		this.myStandardTime = myStandardTime;

		this.asia = asia;
		this.africa = africa;
		this.southAmerica = southAmerica;
		this.northAmerica = northAmerica;
		this.europe = europe;
		this.countriesSurroundedByMyCountry = countriesSurroundedByMyCountry;

	}

	public void display() {
		System.out.println("Country : " + myCountry);
		System.out.println("Continent : " + myContinent);
		System.out.println("Country Code : " + myCountryCode);
		System.out.println("Oceans Surrounded : " + oceanSurroundedByMyCountry);
		System.out.println("Standard Time : " + myStandardTime);

		System.out.println(System.lineSeparator() + "=======Countries Surrounded =========");
		for (int i = 0; i < countriesSurroundedByMyCountry.length; i++) {
			String string = countriesSurroundedByMyCountry[i];
			System.out.println(string);
		}

		System.out.println(System.lineSeparator() + "=======ASIA=========");
		for (int i = 0; i < asia.length; i++) {
			String string = asia[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "=======AFRICA=========");
		for (int i = 0; i < africa.length; i++) {
			String string = africa[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "=======South America=========");
		for (int i = 0; i < southAmerica.length; i++) {
			String string = southAmerica[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "=======Nouth America=========");
		for (int i = 0; i < northAmerica.length; i++) {
			String string = northAmerica[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator() + "=======Europe=========");
		for (int i = 0; i < europe.length; i++) {
			String string = europe[i];
			System.out.println(string);
		}

	}

}
