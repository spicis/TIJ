package com.chances.chapter.seven;

public class Frog extends Amphibian {

	Frog() {
		System.out.println("Frog()");
	}
	
	protected void finalize() {
		System.out.println("Frog finalize");
		if(DoBaseFinalization.flag) {
			try {
				super.finalize();
			} catch(Throwable t) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		if(args.length != 0 && 
				args[0].equals("finalize")){
			DoBaseFinalization.flag = true;
		}
		else {
			System.out.println("not finalizing bases");
		}
		new Frog();
		System.out.println("bye!");
		System.runFinalizersOnExit(true);
	}
}
