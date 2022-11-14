package com.yedam.java.ch1101;

public class Key {

	public int number;

	public Key(int number) {
		this.number = number;
	}

	@Override  //객체 동등비교
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj;
			if (this.number == compareKey.number)   //if문 한줄은 중괄호 필요없음.
				return true;
			
		}
		return false;
	}

	
	@Override
	public String toString() {
//		System.out.println("");
		return "Key값은 : " + number;
	}
}
