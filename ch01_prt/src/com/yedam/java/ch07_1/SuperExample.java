package com.yedam.java.ch07_1;

public class SuperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Super sa = new Super();
		sa.takeOff();
		sa.fly();
		sa.flyMode = Super.SUPERSONIC;
		sa.fly();
		sa.flyMode = Super.NOMAL;
		sa.fly();
		sa.land();
	}

}
