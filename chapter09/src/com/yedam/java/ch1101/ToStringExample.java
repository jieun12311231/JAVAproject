package com.yedam.java.ch1101;

import java.util.Date;

public class ToStringExample {

	public static void main(String[] args) {

		Object obj = new Object();
		System.out.println(obj.toString()); // 객체의 주소

		Date obj2 = new Date();
		System.out.println(obj2.toString()); // 날짜에 대한 정보 찍기

		// >> toString()객체의 정보를 출력할때 사용

	}

}
