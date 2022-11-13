package com.yedam.java.ch07_1;

public class StudentExample {

	public static void main(String[] args) {
		Student std = new Student("홍길동", "951231-11111",1);
		System.out.println(std.name);
		System.out.println(std.ssn);
		System.out.println(std.StdNo);
		
		
		std.StdNo = 1234;
		
		System.out.println(std.StdNo);
	}
}
