package com.yedam.Borrow;
//borrow_book 테이블 필드 
public class BorrowVO {

	private String borforDate;
	private int borTel;
	private String bookName;
	private String bortoDate;
	private int borStatus;

//getter, setter
	
	public String getBorforDate() {
		return borforDate;
	}

	public void setBorforDate(String borforDate) {
		this.borforDate = borforDate;
	}

	public int getBorTel() {
		return borTel;
	}

	public void setBorTel(int borTel) {
		this.borTel = borTel;
	}

	public String getbookName() {
		return bookName;
	}

	public void setBookInfomation(String bookName) {
		this.bookName = bookName;
	}

	public String getBortoDate() {
		return bortoDate;
	}

	public void setBortoDate(String bortoDate) {
		this.bortoDate = bortoDate;
	}

	public int getBorStatus() {
		return borStatus;
	}

	public void setBorStatus(int borStatus) {
		this.borStatus = borStatus;
	}

}
