package com.jspiders.multithreading.threads;

public class MyThrad2 implements Runnable {
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("My thrad2 is running");
		}
	}
}
