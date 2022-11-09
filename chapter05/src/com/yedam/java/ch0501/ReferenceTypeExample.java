package com.yedam.java.ch0501;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// null과 NullPointerException
//		String str;  //단순히 이 변수를 사용하겠다고 선언 
//		String str = null;//비어있는 값이지만 공간은 배정되어있는 상태
//		System.out.println("길이 : "+str.length());   //코드상에는 문제가 없기떄문에 빨간줄이 뜨지 않음 
		// str은 메소드에 있는 모든 클래스 중 String의 필드를 찾아가서 확인을 함
		// 컴파일(단순 문법상의 문제) 상으로는 전혀 문제가 되지않음.>> 실제로 진행시켰을때 정확하게 모르고 그냥 문법만 확인함.
		// 메소드에는 내가 만든 클래스뿐만아니라 java내에 사용되는 모든 class가 담겨져있음
		// NullPointerException 제일 많이 당황스러워하는 예외.
		// 자바에서 발생하는 오류를 예외라고 함.

/////////String(문자열) 비교
		String strVar1 = "신미철";
		String strVar2 = "신미철";
		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		// string은 독특한 객체임 두개의 변수에 신미철이라는 이름을 넣음. 신미철이라는 이름의 객체가 하나 선언 되어있고.
		// var1와 var2는 똑같은 신미철이라는 객체를 참조함.
		// 힙영역을 우선적으로 다 찾아봄> 홍길동이라는 객체가 있으면 그 객체의 주소를 반환시킴.
		// 홍길동 객체가 없으면 새로운 홍길동이라는 객체를 생성시킴.
		// var이 가지고 있는 값은 주소값을 가지고 있는것 >>신미철은 주소가 같기떄문에 true가 됨.
		// 참조하고 있는 객체가 같음.
		if (strVar1.equals(strVar2)) { // 이렇게 실행했을때 true값이 뜨는 것이 찐으로 문자열까지 같은 것 !!
			System.out.println("strVar1과strVar2가 문자열이 같음");
			// string의 특징중에 하나
		}
		System.out.println("-------구분선--------");
		// 원래 객체 타입에 값을 주는 방법//정석적으로 값을 가지는 방법
		String strVar3 = new String("신미철");
		String strVar4 = new String("신미철");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		} else {
			System.out.println("strVar3과 strVar4는 참조가 다름 ");

		} // 변수를 제외하면 위의 상황과 같지만 결과는 다름

		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3와 strVar4는 문자열이 같음");
		} // 참조는 다르지만 문자열은 같음 .

		// 원래 객체나 참조타입은 new연산자를 통해 매번 새로운 객체를 만들어냄.
		// 객체에서는 다른 객체를 참조하고있다.
		// equals : 문자열이 같은지가 중요함. 실제로 갖고있는 값이 같은지 > ex) 신분증이 민증, 여권, 면허증 등이 여러가지라고 사람이
		// 3명인게 아님.
		// 서로 다른 객체 인지는 상관없이 실제로 갖고있는 값을 비교
		// 등호 연산을 했을때는 false /equals연산을 하면 true인 경우가 종종 발생함
		// 같은 값을 비교하고자 하는것인지, 객체를 비교하고자 하지 잘 생각을 해봐야함
		// 지금부터 배울 배열과 class는 적용이 됨.
		//

	}
}
