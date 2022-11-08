package com.yedam.java;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 2;
		char operator = '+';

		if (operator == '+') {
			System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
		} else if (operator == '-') {
			System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
		} else if (operator == '*') {
			System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
		} else if (operator == '/') {
			System.out.printf("%d / %d = %d \n", num1, num2, num1 / num2);
		}

	}

}
