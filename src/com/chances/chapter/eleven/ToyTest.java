package com.chances.chapter.eleven;

public class ToyTest {

	public static void main(String[] args) {
		Class c = null;
		try {
			c = Class.forName("com.chances.chapter.eleven.FancyToy");
		} catch(ClassNotFoundException e) {
			
		}
		printInfo(c);
		Class[] faces = c.getInterfaces();
		for(int i = 0; i < faces.length; i++) {
			printInfo(faces[i]);
		}
		Class cy = c.getSuperclass();
		Object o = null;
		try {
			o = cy.newInstance();
		} catch(InstantiationException e) {
			
		} catch(IllegalAccessException e) {
			
		}
		printInfo(o.getClass());
	}
	static void printInfo(Class cc) {
		System.out.println(
			"Class name: " + cc.getName() + 
			" is interface? [" + 
			cc.isInterface() + "]");
	}
}
