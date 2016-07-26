package com.chances.chapter.eight;

import java.util.Hashtable;
import java.util.Vector;

class Enumerators2 {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0; i < 5; i++) {
			v.addElement(new Mouse(i));
		}
		Hashtable h = new Hashtable();
		for(int i = 0; i < 5; i++) {
			h.put(new Integer(i), new Hamster(i));
		}
		
		System.out.println("Vector");
		PrintData.print(v.elements());
		System.out.print("Hashtable");
		PrintData.print(h.elements());
	}
}
