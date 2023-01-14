package com.yedam.java.ch1301.set;

import java.util.HashSet;
import java.util.Set;

public class HashCodeExaple2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동",30));  //100번지 
		set.add(new Member("홍길동",30));  //200번지 이지만 해쉬코드를 재정의 해서 ()안의 데이터만 비교할수있게 했기때문에 같은 객체로 인식함. 
		//재정의 안하면 다른 set 주머니 안에 들어간 서로다른 객체이기때문에 총 객체가 2개가 됨.
		System.out.println("총 객체수 : "+ set.size());
	}

}
