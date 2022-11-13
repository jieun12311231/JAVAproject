package com.yedam.java.ch06_05;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singleton sgt1 = Singleton.getInstance();
		Singleton sgt2 = Singleton.getInstance();
		
		if(sgt1 ==sgt2) {
			System.out.println("1번과 2번은 같은 객체입니다.");
		}else {
			System.out.println("1번솨 2번은 다른 객체입니다.");
		}
		
		
		
		
		
		
		
	}

}
