package com.jspiders.multithreading.threads;

public class MyThreadd1 implements Runnable {
	@Override
	public void run() {
		System.out.println("The name of Thread is "+ Thread.currentThread().getName());
		System.out.println("The pririty of thread is "+ Thread.currentThread().getPriority());
	}
}
