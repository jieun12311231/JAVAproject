package com.yedam.java.ch01;

public class Homework_1109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//주어진 배열을 이용하여 다음 내용을 구현하세요.
				int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		System.out.println("====1번 문제====");
		//문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
				//for문을 돌려서 arr1배열 인덱스를 통해서 위치를 찾고,
				//if 문으로 60을 만나면 출력되도록
				for(int i=0;i<arr1.length;i++) {
//					System.out.println(arr1[i]);
					if(arr1[i] == 60) {
						System.out.println(i);
					}
				}

		System.out.println("====2번 문제====");
		//문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
				for(int i = 0;i<arr1.length;i++) {
					if(arr1[i]!=3) {
						System.out.println(i);
					}
				}

		System.out.println("====3번 문제====");
		//문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
  		//   입력) 인덱스: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
				arr1[3] = 1000;
				for(int i = 0;i<arr1.length;i++) {
					System.out.println(arr1[i]);
				}
		System.out.println("====4번 문제====");
		//문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
			int max = arr1[0];
			int min = arr1[0];
			
			for(int i=0;i<arr1.length;i++) {
				if( max < arr1[i]) {
					max = arr1[i];
				}
				if( min > arr1[i]) {
					min = arr1[i];
				}
			}
			System.out.println(max);
			System.out.println(min);
		System.out.println("====5번 문제====");
		//문제5. 별도의 배열을 선언하여 양의 정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		 int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		 for(int i = 0;i<arr2.length;i++) {
			 if(arr2[i]%3 ==0) {
				 System.out.println(arr2[i]);
			 }
		 }
		
}

}
