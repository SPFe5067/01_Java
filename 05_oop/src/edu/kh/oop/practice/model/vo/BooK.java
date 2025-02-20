package edu.kh.oop.practice.model.vo;

public class BooK {

	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	
	
	public BooK() {
		title = "";
		price = 0;
		discountRate = 0;
		author = "";
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author ;
	}
	
	
	
	
	
	
	
	
	
	
	
}
