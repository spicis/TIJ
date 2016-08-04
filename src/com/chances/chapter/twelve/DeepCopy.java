package com.chances.chapter.twelve;

public class DeepCopy {

	public static void main(String[] args) {
		OceanReading reading = 
			new OceanReading(33.9, 100.5);
		OceanReading r = 
			(OceanReading)reading.clone();
	}
}
