package com.yedam.java.ch1101;

public class Member {
	public String id;

	// toString()
	public String id2;
	public String id3;
	public String id4;
	public String id5;
	public String id6;
	public String id7;

	@Override // ~toString의 디폴트 모양~
	public String toString() {
		return "Member [id=" + id + ", id2=" + id2 + ", id3=" + id3 + ", id4=" + id4 + ", id5=" + id5 + ", id6=" + id6
				+ ", id7=" + id7 + "]";
	}// 내가 가지고있는 필드에 대한 정보를 이러한 형태로 표현 가능.

	public Member(String id) {
		this.id = id;
	}

	@Override // 객체 동등비교 equals사용 (객체의 데이터 동등비교)
	public boolean equals(Object obj) { // Object obj 여기에 obj2가 들어감 > 강제 타입 변환으로 인해서Member타입이 됨.

//		Object obj = new Member("blue");

		// => Member member =new Member("blue");
		Member member = (Member) obj;
		// 자식 클래스 의 필드를 이용하기 위해서 강제타입변환을 한것
		// >> 강제 타입변화를 통해 Member클래스 사용

		if (id.equals(member.id)) { // >> obj1.equals(member.obj2)
			// 두개의 데이터를 비교, id는 String>> 객체 id가 갖고있는 데이터를 가지고옴 //id 와 member.id를 비교 >>같다라는
			// 것은 동등한 객체를 가지고있다는것
			// obj1 이 new Member("blue");을끌고오고 obj2이 new Member("blue");을 끌고옴
			// 안의 값이 같기떄문에 true를 리턴함.
			return true;
		}
		return false;
	}

//해시코드를 오버라이딩 하면 MemberExample에 홍길동이 출력됨
	@Override
	public int hashCode() { // 해쉬코드는 정수로 반환됨int타입임.

		// 얘네는 같은 데이터면 같은 주소값을 참조하고있음
		// 같은 객체 a와 b는 a가 10번지에 있으면 b도 10번지에 존재함
		//
//		String a = "1";
//		String b = "1";

		return id.hashCode(); // 데이터가 같으면 >> 같은 주소값 >>해쉬코드가 똑같이 나옴

	}

}

//equals : 객체가 저장하고있는 데이터가 같다.
//