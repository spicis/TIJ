package com.chances.chapter.nine;

public class StormyInning extends Inning {

	StormyInning() throws RainedOut, BaseballException {
		
	}
	
	StormyInning(String s) throws Foul, BaseballException {
		
	}
	
//	void walk() throws PopFoul {
//		
//	};
	
	public void rainHar() throws RainedOut {
		
	}
	
	public void event() {
		
	}
	
	void atBat() throws PopFoul {
		
	}
	
	public static void main(String[] args) {
		try {
			StormyInning si = new StormyInning();
			si.atBat();
		} catch(PopFoul e) {
			
		} catch(RainedOut e) {
			
		} catch(BaseballException e) {
			
		}
		try {
			Inning i = new StormyInning();
			i.atBat();
		} catch(Strike e) {
			
		} catch(Foul e) {
			
		} catch(RainedOut e) {
			
		} catch(BaseballException e) {
			
		}
	}
}
