package com.chances.chapter.five;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class InFile extends DataInputStream {

	public InFile(String filename) throws FileNotFoundException{
		super(
			new BufferedInputStream(
				new FileInputStream(filename)));
	}
	public InFile(File file) throws FileNotFoundException {
		this(file.getPath());
	}
}
