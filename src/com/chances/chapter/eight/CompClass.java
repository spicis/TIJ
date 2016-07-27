package com.chances.chapter.eight;

import java.util.Arrays;

public class CompClass implements Comparable {

	private int i;
	public CompClass(int ii) {
		i = ii;
	}
	public int compareTo(Object o) {
		int argi = ((CompClass)o).i;
		if(i ==argi) {
			return 0;
		}
		if(i < argi) {
			return -1;
		}
		return 1;
	}
	
	public static void print(Object[] a) {
		for(int i = 0; i < a.length; i ++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public String toString() {
		return i + "";
	}
	
	public static void main(String[] args) {
		CompClass[] a = new CompClass[20];
		for(int i = 0; i < a.length; i++) {
			a[i] = new CompClass(
					(int)(Math.random()*100));
		}
		print(a);
		Arrays.sort(a);
		print(a);
		int loc = Arrays.binarySearch(a, a[3]);
		System.out.println("Location of " + a[3] + 
				" = " + loc);
	}
}
