package com.yedam.java.ch06_04;

public class Car {

	int gas;

	void setGas(int gas) {
		this.gas = gas;
	}

	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스없음");
			return false;
		} 
		System.out.println("가스있음");
		return true;
		}
	

	void run() {
		while (true) {
			if (this.isLeftGas()) {
				System.out.println("달립니다 잔량:" + gas);
				gas--;
			} else {
				System.out.println("멈숩니다. 잔량 : " + gas);
				return;
			}
		}
	}

}
