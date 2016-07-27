package com.chances.chapter.eight;

import java.util.Arrays;
import java.util.Comparator;

public class AlphaComp implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = ((String)o1).toLowerCase();
		String s2 = ((String)o2).toLowerCase();
		return s1.compareTo(s2);
	}
	
	public static void main(String[] args) {
		String[] s = Array1.randStrings(4,  10);
		Array1.print(s);
		AlphaComp ac = new AlphaComp();
		Arrays.sort(s, ac);
		Array1.print(s);
		int loc = Arrays.binarySearch(s,  s[3], ac);
		System.out.println("Locatin of " + s[3] + 
				" = " + loc);
	}
}
