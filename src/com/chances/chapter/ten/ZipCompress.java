package com.chances.chapter.ten;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Enumeration;
import java.util.zip.Adler32;
import java.util.zip.CheckedInputStream;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class ZipCompress {

	public static void main(String[] args) {
		try {
			FileOutputStream f = 
				new FileOutputStream("test.zip");
			CheckedOutputStream csum = 
				new CheckedOutputStream(
					f, new Adler32());
			ZipOutputStream out = 
				new ZipOutputStream(
					new BufferedOutputStream(csum));
			out.setComment("A test of Java Zipping");
			for(int i = 0; i < args.length; i++) {
				System.out.println(
					"Writing file " + args[i]);
				BufferedReader in = 
					new BufferedReader(
						new FileReader(args[i]));
				out.putNextEntry(new ZipEntry(args[i]));
				int c;
				while((c = in.read()) != -1) {
					out.write(c);
				}
				in.close();
			}
			out.close();
			System.out.println("Checksun: " + 
				csum.getChecksum().getValue());
			System.out.println("Reading file");
			FileInputStream fi = 
				new FileInputStream("test.zip");
			CheckedInputStream csumi = 
				new CheckedInputStream(fi, new Adler32());
			ZipInputStream in2 = 
				new ZipInputStream(
					new BufferedInputStream(csumi));
			ZipEntry ze;
			System.out.println("Checksum: " +
				csumi.getChecksum().getValue());
			while((ze = in2.getNextEntry()) != null) {
				System.out.println("Reading file " + ze);
				int x;
				while((x = in2.read()) != -1) {
					System.out.write(x);
				}
			}
			in2.close();
			ZipFile zf = new ZipFile("test.zip");
			Enumeration e = zf.entries();
			while(e.hasMoreElements()) {
				ZipEntry ze2 = (ZipEntry)e.nextElement();
				System.out.println("File: " + ze2);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
