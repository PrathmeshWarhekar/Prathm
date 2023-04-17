package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.BikeKey;
import com.jspiders.multithreading.threads.Bike;
import com.jspiders.multithreading.threads.Key;

public class BikeKeyMain {
	public static void main(String[] args) {
		BikeKey bikeKey=new BikeKey();
		Bike bike=new Bike(bikeKey);
		bike.setName("Raam");
		
		Key key=new Key(bikeKey);
		key.setName("Shyam");
		
		bike.start();
		key.start();
	}
}
