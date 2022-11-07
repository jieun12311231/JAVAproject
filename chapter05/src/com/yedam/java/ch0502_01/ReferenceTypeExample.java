package com.yedam.java.ch0502_01;

public class ReferenceTypeExample {

	public static void main(String[] args) {

		// 클래스 테스트
		// 배열선언 배열을 이루는 타입 지정
		// 보통은 이 방법을 많이 사용함. 배열이 가질수 없는 값은 없음.배열의 배열도 값으로 가질 수 있음
		int[] intAry = null;
//		int intArt2[];
//		System.out.println("intAer[0] : "+intAry[0]); //변수 쓰고 []안에 접근하고자 하는 인덱스의 값을 적으면 됨.
		// 배열을 선언을 하게되면 실제로는 힙영역에 객체가 생성>> 내부에 공간이 생김 >> 번지수가 들어감.
		// 단순히 인덱스를 통해서 접근하려고 해고 객체가 없으면 접근하기 힘듬 null이면 값이없기때문에 아무것도 할 수 없음.
		// 동작을 할수 있는 건없는데 명령만 내리는것임.

		// scores라는 int배열 선언
		// 값을 초기화 하면서 배열을 생성한것 //메모리 상에는 객체가 생기고 안에 칸이 3칸이 생겨서 83 90 87값을 갖고있음
		// scores라는 변수가 생김 값은 객체가 갖고있는 주소라는 값을 하나만 가지고 있음
		// scores에 index를 통해접근을 하면 객체가 갖고있는 주소를 가지고 찾아감. 주소를 가지고 값을 비교함
		// 힙영역에 객체는 직접적으로 접근하거나 건들수 없음 >> 무조건 스택을 통해서 접근해야함.
		int[] scores = { 83, 90, 87 }; // 배열로 선언을해서 객체처럼 값을 줌.
		// 보통 자바에서는 이런식으로 값을 주지 않음
		System.out.println("scores[0] : " + scores[0]);
		System.out.println("scores[1] : " + scores[1]);
		System.out.println("scores[2] : " + scores[2]);
		// 실제 값에 접근을 하려면 scores만 있으면 안되고, 반드시 인덱스를 통해 접근할수 있음.

		int sum = 0;
		for (int i = 0; i < 3; i++) { // for문과 배열의 결함  // 크기 주의 =같다는 빠짐 index에는 같다(=)안들어감!!
			sum += scores[i];
	//			sum += scores[0];
	//			sum += scores[1];
	//			sum += scores[2];
//			System.out.println(scores[i]);
		}
		System.out.println("총합 : " + sum);
		double avg = sum / 3.0; // 소수점까지 정확하게 나오게 하기위해서 double
		System.out.println("평균 : " + avg);
		
		//주의 사항 변수를 선언하면서 값을 주는 것은 가능하지만, 
		//변수를 선언한 후 값을 주는것은 불가능!!!!!!!
//		int[] scoreList;
//		scoreList = {83,90,87};
		//방법1)
		int[] scoreList1;
		scoreList1 = new int[]{83,90,87};  //>> new int[] >[]안에 값을 주면 안됨(new int[5] XXXX)
		//방법2)
		int[] scoreList2 = {83,90,87};
		
		
//		User user = new User();
//		user.name = "홍길동";
//		user.age = 25;
//		user.height = 180;
//
//		/*
//		 * 자스 let user ={ name : "홍길동", age:25, height:180 }
//		 */// 자스에서는 이렇게 객체를 주는 것이 가능하지만 자바에서는 안됨.

	}

}
