package com.chances.chapter.eleven;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ShowMethodsClean {

	static final String usage = 
		"usage: \n" + 
		"ShowMethods qualified.class.name\n" + 
		"To show all methods in class.name word\n" +
		"ShowMethods qualified.class.name word\n" + 
		"To search for methods involving 'word'";
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println(usage);
			System.exit(0);
		}
		try {
			Class c = Class.forName(args[0]);
			Method[] m = c.getMethods();
			Constructor[] ctor = c.getConstructors();
			String[] n = 
				new String[m.length + ctor.length];
			for(int i= 0; i < m.length; i++) {
				String s = m[i].toString();
				n[i] = StripQualifiers.strip(s);
			}
			for(int i= 0; i < ctor.length; i++) {
				String s = ctor[i].toString();
				n[i] = StripQualifiers.strip(s);
			}
			if(args.length == 1) {
				for(int i = 0; i < n.length; i++) {
					System.out.println(n[i]);
				}
			}
			else {
				for(int i = 0; i < n.length; i++) {
					if(n[i].indexOf(args[1]) != -1) {
						System.out.println(n[i]);
					}
				}
			}
		} catch(ClassNotFoundException e) {
			System.out.println("No such class: " + e);
		}
	}
}
