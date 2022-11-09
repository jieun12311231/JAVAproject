package com.yedam.java.example;

public class Check01 {

	public static void main(String[] args) {
////////// 교재 202쪽
		// 문제 1) 주어진 배열의 총 합과 평균을 구하세요.
		int[] array = { 10, 53, 26, 85, 75 };

		int sum = 0;
		for (int i = 0; i < array.length; i++) { // ★★★★★★★★★★i는 인덱스 값★★★★★★★★★★★★
			sum += array[i];
		}
		System.out.printf("총합계는 %d입니다\n", sum);
		System.out.println("총합계 " + sum);

		double avg = (double) sum / array.length;
		System.out.println("평균 : " + avg);
		System.out.printf("평균: %.2f\n", avg); // 실수형은 소수점 두자리로 제한주는것이 좋음
//		System.out.println("평균은 : "+ (double)sum/5);
//		System.out.printf("평균은 %.1f입니다.\n",(double)sum/5);

		// 풀이)
		// 배열의 값을 가지고 오기떄문에 i의 시작값은 0
		// 등호를 넣고싶으면 조건식 : i <= (array.length-1)
		// sum에 array이가 가지고 있는 값을 계속 누적 시킴.
		// 평균은 for문안에 들어가면 안됨!! 총합이 정해진 for밖에서 평균을 구해야함.
		// >> 굳이 for문 위에 평균 변수를 선언하고 for문안에 적으면 불필요한 코드 多.
		// double avg = (double) sum / array.length; >>sum과 length는 둘다 정수이기때문에 둘중 하나는
		// 반드시 실수형으로 바꿔줘야함.

		// 문제2) 배열의 최대값과 최소값을 구하세요.
		// 조건문 추가
		//
		int max = array[array.length - 1]; // array[array.length-1] >>>가능
		int min = array[0]; // int는 음수가 가질수있기때문에 0으로 주면 안됨.//임의의값 주지말기
		for (int i = 0; i < array.length; i++) {
			// 최대값 >>최대, 최소 각각 if문을 줘야함.
			if (max < array[i]) { // array이가 더 크면 max가 최대값이 아니기떄문에 max를 덮었씀
				max = array[i];
			}
			// 최소값
			if (min > array[i]) {
				min = array[i];
			}
		}
		System.out.printf("최대값 : %d 최소값 : %d\n", max, min);
		//// 출력문 위치 잘 생각하기

		// 문제3) 문제 3에서 구한 최대값과 최소값이 각각 몇번째 값인지 구하세요.
//		int maxInt =0;
//		int minInt =0;
//		
//		for (int i = 0; i < array.length; i++) {
//			
//			if (max == array[i]) { 
//				maxInt = i;
//			}
//			
//			if(min == array[i]) {
//				minInt = i;
//				
//			}
//		}
//		System.out.printf("최대값 %d은 %d번째, 최소값 %d은 %d번째입니다.\n",max,maxInt+1,min,minInt+1);
//		
		int maxInt = 0;
		int minInt = 0;
		for (int i = 0; i < array.length; i++) {
			// 최대값 >>최대, 최소 각각 if문을 줘야함.
			if (max == array[i]) { // array이가 더 크면 max가 최대값이 아니기떄문에 max를 덮었씀
				maxInt = i;
			}
			// 최소값
			if (min == array[i]) {
				maxInt = i;
			}
		}
		System.out.println(maxInt);

	}

}
