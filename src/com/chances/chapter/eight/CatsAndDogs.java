package com.chances.chapter.eight;

import java.util.Vector;

public class CatsAndDogs {

	public static void main(String[] args) {
		Vector cats = new Vector();
		for(int i = 0; i < 7; i++) {
			cats.addElement(new Cat(i));;
		}
		cats.addElement(new Dog(7));;
		for(int i = 0; i < cats.size(); i++) {
			((Cat)cats.elementAt(i)).print();
		}
	}
}
