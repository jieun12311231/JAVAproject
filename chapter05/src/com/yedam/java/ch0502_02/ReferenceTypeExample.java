package com.yedam.java.ch0502_02;

public class ReferenceTypeExample {
/////////교재 186쪽

	public static void main(String[] args) { // String[] args외부에서 받는 값은 이쪽으로 들어가게 됨.
		//
//		System.out.println("입력값 :"+args[0]);  //콘솔실행하는 항목 밑에 Argument >main 방금만든 항목으로 

		// 코드 상에는 문제가 없음 but 들고있는 값이 없기때문에 콘솔에 바로 출력하면 에러가 뜸
		// 값이 부족하다면 if문을 통해서 값이 부족함을 알려줘야함

		if (args.length != 2) { // 외부값이 두개가 들어와야 하는데 두개가 충족되지않으면 안내문구가뜨게하는 것.
			System.out.println("값의 수가 부족합니다."); // 종료되는 이유를 적어줌.
			System.exit(0);
		}
		String strNum1 = args[0]; // Argument 창에 10 5적으면 콘솔 창에 10+5=15 라고뜸 >> 외부값을 받아오는 것
		String strNum2 = args[1];

		int num1 = Integer.parseInt(strNum1); // String값으로 외부값이 들어오기떄문에 int타입으로 변환.
		int num2 = Integer.parseInt(strNum2);

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		
		
		
		
	}

}
