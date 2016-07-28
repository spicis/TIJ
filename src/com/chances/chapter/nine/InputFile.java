package com.chances.chapter.nine;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class InputFile {

	private BufferedReader in;
	
	InputFile(String fname) throws Exception {
		try {
			in = new BufferedReader(new FileReader(fname));
		} catch(FileNotFoundException e) {
			System.out.println("Could not open " + fname);
			throw e;
		} catch(Exception e) {
			try {
				in.close();
			} catch(IOException e2) {
				System.out.println("in.close() unsuccessful");
				throw e;
			} finally {
				
			}
		}
	}
	
	String getLine() {
		String s;
		try {
			s = in.readLine();
		} catch(IOException e) {
			System.out.println("readLine( unseccessful");
			s = "field";
		}
		return s;
	}
	
	void cleanup() {
		try {
			in.close();
		} catch(IOException e2) {
			System.out.println("in.close() unsuccessful");
		}
	}
}
