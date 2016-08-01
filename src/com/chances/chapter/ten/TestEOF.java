package com.chances.chapter.ten;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TestEOF {

	public static void main(String[] args) {
		try {
			DataInputStream in = 
				new DataInputStream(
					new BufferedInputStream(
						new FileInputStream("TestEof.java")));
			while(in.available() != 0) {
				System.out.println((char)in.readByte());
			}
		} catch(IOException e) {
			System.out.println("IOException");
		}
	}
}
