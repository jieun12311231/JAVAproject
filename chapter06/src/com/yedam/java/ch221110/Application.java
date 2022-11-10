package com.yedam.java.ch221110;

public class Application {
//배열
//	int[] ary = new int[6];
//배열 진화 //2차원 배열이랑 비슷함 
//클래스[] ary2 = new 클래스[6];
//2차원 배열과 같음
	// 공통적인 라인에있는 배열들을 효과적으로 분류하기위해서 //
	
//	Bank[] Bary2 = new Bank[6];  //회원의 수가 6명으로 한정
//	[ [new Bank()],[new Bank()],[new Bank()],[new Bank()],[new Bank()],[new Bank()] ]
		// 배열 안에 바로 배열이 있는것이 아니라 배열 안에 들어가서 또다른 주소를 찾아서 떠나야함
		// 첫번째 배열에 가서 주소로 가서 데이터를 찾음.

	public static void main(String[] args) {

		// 은행 고객 정보를 입려하는 프로그램
		// ExeApp app = new ExeApp();이 이떄까지 했던방법인데 이것만 적으면 ExeApp을 실행하겠다는 의미
		
		new ExeApp(); // 애를 실핼하면 ExeApp의 public ExeApp()을 실행

	}

}

//next()과	sc.nextLine(); 차이 
//	sc.next();
//	sc.nextInt();
//	//123456
//	//엔터
//	//엔터 기준 앞에 있는 정보 다 들고감
//	//엔터를 뺴고 다 가지고 감
//	
//	sc.nextLine();
//	//123456엔터  >>엔터 기준으로 작동하기때문에 콘솔에 엔터가 남아있으면
