package com.yedam.java.ch1101;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {

		// class에 대한 정보를 가지고 올때 class의 class
		// <<Key클래스 객체를 가지고 오기 >>
		// 1)직접 클래스 객체 가지고 오기

		Class clazz = Key.class; // >>Key를 부모 클래스인 Class로 자동타입변환
		System.out.println(clazz); // Key클래스객체를 가지고옴

		// 2) 경로를 통한 클래스 객체 가지고 오기ㅣ
		Class clazz2 = Class.forName("com.yedam.java.ch1101.Key");

		System.out.println(clazz2);

		// 3) 객체로부터 클래스 객체얻기 getClass
		Key key = new Key(1);
		Class clazz3 = key.getClass();
		System.out.println(clazz3);

		//
		String photoPath = clazz.getResource("봉구.jpg").getPath();
//		//clazz를 통해 봉구의 위치를 받아옴.
		// 같은 폴더안에 봉구가 있는지 찾아내고 경로를 출력함.
		// 다른 폴더에 있으면 못찾음!!!!!!!
		// 다른 폴더 안에 있으면 000/봉구.jpg
		System.out.println(photoPath);
	}
}
