package in.rbdgtc.lucifer.programs.instanceMethod;

public class Movies9 {

	public String name;
	public String heroName;
	public String heroineName;
	public int releasedDate;
	public int collection;
	public int rating;
	public String[] movieSongs;
	public int[] ticketPrice;
	public String[] characters;
	public String[] language;
	public String[] castName;
	public String[] theatreName;

	public Movies9() {
		System.out.println("   ");
	}

	public Movies9(String name, String heroName, String heroineName, int releasedDate, int collection, int rating,
			String[] movieSongs, int[] ticketPrice, String[] characters, String[] language, String[] castName,
			String[] theatreName) {

		this.name = name;
		this.heroName = heroName;
		this.heroineName = heroineName;
		this.releasedDate = releasedDate;
		this.collection = collection;
		this.rating = rating;
		this.movieSongs = movieSongs;
		System.out.println("movieSongs:");
		for (int i = 0; i < movieSongs.length; i++) {
			String string = movieSongs[i];
			System.out.println(string);
		}
		this.ticketPrice = ticketPrice;
		System.out.println("ticketPrice:");
		for (int i = 0; i < ticketPrice.length; i++) {
			int string = ticketPrice[i];
			System.out.println(string);
		}
		System.out.println(System.lineSeparator());
		this.characters = characters;
		System.out.println("characters:");
		for (int i = 0; i < characters.length; i++) {
			String string = characters[i];
			System.out.println(string);
		}

		System.out.println(System.lineSeparator());
		this.language = language;
		System.out.println("language:");
		for (int i = 0; i < language.length; i++) {
			String string = language[i];
			System.out.println(string);

		}
		System.out.println(System.lineSeparator());
		this.castName = castName;
		System.out.println("castName:");
		for (int i = 0; i < castName.length; i++) {
			String string = castName[i];
			System.out.println(string);

		}
		System.out.println(System.lineSeparator());
		this.theatreName = theatreName;
		System.out.println("theatreName:");
		for (int i = 0; i < theatreName.length; i++) {
			String string = theatreName[i];

			System.out.println(string);

		}
	}

	public void display() {

		System.out.println(name);
		System.out.println(heroName);
		System.out.println(heroineName);
		System.out.println(releasedDate);
		System.out.println(collection);
		System.out.println(rating);

	}

}
