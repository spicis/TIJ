package com.chances.chapter.eight;

import java.util.Vector;

public class HamsterMaze {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0; i < 3; i++) {
			v.addElement(new Hamster(i));
		}
		Printer.printAll(v.elements());
	}
}
