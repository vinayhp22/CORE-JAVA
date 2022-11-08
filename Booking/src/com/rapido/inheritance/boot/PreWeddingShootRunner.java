package com.rapido.inheritance.boot;

import com.rapido.inheritance.child.preWeddingShoot.Camera;
import com.rapido.inheritance.custom.PreWeddingShoot;

public class PreWeddingShootRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PreWeddingShoot shoot = new Camera(500000, "Goa", 5);
		if (shoot instanceof Camera) {
			Camera camera = (Camera) shoot;
			System.out.println(camera.budget);
			System.out.println(camera.location);
			System.out.println(camera.days);
			System.out.println(camera.cameraName);
		}else {
			System.out.println("-----ClassCastException-----");
		}
	}

}
