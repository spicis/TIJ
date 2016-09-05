/*
  * Copyright (c) 2016 by Chances.
  * $HeadURL$:
  * $Author$:
  * $Date$:
  * $Rev$:
  */
package com.chances.chapter.sixteen;

/**
 * @author Sui Canghai
 * 2016年9月5日
 *
 */
public class SingletonPattern {

	public static void main(String[] args) {
		Singleton s = Singleton.getHandle();
		System.out.println(s.getValue());
		Singleton s2 = Singleton.getHandle();
		s2.setValue(9);
		System.out.println(s.getValue());
		try {
			
		} catch(Exception e) {
			
		}
	}
}
