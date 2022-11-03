package com.rapido.rider.things.speaker;

public class SpeakerModifier {

	public Speaker speaker;

	public void useSpeaker(Speaker speaker) {
		speaker.setBrand("Amazon");
		speaker.setType("Smart speaker");
		speaker.setIntelligentAssistant("Alexa");
		speaker.setWeight(800);
		speaker.setSize(3.9);
		speaker.setManufacturedBy("Amazon india pvt ltd");
		speaker.setManufacturedOn("June-2022");
		speaker.setMarketedBy("Amazon");
		speaker.setHeadQuaters("LA");
		speaker.setWarrantyInYears(2);
		speaker.setPowerSource("AC power Adapdor");
	}
}
