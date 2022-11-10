package com.yedam.java.ch221110;

import java.util.Scanner;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner생성
		Scanner sc = new Scanner(System.in);

		// 학생수 입력 받아서 배열
		System.out.print("학생의 수 >");
		int count = Integer.parseInt(sc.nextLine());
		Student[] sch = new Student[count];

		// 배열의 크기만큼 반복문 재생
		for (int i = 0; i < sch.length; i++) {
			
			//sch[]배열안에 회원정보를 담을 새로운 배열 생성  
			Student stud = new Student();

			System.out.print("학생의 이름 > ");
			String name = sc.nextLine();
			stud.setsName(name);

			System.out.print("학번 > ");
			String number = sc.nextLine();
			stud.setsNo(number);

			System.out.print("국어 성적 >");
			int korn = Integer.parseInt(sc.nextLine());
			stud.setKor(korn);

			System.out.print("수학 성적 >");
			int mathn = Integer.parseInt(sc.nextLine());
			stud.setMath(mathn);

			System.out.print("영어 성적 >");
			int engn = Integer.parseInt(sc.nextLine());
			stud.setEng(engn);

			sch[i] = stud;

		}
		//getInfo를 통해 데이터를 출력해주는 for문 
//		for (int i = 0; i < sch.length; i++) {
//			sch[i].getInfo();
//		}
		
		//getter을 직접 사용해서 정보 불러오는 방법 
		for (int i = 0; i < sch.length; i++) {
			System.out.println("학생의 이름 > "+sch[i].getsName());
			System.out.println("학생의 번호 > "+sch[i].getsNo());
			System.out.println("국어 성적 > "+sch[i].getKor());
			System.out.println("수학 성적 > "+sch[i].getMath());
			System.out.println("영어 성적 > "+sch[i].getEng());
		}
	}

}
