package com.rapido.rider.boot;

import com.rapido.rider.things.speaker.Speaker;
import com.rapido.rider.things.speaker.SpeakerModifier;

public class SpeakerRunner {

	public static void main(String[] args) {
		Speaker speaker = new Speaker();
		SpeakerModifier modifier = new SpeakerModifier();
		modifier.useSpeaker(speaker);
		System.out.println("Brand : " + speaker.getBrand());
		System.out.println("Type : " + speaker.getType());
		System.out.println("IntelligentAssistant : " + speaker.getIntelligentAssistant());
		System.out.println("Weight : " + speaker.getWeight());
		System.out.println("Size : " + speaker.getSize());
		System.out.println("ManufacturedBy : " + speaker.getManufacturedBy());
		System.out.println("ManufacturedOn : " + speaker.getManufacturedOn());
		System.out.println("MarketedBy : " + speaker.getMarketedBy());
		System.out.println("HeadQuaters : " + speaker.getHeadQuaters());
		System.out.println("warrantyInYears : " + speaker.getWarrantyInYears());
		System.out.println("PowerSource : " + speaker.getPowerSource());

	}

}
