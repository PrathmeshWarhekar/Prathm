package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.BikeKey;

public class Bike extends Thread {
	BikeKey bikeKey;
	public Bike (BikeKey bikeKey) {
		super();
		this.bikeKey=bikeKey;
	}
	@Override
	public void run() {
		synchronized(bikeKey.Bike){
			System.out.println(this.getName()+" have "+bikeKey.Bike);
			synchronized(bikeKey.Key){
				System.out.println(this.getName()+" have "+bikeKey.Key);
			}
			System.out.println(this.getName()+" given "+bikeKey.Key);
		}
		System.out.println(this.getName()+ " given " +bikeKey.Bike);
	}
}
