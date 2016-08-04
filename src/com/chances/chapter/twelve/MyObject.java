package com.chances.chapter.twelve;

class MyObject implements Cloneable {

	int i;
	MyObject(int ii) {
		i = ii;
	}
	
	public Object Clone() {
		Object o =null;
		try {
			o = super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("MyObject can't clone");
		}
		return o;
	}
	
	public String toString() {
		return Integer.toString(i);
	}
}
