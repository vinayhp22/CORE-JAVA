package com.rapido.rider.boot;

import com.rapido.rider.things.bluetooth.Bluetooth;
import com.rapido.rider.things.bluetooth.BluetoothModifier;

public class BluetoothRunner {

	public static void main(String[] args) {

		Bluetooth bluetooth = new Bluetooth();
		BluetoothModifier modifier = new BluetoothModifier();
		modifier.useBluetooth(bluetooth);
		System.out.println("Brand : " + bluetooth.getBrand());
		System.out.println("Type : " + bluetooth.getType());
		System.out.println("batteryBackUpHours : " + bluetooth.getBatteryBackUpHours());
		System.out.println("Email : " + bluetooth.getEmail());
		System.out.println("Weight : " + bluetooth.getWeight());
		System.out.println("ManufacturedAt : " + bluetooth.getManufacturedAt());
		System.out.println("ManufacturedBy : " + bluetooth.getManufacturedBy());
		System.out.println("ManufacturedOn : " + bluetooth.getManufacturedOn());
		System.out.println("MarketedBy : " + bluetooth.getMarketedBy());
		System.out.println("HeadQuaters : " + bluetooth.getHeadQuaters());
		System.out.println("warrantyInYears : " + bluetooth.getWarrantyInYears());
	}

}
