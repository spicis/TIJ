package com.chances.chapter.eleven;

import java.util.Enumeration;
import java.util.Vector;

public class Shapes {

	public static void main(String[] args) {
		Vector s = new Vector();
		s.addElement(new Circle());
		s.addElement(new Square());
		s.addElement(new Triangle());
		Enumeration e = s.elements();
		while(e.hasMoreElements()) {
			((Shape)e.nextElement()).draw();
		}
	}
}
