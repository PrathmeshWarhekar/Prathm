package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.BikeKey;

public class Key extends Thread {
	BikeKey bikeKey;
	public Key (BikeKey bikeKey) {
		super();
		this.bikeKey=bikeKey;
	}
	@Override
	public void run() {
		synchronized(bikeKey.Key){
			System.out.println(this.getName()+" have "+bikeKey.Key);
			synchronized(bikeKey.Bike){
				System.out.println(this.getName()+" have "+bikeKey.Bike);
			}
			System.out.println(this.getName()+" given "+bikeKey.Bike);
		}
		System.out.println(this.getName()+ " given " +bikeKey.Key);
	}
}
