package com.yedam.java.ch06_05;

public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
