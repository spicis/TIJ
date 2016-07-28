package com.chances.chapter.eight;

import java.util.Enumeration;
import java.util.Vector;

public class Gerbil {

	private int gerbilNumber;
	
	Gerbil(int i) {
		this.gerbilNumber = i;
	}
	
	public void hop() {
		System.out.println(gerbilNumber);
	}
	
	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0; i < 10; i++) {
			v.add(new Gerbil(i));
		}
//		for(int i = 0; i < v.size(); i++) {
//			((Gerbil)(v.elementAt(i))).hop();
//		}
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			((Gerbil)(e.nextElement())).hop();
		}
	}
}
