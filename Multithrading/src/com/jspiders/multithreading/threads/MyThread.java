package com.jspiders.multithreading.threads;

public class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("The name of thread is "+ this.getName());
		System.out.println("The priority of the thread is "+ this.getPriority());
	}
}
