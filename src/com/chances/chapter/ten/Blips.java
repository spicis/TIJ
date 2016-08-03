package com.chances.chapter.ten;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Blips {

	public static void main(String[] args) {
		System.out.println("Constructing objects:");
		Blip1 b1 = new Blip1();
		Blip2 b2 = new Blip2();
		try {
			ObjectOutputStream o =
				new ObjectOutputStream(
					new FileOutputStream("Blips.out"));
			o.writeObject(b1);
			o.writeObject(b2);
			o.close();
			ObjectInputStream in = 
				new ObjectInputStream(
					new FileInputStream("Blips.out"));
			System.out.println("Recovering b1:");
			b1 = (Blip1)in.readObject();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
