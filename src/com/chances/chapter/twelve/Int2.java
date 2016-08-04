package com.chances.chapter.twelve;

class Int2 implements Cloneable {

	private int i;
	public Int2(int ii) {
		i = ii;
	}
	public void increment() {
		i++;
	}
	public String toString() {
		return Integer.toString(i);
	}
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("Int2 can't clone");
		}
		return o;
	}
}
