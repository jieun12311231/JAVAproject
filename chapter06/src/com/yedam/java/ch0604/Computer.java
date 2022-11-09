package com.yedam.java.ch0604;

public class Computer {
	int sum1(int[] values) {  //int[] values >> 몇개의 값이 들어올지 모르기떄문에 타입만 선언해주면됨.
		int sum =0;
		for(int i =0 ;i<values.length;i++) {
			sum += values[i];
		}
		return sum;
	}
	
	//직접적으로 크기를 주지않음>> for문을 통해서 크기를 줌.
	
	
	int sum2(int...values) {  //...을통해 값이 몇개든 받을수있게함  >>값만 넣어주면 알아서 배열로 만들어줌
		int sum = 0;
		for(int i = 0;i<values.length;i++) {
			sum+= values[i];
		}
		return sum;
	}
}
