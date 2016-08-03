package com.chances.chapter.ten;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialCt1 implements Serializable {

	String a;
	transient String b;
	public SerialCt1(String aa, String bb) {
		a = "Not Transient: " + aa;
		b = "Transient: " + bb;
	}
	
	public String toString() {
		return a + "\n" +b;
	}
	
	private void writeObject(ObjectOutputStream stream) 
		throws IOException {
		stream.defaultWriteObject();
		stream.writeObject(b);
	}
	
	private void readObject(ObjectInputStream stream) 
		throws IOException, ClassNotFoundException {
		stream.defaultReadObject();
		b = (String)stream.readObject();
	}
	
	public static void main(String[] args) {
		SerialCt1 sc = 
			new SerialCt1("Test1", "Test2");
		System.out.println("Before:\n" + sc);
		ByteArrayOutputStream buf = 
			new ByteArrayOutputStream();
		try {
			ObjectOutputStream o = 
				new ObjectOutputStream(buf);
			o.writeObject(sc);
			ObjectInputStream in = 
				new ObjectInputStream(
					new ByteArrayInputStream(
						buf.toByteArray()));
			SerialCt1 sc2 = (SerialCt1)in.readObject();
			System.out.println("After:\n" + sc2);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
