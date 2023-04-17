package com.jspiders.multithreading.threads;

import com.jspiders.multithreading.resource.Imagica;

public class Visitor extends Thread {
	Imagica imagica;
	public Visitor(Imagica imagica) {
		this.imagica=imagica;
	}
	@Override
	public void run() {
		imagica.buyTickets(100);
	}
}
