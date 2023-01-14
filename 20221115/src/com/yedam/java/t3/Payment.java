package com.yedam.java.t3;

public interface Payment {
	 public static final double ONLINE_PAYMENT_RATIO = 0.05;
	 public static final double OFFLINE_PAYMENT_PATIO = 0.03;
	 
	 public abstract int online(int price);
	 public abstract int offline(int price);
	 public abstract void showInfo();

}
