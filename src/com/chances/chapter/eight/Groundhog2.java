package com.chances.chapter.eight;

class Groundhog2 {

	int ghNumber;
	Groundhog2(int n) {
		ghNumber = n;
	}
	@Override
	public int hashCode() {
		return ghNumber;
	}
	@Override
	public boolean equals(Object obj) {
		return (obj instanceof Groundhog2)
				&& (ghNumber == ((Groundhog2)obj).ghNumber);
	}
	
}
