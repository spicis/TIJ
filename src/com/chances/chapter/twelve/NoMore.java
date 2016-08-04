package com.chances.chapter.twelve;

class NoMore extends IsCloneable {

	public Object clone() 
		throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
