package com.yedam.java.ch1301.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		System.out.println("총 Entry수 :" + map.size());
		// 오버라이딩으로 재정의 하였기때문에 같은 객체로 인식하여 객체수는 1이 됨.
		// 오버라이딩으로 재장의 하지않았으면 new연산자를 통해만들어진 다른 객체이기떄문에 엔트리의 수는 2가 됨.
	}

}
