package com.yedam.java.ch1101;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap  -> Key, value 값으로 데이터 저장
		// >>열쇠를 가지고 객체를 가지고 오는 느낌

//오버라이딩 하지않은 객체 비교

		HashMap<Key, String> hashmap = new HashMap<>();
//>HashMap :Key 물건을 찾으로 갈 열쇠 class타입////String 데이터를 저장하는 형식
		// 열쇠를 주면 열쇠에 있는 데이터를 준다고 생각하면됨.
		//

		// 여기서는 new Key(1) -> 1
		hashmap.put(new Key(1), "홍길동"); // put > hashmap에 열쇠는 new Key(1) 이고 열쇠를 주면서 보관하는 데이터는 "홍길동"
		// put은 열쇠를 주고 데이터를 보관

		// 여기서는 new Key(1) -> 2
		String value = hashmap.get(new Key(1)); // new Key(1)열쇠로 물건을꺼내옴
		// get은 열쇠를 주고 데이터를 가져옴
		System.out.println(value); // >>그렇게 되면 "홀갈동"이 출력돼야하는데 안나옴
		// (new Key(1) 랑 new Key(1)는 다른 객체 >> 주소값이 들어가지만
		// 해당객체가 가지고있는 해쉬코드가
		// new Key(1)똑같이 생겼지만 주소는 다름!

		// 얘네가 new연산자를 통해 정의된 다른 객체라는 걸로 생각하면됨.
//		Key k1 = new Key(1);
//		Key k2 = new Key(1);

		// toString
		Key key = new Key(1);
		System.out.println(key.toString());

	}

}
