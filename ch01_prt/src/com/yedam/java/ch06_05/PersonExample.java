package com.yedam.java.ch06_05;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person ps1 = new Person("123456-1234", "김");

		System.out.println(ps1.nation);
		System.out.println(ps1.name);
		System.out.println(ps1.ssn);

		
		ps1.name = "박박디라라";
		
		System.out.println(ps1.name);
	}

}
