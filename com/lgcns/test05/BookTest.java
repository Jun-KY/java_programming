package com.lgcns.test05;

import java.util.Scanner;

public class BookTest {

	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		Book[] bookArray = new Book [3];
//		Book list = new Book("",0,0.0);
		bookArray[0] = new Book("SQL Plus", 0, 5);
		bookArray[1] = new Book("Java 2.0", 0, 3);
		bookArray[2] = new Book("JSP Servlet", 0, 6);
		for(int i = 0; i<3; i++){
			System.out.print("å '"+bookArray[i].getBookName()+"'�� ������ �Է��ϼ���: ");
			bookArray[i].setBookPrice(sc.nextInt());
		}
		System.out.println();
		for(int i = 0; i<3; i++) {
			System.out.println(bookArray[i]);
		}
		System.out.println();
		int PriceSum=0;
		for(int i = 0; i<3; i++) {
			PriceSum += bookArray[i].getBookPrice();
		}	
		System.out.println("å ������ ��: " + PriceSum+"��");
		double finalPrice = 0.0;
		for(int i = 0; i<3; i++) {
			 finalPrice += bookArray[i].getBookDiscountRate();
		}
		System.out.println("���� �� å ������ ��: "+ finalPrice+"��");
	}
}
