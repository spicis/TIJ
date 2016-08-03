package com.chances.chapter.ten;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class IOBug {

	public static void main(String[] args) throws Exception {
		DataOutputStream out = 
			new DataOutputStream(
				new BufferedOutputStream(
					new FileOutputStream("Data.txt")));
		out.writeDouble(3.14159);
		out.writeBytes("That was the value of pi\n");
		out.writeBytes("This is pi/2:\n");
		out.writeDouble(3.14159/2);
		out.close();
		DataInputStream in = 
			new DataInputStream(
				new BufferedInputStream(
					new FileInputStream("Data.txt")));
		BufferedReader inbr = 
			new BufferedReader(
				new InputStreamReader(in));
		System.out.println(in.readDouble());
		System.out.println(inbr.readLine());
		System.out.println(inbr.readLine());
		System.out.println(in.readDouble());
	}
}
