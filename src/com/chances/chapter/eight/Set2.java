package com.chances.chapter.eight;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Set2 {

	public static Set fill(Set a, int size) {
		for(int i = 0; i < size; i++){
			a.add(new MyType(i));
		}
		return a;
	}
		
	public static Set fill(Set a) {
		return fill(a, 10);
	}
	
	public static void test(Set a) {
		fill(a);
		fill(a);
		fill(a);
		a.addAll(fill(new TreeSet()));
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		test(new HashSet());
		test(new TreeSet());
	}
}
