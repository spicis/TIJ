package com.chances.chapter.nine;

public class Rethrowing {

	public static void f() throws Exception{
		System.out.println("originating the exception in f()");;
		throw new Exception("throw from f()");
	}
	
	public static void g() throws Throwable {
		try {
			f();
		} catch(Exception e) {
			System.out.println("Inside g(), e.pringStackTrace()");;
			e.printStackTrace();
//			throw e;
			throw e.fillInStackTrace();
		}
	}
		
	public static void main(String[] args) throws Throwable {
		try {
			g();
		} catch(Exception e) {
			System.out.println("Caught in main, e.printStackTrace()");;
			e.printStackTrace();
		}
	}
}
