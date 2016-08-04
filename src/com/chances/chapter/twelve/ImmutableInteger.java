package com.chances.chapter.twelve;

import java.util.Vector;

public class ImmutableInteger {

	public static void main(String[] args) {
		Vector v = new Vector();
		for(int i = 0; i < 10; i++) {
			v.addElement(new Integer(i));
		}
	}
}
