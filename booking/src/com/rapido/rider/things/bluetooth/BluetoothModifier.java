package com.rapido.rider.things.bluetooth;

public class BluetoothModifier {

	public Bluetooth bluetooth;
	
	public void useBluetooth(Bluetooth bluetooth) {
		bluetooth.setBrand("Boat");
		bluetooth.setType("earphone");
		bluetooth.setBatteryBackUpHours(12);
		bluetooth.setEmail("custumercare@boat.com");
		bluetooth.setWeight(120.5);
		bluetooth.setManufacturedAt("CHINA");
		bluetooth.setManufacturedBy("Boat company");
		bluetooth.setManufacturedOn("Jan 2022");
		bluetooth.setMarketedBy("Boat India Private ltd");
		bluetooth.setHeadQuaters("CHINA");
		bluetooth.setWarrantyInYears(1);
	}
}
