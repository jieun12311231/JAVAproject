package com.yedam.java.ch1302.lifofifo;

import java.util.*;

public class StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Coin> coinBox = new Stack<Coin>();

		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10)); // 데이터 들어가는 순서 잘 보기

		while (!coinBox.isEmpty()) { // 코인 박스가 비워질때 까지 반복문을 통해서 데이터 하나씩 끄집어내기
			// isEmpty값이 없다는것을 확인 비었으면 true >> !이 붙었으니까 비었으면 false가 돼서 종료
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
//한번꺼내오면 coinBox에서 사라지는 것입
// 다시 넣어주지 않는 이상 박스에는 없음.
		
	}

}
