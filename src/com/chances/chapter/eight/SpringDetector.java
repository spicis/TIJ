package com.chances.chapter.eight;

import java.util.Hashtable;

public class SpringDetector {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		for(int i = 0; i < 10; i++) {
			ht.put(new Groundhog(i), new Prediction());
		}
		System.out.println("ht = " + ht + "\n");
		System.out.println(
				"Looling up prediction or groundhog #3:");
		Groundhog gh = new Groundhog(3);
		if(ht.containsKey(gh)){
			System.out.println((Prediction)ht.get(gh));
		}
	}
}
