package com.chances.chapter.eight;

import java.util.Hashtable;

public class SpringDetector2 {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();
		for(int i = 0; i < 10; i++){
			ht.put(new Groundhog2(i), new Prediction());
		}
		System.out.println("ht = " + ht + "\n");
		System.out.println("Looking up prediction for groundhog #3");
		Groundhog2 gh = new Groundhog2(3);
		if(ht.containsKey(gh)){
			System.out.println((Prediction)ht.get(gh));
		}
	}
}
