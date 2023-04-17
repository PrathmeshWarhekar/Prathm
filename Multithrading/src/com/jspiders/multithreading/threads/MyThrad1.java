package com.jspiders.multithreading.threads;

public class MyThrad1 extends Thread {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("my thrad1 is now running");
		}
	}
}
