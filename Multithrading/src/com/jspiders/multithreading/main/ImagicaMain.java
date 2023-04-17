package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.Imagica;
import com.jspiders.multithreading.threads.Visitor;
import com.jspiders.multithreading.threads.Date;

public class ImagicaMain {
	public static void main (String[]args) {
		Imagica imagica=new Imagica(50);
		Visitor visitor=new Visitor(imagica);
		Date date=new Date(imagica);
		visitor.start();
		date.start();
	}
}
