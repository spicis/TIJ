package com.chances.chapter.nine;

public class LostMessage {

	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	
	public static void main(String[] args) throws Exception {
		LostMessage lm = new LostMessage();
		try {
			lm.f();
		} finally {
			lm.dispose();
		}
	}
}
