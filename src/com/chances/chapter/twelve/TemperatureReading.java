package com.chances.chapter.twelve;

public class TemperatureReading implements Cloneable {

	private long time;
	private double temperature;
	public TemperatureReading(double temperature) {
		time = System.currentTimeMillis();
		this.temperature = temperature;
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
