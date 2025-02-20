package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.BooK;

public class BookService {

	public void test1() {
		BooK bK = new BooK();
		bK.setTitle(null);
		bK.setPrice(0);
		bK.setDiscountRate(0);
		bK.setAuthor(null);
		
		System.out.println(bK);
		
		BooK bK2 = new BooK();
		bK2.setTitle("자바의 정석");
		bK2.setPrice(30000);
		bK2.setDiscountRate(0.2);
		bK2.setAuthor("남궁성");
		
		System.out.println(bK2);
		System.out.println("======================================");
		
		BooK bK3 = new BooK();
		bK3.setTitle("c언어");
		bK3.setPrice(30000);
		bK3.setDiscountRate(0.1);
		bK3.setAuthor("홍길동");
		
		System.out.println("수정된 결과 확인");
		System.out.println(bK3);
		
		System.out.println("======================================");
		
		double i = (double)bK2.getPrice();
		double o = bK2.getDiscountRate();
		int p = (int)(i - (i * o));
		
		double q = (double)bK3.getPrice();
		double w = bK3.getDiscountRate();
		int e = (int)(q - (q * w));
		
		System.out.println(i - (i * o));
		
		System.out.println("도서명 = " + (bK2.getTitle()));
		System.out.println("할인된 가격 = " + e);
		System.out.println("도서명 = " + (bK3.getTitle()));
		System.out.println("할인된 가격 = " + p);
						   		
		
	}

	
	
	}
	

