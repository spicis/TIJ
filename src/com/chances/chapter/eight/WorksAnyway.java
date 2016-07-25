package com.chances.chapter.eight;

import java.util.Vector;

public class WorksAnyway {

	public static void main(String[] args) {
		Vector mice = new Vector();
		for(int i = 0; i < 3; i++) {
			mice.addElement(new Mouse(i));
		}
		for(int i = 1; i < mice.size(); i++) {
			System.out.println(
					"Free mouse: " + mice.elementAt(i));
			MouseTrap.caughtYa(mice.elementAt(i));
		}
	}
}
