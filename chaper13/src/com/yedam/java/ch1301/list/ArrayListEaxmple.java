package com.yedam.java.ch1301.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEaxmple {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		// < >안에는 인덱스에 들어갈 객체의 타입 >> List는 String 객체만 넣을수있는 타입.

//		List<E> list2 = new ArrayList<>();
		// E는 내가 어쩐 객체를 넣을지 모르겠을때 어떤 객체든 허용해준다는 의미 element >>타입 파라미터
		// Integer를 넣을수도 있고 다른 타입 다 들어갈수도있음.

		// 객체 저장
		// 배열 list[0] = "Java"; 얘랑 같은 의미!!
		list.add("Java"); // >>내가 데이터를 넣은 만큼의 공간만 가짐
		list.add("JDBD");
		list.add("Servlet/JSP");
		list.add(2, "DataBase"); // 인덱스가 2인 애한테 값을 넣음 >>원래 인덱스 2자리에 있던 객체는 한자리 뒤로 밀림 > 인덱스3의 자리
		list.add("iBATIS");

		// 배열의 list.length();
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		System.out.println();

		// skill = list[2];
		String skill = list.get(2); // 인덱스2번의 값을 가지고옴
		System.out.println("2: " + skill + "\n");

		for (int i = 0; i < list.size(); i++) { // list의 크기만큼 for문이 돌아감.
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();

		
		//데이터 삭제//
		System.err.println("===삭제===");
		list.remove(2);  //삭제되면 뒤에 있는 데이터는 한칸씩 앞으로 당겨짐.
		for (int i = 0; i < list.size(); i++) { // list의 크기만큼 for문이 돌아감.
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2);
		list.remove("iBATIS");
		
		for (int i = 0; i < list.size(); i++) { // list의 크기만큼 for문이 돌아감.
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
//		System.out.println();
//		list.remove(2);

	}

}
