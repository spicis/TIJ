package com.chances.chapter.eleven;

public class SweetShop {

	public static void main(String[] args) {
		System.out.println("inside main");
		new Candy();
		System.out.println("After creating Candy");
		try {
			Class.forName("com.chances.chapter.eleven.Gum");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("After Class.forName(\"Gum\")");
		new Cookie();
		System.out.println("Agrer creating Cookie");
	}
}
