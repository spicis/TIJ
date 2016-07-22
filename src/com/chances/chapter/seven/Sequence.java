package com.chances.chapter.seven;

public class Sequence {

	private Object[] o;
	private int next = 0;
	public Sequence(int size){
		o = new Object[size];
	}
	public void add(Object x){
		if(next < o.length){
			o[next] = x;
			next++;
		}
	}
	
	private class SSelector implements Selector{
		int i = 0;
		public boolean end (){
			return i == o.length;
		}
		public Object current(){
			return o[i];
		}
		public void next(){
			if(i < o.length)
				i++;
		}
	}
		
	public Selector getSelector(){
		return new SSelector();
	}
	
	public static void main(String[] args){
		Sequence s = new Sequence(10);
		for(int i = 0; i < 10; i++){
			s.add(Integer.toString(i));
		}
		Selector s1 = s.getSelector();
		while (!s1.end()){
			System.out.println((String)s1.current());
			s1.next();
		}
	}
	
}
