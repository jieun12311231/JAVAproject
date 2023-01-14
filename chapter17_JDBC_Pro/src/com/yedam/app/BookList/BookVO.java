package com.yedam.app.BookList;

public class BookVO {

//자동부여되는 도서 번호 
	
	private int number;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
//book_list 테이블 필드
	
	private int ISBN;
	private String bookName;
	private String author;
	private String content;
	private int stock;
	private int nowStock;
	
//getter,setter
	
	public int getNowStock() {
		return nowStock;
	}
	public void setNowStock(int nowStock) {
		this.nowStock = nowStock;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "도서 번호 = " + number + "   ISBN = " + ISBN + "   도서 제목 = " + bookName + "   저자 = " + author
				+ "   내용 = " + content + "   총 재고 = " + stock + "권   현재 보유 재고 = " + nowStock + "권";
	}
	
	

}
