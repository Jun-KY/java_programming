package com.lgcns.test05;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public Book() {
		bookName = "";
		bookPrice = 0;
		bookDiscountRate = 0.0;
	}
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;		
	}
	public String getBookName() {
		return bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		double finalPrice = bookPrice * (100-bookDiscountRate)/100.0;
		return finalPrice;
	}
	@Override
	public String toString() {
		return "" + bookName + "\t " + bookPrice + "¿ø\t\t " + bookDiscountRate
				+ "%";
	}
	
	
}
