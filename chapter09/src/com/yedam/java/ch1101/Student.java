package com.yedam.java.ch1101;

public class Student {

	public String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		if (studentNum.equals(studentNum)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}

}
