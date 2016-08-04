package com.chances.chapter.twelve;

class BackOn extends NoMore {

	private BackOn duplicate(BackOn b) {
		return new BackOn();
	}
	
	public Object clone() {
		return duplicate(this);
	}
}
