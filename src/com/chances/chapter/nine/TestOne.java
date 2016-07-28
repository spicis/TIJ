package com.chances.chapter.nine;

public class TestOne {

	public static void main(String[] args) {
		try {
			throw new NullPointerException("my exception");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("i'm here");
		}
	}
}
