package com.yedam.java.ch0503;

import java.util.Calendar;

public class EnumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today = null;
		
		
		Calendar cal = Calendar.getInstance();  //달력
		int week = cal.get(Calendar.DAY_OF_WEEK); //현재 요일
		
		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUSDAY;
			break;
		case 4:
			today = Week.WEDENSDAY;
			break;
		case 5:
			today = Week.THUTSDAY;
			break;
		case 6:
			today = Week.FRYDAY;
			break;
		case 7:
			today = Week.SATYSDAY;
			break;
			
		}	
		System.out.println("오늘 요일 : "+today);
		if(today ==Week.SUNDAY) {
			System.out.println("오늘은 스터디를 갑니다.");
		}else {
			System.out.println("오늘은...");
		}
	}

}
