package edu.kh.book;

public class Book {

	//도서 번호, 도서 제목, 저자, 가격, 출판사
	private int booknum;
	private String bookname;
	private String maker;
	private int price;
	private String mader;
	
	
	
	
	
	
	
	public Book(int booknum, String bookname, String maker, int price, String mader) {
		super();
		this.booknum = booknum;
		this.bookname = bookname;
		this.maker = maker;
		this.price = price;
		this.mader = mader;
	}

	@Override
	public String toString() {
		return "Book [booknum=" + booknum + ", bookname=" + bookname + ", maker=" + maker + ", price=" + price
				+ ", mader=" + mader + "]";
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public int getBooknum() {
		return booknum;
	}

	public void setBooknum(int booknum) {
		this.booknum = booknum;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getMader() {
		return mader;
	}

	public void setMader(String mader) {
		this.mader = mader;
	}
	

}
