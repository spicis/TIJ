package com.chances.chapter.ten;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.LineNumberInputStream;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.io.StringBufferInputStream;

import com.chances.chapter.five.InFile;
import com.chances.chapter.five.OutFile;
import com.chances.chapter.five.PrintFile;

public class IOSteamDemo {

	public static void main(String[] args) {
		try {
			DataInputStream in = new DataInputStream(
				new BufferedInputStream(
					new FileInputStream(args[0])));
			String s, s2 = new String();
			while((s = in.readLine()) != null) {
				s2 += s + "\n";
			}
			in.close();
			StringBufferInputStream in2 =
				new StringBufferInputStream(s2);
			int c;
			while((c = in2.read()) != -1) {
				System.out.println((char)c);
			}
			
			try {
				DataInputStream in3 = 
					new DataInputStream(
						new StringBufferInputStream(s2));
				while(true) {
					System.out.println((char)in3.readByte());
				}
			} catch(EOFException e) {
				System.out.println("End of stream encountered");
			}
			
			try {
				LineNumberInputStream li = 
					new LineNumberInputStream(
							new StringBufferInputStream(s2));
				DataInputStream in4 = 
					new DataInputStream(li);
				PrintStream out1 = 
					new PrintStream(
						new BufferedOutputStream(
							new FileOutputStream(
								"IODemo.out")));
				while((s = in4.readLine()) != null) {
					out1.println(
						"Line " + li.getLineNumber() + s);
					out1.close();
				}
			} catch(EOFException e) {
				System.out.println("End of stream encountered");
			}
			
			try {
				DataOutputStream out2 = 
					new DataOutputStream(
						new BufferedOutputStream(
							new FileOutputStream("Data.txt")));
				out2.writeBytes(
					"Here's the value of pi: \n");
				out2.writeDouble(3.34159);
				out2.close();
				DataInputStream in5 = 
					new DataInputStream(
						new BufferedInputStream(
							new FileInputStream("Data.txt")));
				System.out.println(in5.readLine());
				System.out.println(in5.readDouble());
			} catch(EOFException e) {
				System.out.println("End of stream encountered");
			}
			
			RandomAccessFile rf = 
				new RandomAccessFile("rtest.dat", "rw");
			for(int i = 0; i < 10; i++) {
				rf.writeDouble(1 * 1.414);
			}
			rf.close();
			
			rf = new RandomAccessFile("rtest.dat", "rw");
			rf.seek(5 * 8);
			rf.writeDouble(47.0001);
			rf.close();
			
			rf = new RandomAccessFile("rtest.dat", "r");
			for(int i = 0; i < 10; i++) {
				System.out.println("Value " + i + ": " + rf.readDouble());
			}
			rf.close();
			
			InFile in6 = new InFile(args[0]);
			String s3 = new String();
			System.out.println(
				"First line in file: " + 
				in6.readLine());
			in6.close();
			
			PrintFile out3 = new PrintFile("Data2.txt");
			out3.print("Test of PringFile");
			out3.close();
			
			OutFile out4 = new OutFile("Data3.txt");
			out4.writeBytes("Test of outDataFile\n\r");
			out4.writeChars("Test of outDataFile\n\r");
			out4.close();
			
 		} catch(FileNotFoundException e) {
 			System.out.println("File Not Found:" + args[0]);
 		} catch(IOException e) {
 			System.out.println("IO Exception");
 		}
	}
}
