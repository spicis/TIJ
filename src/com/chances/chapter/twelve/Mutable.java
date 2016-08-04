package com.chances.chapter.twelve;

class Mutable {

	private int data;
	public Mutable(int initVal) {
		data = initVal;
	}
	public Mutable add(int x) {
		data += x;
		return this;
	}
	public Mutable multiply(int x) {
		data *= x;
		return this;
	}
	public Immutable2 makeImmutable2() {
		return new Immutable2(data);
	}
}
