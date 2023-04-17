
package com.jspiders.multithreading.main;

public class Sleep {
	public static void main(String[] args) {
		String msg="This is the execution of sleep()";
		for(int i=0;i<msg.length();i++) {
			System.out.print(msg.charAt(i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
