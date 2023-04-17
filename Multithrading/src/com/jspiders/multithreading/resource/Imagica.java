package com.jspiders.multithreading.resource;

public class Imagica {
	int availableTickets;
	public Imagica(int availableTickets) {
		this.availableTickets=availableTickets;
	}
	public synchronized void buyTickets(int noOfTickets) {
		System.out.println("Trying to buy "+ noOfTickets +" tickets");
		if(noOfTickets>availableTickets) {
			System.out.println(noOfTickets +" Tickets not available");
			System.out.println("Please wait...!");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		availableTickets-=noOfTickets;
		System.out.println(noOfTickets +" Tickets bought");
		System.out.println("Now available tickets:"+ availableTickets);
	}
	public synchronized void createTickets(int noOfTickets) {
		System.out.println("Creating "+ noOfTickets +" tickets");
		availableTickets+=noOfTickets;
		System.out.println("Now available Tickets:"+ availableTickets);
		this.notify();
	}
}
