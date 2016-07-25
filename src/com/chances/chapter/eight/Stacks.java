package com.chances.chapter.eight;

import java.util.Stack;

public class Stacks {

	static String[] months = {
		"January", "February", "March", "Aperil",
		"May", "June", "July", "August", "September",
		"October", "November", "December"
	};
	public static void main(String[] args) {
		Stack stk = new Stack();
		for(int i= 0; i < months.length; i++) {
			stk.push(months[i] + " ");
		}
		System.out.println("stk = " + stk);
		stk.addElement("The last line");
		System.out.println(
				"element 5 = " + stk.elementAt(5));
		System.out.println("poppin elements:");
		while(!stk.empty()) {
			System.out.println(stk.pop());
		}
	}
}
