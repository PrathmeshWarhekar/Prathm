package com.jspiders.multithreading.main;

import com.jspiders.multithreading.threads.MyThrad1;
import com.jspiders.multithreading.threads.MyThrad2;

public class ThraadMain {
	public static void main(String[] args) {
		MyThrad1 myThrad1=new MyThrad1();
		MyThrad2 myThrad2=new MyThrad2();
		Thread thread=new Thread(myThrad2);
		
		myThrad1.start();
		thread.start();
	}
}
