package com.yedam.java.ch06_03;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		calculator.powerOn();
		int result1 = calculator.plus(5, 6);
		System.out.println(result1);
		
		byte x= 10;
		byte y= 4;
		
//		calculator.divide(x , y);
		double result2 = calculator.divide(x, y);
		System.out.println(result2);
		
		calculator.powerOff();
		
		calculator.execute();
		
	}

}
