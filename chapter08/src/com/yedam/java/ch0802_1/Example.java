package com.yedam.java.ch0802_1;
//인터페이스 상속 교재 399

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementationC impl = new ImplementationC();

		InterfaceA ia = impl;
		ia.methodA();

		InterfaceB ib = impl;
		ib.methodB();

		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		// InterfaceC 는A와 B를 상속 받았기때문에
		// method 다 사용가능함.

	}

}
