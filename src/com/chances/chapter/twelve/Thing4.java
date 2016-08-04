package com.chances.chapter.twelve;

public class Thing4 implements Cloneable {

	Thing3 o3 = new Thing3();
	public Object clone() {
		Thing4 o = null;
		try {
			o = (Thing4)super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("Thing4 can't clone");
		}
		o.o3 = (Thing3)o3.clone();
		return o;
	}
}
