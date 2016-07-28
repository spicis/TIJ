package com.chances.chapter.eight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSort {

	public static void main(String[] args) {
		final int SZ = 20;
		List a = new ArrayList();
		for(int i = 0; i < SZ; i++) {
			a.add(new CompClass((int)(Math.random()*100)));
		}
		Collection1.print(a);
		Collections.sort(a);
		Collection1.print(a);
		Object find = a.get(SZ/2);
		int loc = Collections.binarySearch(a, find);
		System.out.println("Location of " + find + 
				" = " + loc);
		List b = new ArrayList();
		for(int i = 0; i < SZ; i++) {
			b.add(Array1.randString(4));
		}
		Collection1.print(b);
		AlphaComp ac = new AlphaComp();
		Collections.sort(b, ac);
		Collection1.print(b);
		find = b.get(SZ/2);
		loc = Collections.binarySearch(b, find, ac);
		System.out.println("Location of " + find + 
				" = " + loc);
	}
}
