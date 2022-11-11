package com.yedam.java.ch0702;

public class HankookTire extends Tire { //// Tire //부모 클래스가 기본 생성자가 아니기 때문에 매개변수를 넣어줘야흠
//부모 타이어의 규격을 받아와서 HankookTire를 만들어냄.
	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	@Override
	public boolean roll() {
		++accRotation;
		if (accRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 " + (maxRotation - accRotation) + "회");
			return true;

		} else {
			System.out.println("### " + location + "HankookTire 펑크 ###");
			return false;
		}
	}
}
