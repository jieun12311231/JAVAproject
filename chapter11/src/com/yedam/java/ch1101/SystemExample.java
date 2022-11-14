package com.yedam.java.ch1101;

public class SystemExample {

	public static void main(String[] args) {

		// 프로그램을 종료
		// 현재시간을 가져와서 보여준다.
		// system.exit();>> 프로그램 끄기
//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//			if (i == 5) {
////				System.exit(0);
//				// 얘를 만나면 바로 프로그램 종료 >>웬만하면 사용하지 말기~~~~~~~
//				// 프로그램을 건들기떄문에 위험한 색히
//				System.out.println("프로그램 종료"); // 얘가 exit 밑에 있으면 출력 안됨
//
//			}
//
//		}
//		// 현재시간 읽기
//		long time1 = System.nanoTime(); // 시간을 체크하는 시점 ->0초
//
//		int sum = 0;
//		for (int i = 1; i <= 100000; i++) {// 100000 계산하면서 시간 벌기
//			sum += 1;
//		}
//
//		long time2 = System.nanoTime(); // 시간 읽기 그만하기 ->10초
//		System.out.println("sum : " + sum);
//		System.out.println("계산 시간 :" + (time2 - time1) + " 나노초가 소요됨.");
//time2 - time1 얼마나 소요되는지 알수있는 수식
		
		//★★//랜덤값뽑을때 종종 사용됨.
		long time3 = System.currentTimeMillis();//현재시간 읽어오기  
		//시간의 데이터를 가지고 오기떄문에 중복 데이터 없고 누적데이터 없음
		//중복 되지않을 데이터를 쓸려면 currentTimeMillis()얘를 쓰면됨.
		
		System.out.println(time3);
		
		
		
	}

}
