package com.chances.chapter.twelve;

public class CheckCloneable {

	static Ordinary tryToClone(Ordinary ord) {
		String id = ord.getClass().getName();
		Ordinary x = null;
		if(ord instanceof Cloneable) {
			try {
				System.out.println("Attempting " + id);
				x = (Ordinary)((IsCloneable)ord).clone();
				System.out.println("Cloned " + id);
			} catch(CloneNotSupportedException e) {
				System.out.println("Could not clone " + id);
			}
		}
		return x;
	}
	public static void main(String[] args) {
		Ordinary[] ord = {
			new IsCloneable(),
			new WrongClone(),
			new NoMore(),
			new TryMore(),
			new BackOn(),
			new ReallyNoMore(),
		};
		Ordinary x = new Ordinary();
		for(int i = 0; i < ord.length; i++) {
			tryToClone(ord[i]);
		}
	}
}
