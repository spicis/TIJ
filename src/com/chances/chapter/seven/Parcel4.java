package com.chances.chapter.seven;

public class Parcel4 {

	public Destination dest(String s){
		class PDestination implements Destination{
			private String label;
			private PDestination(String whereTo){
				
			}
			public String readLabel(){
				return label;
			}
		}
		return new PDestination(s);
	}
}
