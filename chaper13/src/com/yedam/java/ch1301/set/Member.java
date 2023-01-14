package com.yedam.java.ch1301.set;

public class Member {
	public String name;
	public int age;

	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		//name = String
		//Member mem1 = new Member("yd",1);
		//Member mem2 = new Member("yd",1);
		//Member mem3 = new Member("yd",4);
		//mem1/mem2 비교 "yd" -> 2 age-> 1  >> 새로운 해시코드 3
		
		//mem2/mem3 비교 "yd" -> 2 age -> 4  >> 최종 hachCode() =  6
		//"yd"은 문자열이기때문에 1,2,3다 같음 
		//name만 비교하면 1,2,3은 같은 객체가 됨
		return name.hashCode() + age; 
		// 같은 주소 값 = 같은해시 코드를 가짐 //네임 해시코드 + 나이 해시코드 >> 새로운 해시코드>> 새로운 해시코드를 이용해서 같은 객체인지
		//네임 해시코드 가 같고 나이 해시코드가 같으면 새로운 해시코드도 같을것이기때문>>>>더 정밀하게 비교가 가능함. 
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		} else {
			return false;
		}
	}
	
	
	
	
	
	
}
