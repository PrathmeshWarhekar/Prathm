package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Imagica;

public class Date extends Thread {
	Imagica imagica;
	public Date(Imagica imagica) {
	this.imagica=imagica;
	}
	@Override
	public void run() {
		imagica.createTickets(200);
	}
}
