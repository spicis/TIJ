package com.chances.chapter.twelve;

class WrongClone extends Ordinary {

	public Object Clone() 
		throws CloneNotSupportedException {
		return super.clone();
	}
}
