package com.chances.chapter.twelve;

class Scientist extends Person implements Cloneable {

	public Object clone() {
		try {
			return super.clone();
		} catch(CloneNotSupportedException e) {
			throw new InternalError();
		}
	}
}
