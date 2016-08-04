package com.chances.chapter.twelve;

class DepthReading implements Cloneable {

	private double depth;
	public DepthReading(double depth) {
		this.depth = depth;
	}
	public Object clone() {
		Object o = null;
		try {
			o = super.clone();
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return o;
	}
}
