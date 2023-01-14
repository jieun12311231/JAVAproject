package com.yedam.java.ch1301.map;

import java.util.*;

public class HashmapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90); // 얘는 같은 홍길동이 있기때문에 사라지고 홍길동95만 남음 <<덮어써짐
		map.put("동장군", 80);
		map.put("홍길동", 95);

		System.out.println("총 Entry 수 : " + map.size());

		// 객체 찾기
		int score = map.get("홍길동");
		System.out.println("\t홍길동 " + score); // 홍길동의 점수가 나옴
		System.out.println();

		// 모든 key값 가져오기 //객체를 하나씩 처리
		Set<String> keySet = map.keySet(); // set의 개념을 가지고와서 사용 set>>주머니 map에서 받아온것을 keyset에 담음
		// map은 String integer둘다 넣어줘야함 //String 타입 하나만 찾기 위해 set
		Iterator<String> keyInterator = keySet.iterator();// 반복자 사용
		while (keyInterator.hasNext()) { // keyInterator 안에 객체가 있는지 확인 >> 데이터가 있으면 반복문이 돌아감
			String key = keyInterator.next(); // 키가 존재하면 끄집어내서 map에 있는 key에 넣음
			Integer value = map.get(key); // map에 있는 key를 끄집어내서 value에 넣어서
			System.out.println("\t" + key + " : " + value); // 출력시킴 //데이터 넣을때 순서를 신경쓰지 않음 >> 출력될떄 상관 지멋대로
		}
		System.out.println();

		// 객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());

		// 객체를 하나씩 처리 모든k,v(Map.Entry) 가져와서 처리
		// 두가지 방법 중에 편한거 사용ㅇ하면됨.
		System.out.println("===방법1===");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();// entrySet얘로 값가져옴 //key value형태로 저장//key와 value를 한세트로
																	// entry라고 함
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		while (entryIterator.hasNext()) { // key value형태 가 존재한다면 while문이 돌아감. //()안에는 하나의 덩어리로 생각하고 사용하면됨
			Map.Entry<String, Integer> entry = entryIterator.next(); // 키와 베류를 꺼내오기 위해서 주는 수식
			String key = entry.getKey();// 위의 수식을 이용해서 키를 꺼내오겠다
			Integer value = entry.getValue();// 위의 수식의 형태로 value를 꺼내오겠다
			System.out.println("\t" + key + " : " + value);

		}
		System.out.println();

		System.out.println("===방법2===");
		for (Map.Entry<String, Integer> temp : map.entrySet()) {
			String key = temp.getKey();
			Integer value = temp.getValue();
			System.out.println("\t" + key + " : " + value);
		}

		map.clear();
		System.out.println("총 Entry 수 : " + map.size());

	}
}
