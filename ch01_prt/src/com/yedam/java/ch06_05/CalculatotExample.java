package com.yedam.java.ch06_05;

public class CalculatotExample {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.pi;

		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
