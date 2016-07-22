package com.chances.chapter.seven;

public class Parcel8 {

	public Destination dest(final String dest){
		return new Destination(){
			private String label = dest;
			public String readLabel(){
				return label;
			}
		};
	}
}
