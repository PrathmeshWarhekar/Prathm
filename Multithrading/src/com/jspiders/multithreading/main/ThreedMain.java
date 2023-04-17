package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.MyThread;

public class ThreedMain {
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.setName("Thread1");
		myThread.setPriority(8);
		myThread.start();
	}
}
