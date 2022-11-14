package com.yedam.java.ch1101;

import java.util.HashMap;

public class MemberExample {

	public static void main(String[] args) {
//객체 동등 비교 조건은 // 값이 같은지 ? 다른지?
		// 강제타입변환
		// 최상위 Object >밑에 여러 클래스가 있음
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등");
		} else {
			System.out.println("obj1과 obj2 는 같지 않음");
		}
		//

		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등");
		} else {
			System.out.println("obj1과 obj3 는 같지 않음");
		}

		// 해시코드 오버라이딩
		HashMap<Member, String> member = new HashMap<>();

		// new <Member("1") -> "1"의 주소가 10 이고 해시코드 1
		member.put(new Member("1"), "홍길동");

		// new <Member("1") -> "1"의 주소가 10 이고 해시코드 1
		String value = member.get(new Member("1"));
		System.out.println(value);
	}

}
