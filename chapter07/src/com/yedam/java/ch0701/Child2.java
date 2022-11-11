package com.yedam.java.ch0701;

import com.yedam.java.ch0701_1.Parent; //ch0701_1패키지의 Parent와 연결

public class Child2 extends Parent { // Parent Child 이렇게 적히면 오류 >> 자식은 여러 부모 안됨
//부모가 여러명 있으면 자식이 어느 클래스 필드에서 정보를 가져와야하는지 모르게됨.
//부모 클래스가 둘쨰 자식을 가짐 
//다른 패키지에 있는 부모를 섬기는것

	// 필드

	// 생성자

	// 메소드
	void getInfo() {
		
		System.out.println(firstName + lastName + bloodType); //+ age);
		//firstName,age - default 접근 제한자//다른 패키지에서는 사용할 수 없음. 
		//lastName,bloodType - protected접근 제한자// 부모에 있는 패키지 사용사능
		
		//protected.default//공동잠:같은 패키지에서는 사용가능
		//차이점 : protected는 다른패키지에 있어도 사용이 가능함.
		
		//public은 패키지 상관없이 사용가능
		

		
	}
	
}
