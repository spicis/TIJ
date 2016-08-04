package com.chances.chapter.eleven;

import java.util.Hashtable;
import java.util.Vector;

public class PetCount {

	static String[] typenames = {
		"Pet", "Dog", "Pug", "Cat",
		"Rodent", "Gerbil", "Hamster",
	};
	
	public static void main(String[] args) {
		Vector pets = new Vector();
		try {
			Class[] petTypes = {
				Class.forName("Dog"),
				Class.forName("Pug"),
				Class.forName("Cat"),
				Class.forName("Rodent"),
				Class.forName("Gerbil"),
				Class.forName("Hamster"),
			};
			for(int i = 0; i < 15; i++) {
				pets.addElement(
					petTypes[
					    (int)(Math.random() * petTypes.length)]
					    .newInstance());
			} 
		} catch(InstantiationException e) {
			
		} catch(IllegalAccessException e) {
			
		} catch(ClassNotFoundException e) {
			
		}
		Hashtable h = new Hashtable();
		for(int i = 0; i < typenames.length; i++) {
			h.put(typenames[i], new Counter());
		}
		for(int i = 0; i < pets.size(); i++) {
			Object o = pets.elementAt(i);
			if( o instanceof Pet) {
				((Counter)h.get("Pet")).i++;
			}
			if( o instanceof Dog) {
				((Counter)h.get("Dog")).i++;
			}
			if(o instanceof Pug) {
				((Counter)h.get("Pug")).i++;
			}
			if(o instanceof Cat) {
				((Counter)h.get("Cat")).i++;
			}
			if(o instanceof Rodent) {
				((Counter)h.get("Rodent")).i++;
			}
			if(o instanceof Gerbil) {
				((Counter)h.get("Gerbil")).i++;
			}
			if(o instanceof Hamster) {
				((Counter)h.get("Hamster")).i++;
			}
		}
		for(int i = 0; i < pets.size(); i++) {
			System.out.println(
				pets.elementAt(i).getClass().toString());
		}
		for(int i = 0; i < typenames.length; i++) {
			System.out.println(
				typenames[i] + " quantity: " + 
			    ((Counter)h.get(typenames[i])).i);
		}
	}
}
