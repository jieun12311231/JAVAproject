package com.yedam.java.ch0605;

public class Student {
	//getter setter을 이용하는 예제 
	//필드
	//학생의 이름
	private String name;
	//학교이름
	private String scname;
	//학번
	private int numder;
	//학년
	private int grade;
	//국어, 영어, 수학 성적 (따로 적어줘야함)
	private int kr;
	private int eng;
	private int math;
	
	//생성자
	//생성자를 통해서 모든 데이터를 입력
//	public Student(String name, String scname, int numder,int grade,int kr,int eng,int math) {
//		this.name = name;
//		this.scname = scname;
//		this.numder = numder;
//		this.grade = grade;
//		this.kr = kr;
//		this.eng = eng;
//		this.math = math;
//		
//	}
	//this ?? >>  생성자를 통해 데이터를 초기화 this를 통해 정해진 필드를 사용.
	//매개변수를 통해 가지고 온 데이터를 필드값에 넣기위해 사용하는거//데이터를 대입연산자를 통해 변수에 담아주는것
	//

//getter
	public String getName() {
		return name;
	}
	
	public String getScname() {
		return scname;
	}
	
	public int getNumder() {
		return numder;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getKr() {
		return kr;
	}
	
	public int getEng() {
		return eng;
	}
	
	public int getMath() {
		return math;
	}
	
//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setScname(String scname) {
		this.scname = scname;
	}
	
	public void setNumder(int numder) {
		this.numder = numder;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void setKr(int kr) {
		this.kr = kr;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
//	

	//메소드
	//getInfo() 학생의 내용을 출력할 수 있는 기능
	

		void getInfo() {
//		System.out.println("학생의 이름은 "+name+" 입니다.");
//		System.out.println("학생의 학교는 "+scname+" 입니다.");
		System.out.println("학생의 학번은 "+numder+" 입니다.");
		System.out.println("학생의 학년은 "+grade+" 입니다.");
		System.out.println("학생의 국어성적은 "+kr+" 입니다.");
		System.out.println("학생의 영어성적은 "+eng+" 입니다.");
		System.out.println("학생의 수학성적은 "+math+" 입니다.");
	}



	









}
