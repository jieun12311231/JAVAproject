package com.yedam.java.ch07_03;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Application 클래스 정의 / 아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//- 출력결과
//	영화제목 : 추격자
//	감독 : 7
//	배우 : 5
//	영화총점 : 12
//	영화평점 : ☆☆☆☆
//	=====================
//	공연제목:지킬앤하이드
//	감독:9
//	배우:10
//	공연총점 : 46
//	공연평점 : ☆☆☆☆☆
//- 조건
//	관객수, 총점과 평점은 입력되는 값에 따라 변동될 수 있습니다.

		Movie movie = new Movie("추격자", 7, 5, null);
		movie.setTotalScore(2);
		movie.setTotalScore(4);
		movie.setTotalScore(6);
		movie.getInformation();
		
//		Culture culture = (Culture) movie;
////		culture.setTotalScore(12);
//		culture.total = 12;
//		System.out.println("영화총점 :" + culture.total);
		

		System.out.println("======================");

		Performance performance = new Performance("지킬앤하이드", 9, 10);
		performance.setTotalScore(3);
		performance.setTotalScore(5);
		performance.setTotalScore(6);
		performance.getInformation();
//		culture = (Culture) performance;
//		culture.total = 46;
//		System.out.println("영화총점 :" + culture.total);

	}

}
