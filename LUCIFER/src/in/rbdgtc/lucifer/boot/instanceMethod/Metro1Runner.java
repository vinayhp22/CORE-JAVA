package in.rbdgtc.lucifer.boot.instanceMethod;

import in.rbdgtc.lucifer.programs.instanceMethod.Metro1;

public class Metro1Runner {

	public static void main(String[] args) {

		String[] routes = { "Purple line", "Green line" };
		String[] metroStationNames = { "Nagasandra", "Jalahalli Cross", "Peenya", "GoraguntePalya" };
		String[] stationMangerName = { "Mr.Bommai", "Mr.Siddaramanna", "Mr. Kuamaranna", "Ms.Anitha Kumaranna" };
		long[] stationManagerNumber = { 7859996956l, 9658545632l, 9875963852l, 8412652563l };
		String[] finalStops = { "Nagasandra", "Baiyapanahalli", "Silk Factory", "Kengeri" };
		String[] metroTimings = { "5am - 11pm", "7am - 11pm" };

		Metro1 metro1 = new Metro1(null, null, null, null, 0, routes, metroStationNames, stationMangerName,
				stationManagerNumber, finalStops, metroTimings);
		metro1.name = "Namma Metro";
		metro1.city = "Bengaluru";
		metro1.state = "Karnataka";
		metro1.country = "INDIA";
		metro1.countryCode = 91;

		metro1.display();

	}

}
