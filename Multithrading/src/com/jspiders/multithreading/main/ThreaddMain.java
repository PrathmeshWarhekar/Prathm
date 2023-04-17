package com.jspiders.multithreading.main;
import com.jspiders.multithreading.threads.MyThreadd1;

public class ThreaddMain {
	public static void main(String[] args) {
		MyThreadd1 myThread1=new MyThreadd1();
		Thread thread=new Thread(myThread1);
		thread.setName("Thread2");
		thread.setPriority(5);
		thread.start();
	}
}
