package edu.kh.control.loop;

import java.util.Scanner;

public class ForExampleTest {
	Scanner sc = new Scanner(System.in);
	
	public void hell() {
		System.out.print("잔액 : ");
		int tex = sc.nextInt();
		System.out.print("평일 하루 식비 :  ");
		int a = sc.nextInt();
		System.out.print("주말 하루 식비 :  ");
		int b = sc.nextInt();
		
		int c = ((a*20) + (b*8));
		int q = (860000 + (a*20)+(b*8));
		
		
		System.out.println("고정 지출비 : 월세 : 380.000원");
		System.out.println("고정 지출비 : 전기 : 100.000원");
		System.out.println("고정 지출비 : 통신 : 100.000원");
		System.out.println("고정 지출비 : 교통 :  80.000원");
		System.out.println("고정 지출비 : 흡연 : 200.000원");
		System.out.println("변동 지출비 : 식비 : " + c + "원");
		System.out.println("총 월 지출비 : " + (860000 + (a*20)+(b*8)));
		
		System.out.print("매 월 수입은 얼마 입니까?");
		int d = sc.nextInt();
		
		System.out.println("다음 달 잔액 : " + (tex - q + d));
		
		int p = (tex - q + d);
		
		for(int i = 1 ; i <=6 ; i++) {
			System.out.println(i + " " + "잔액 : " + ((p - q) + d));
			int o = ((p - q) + d);
			
		}
		
		
	}

	
	public void test1() {
		
		
		//구구단 모두 출력하기
		
		
		
		
		
		for(int dan = 2; dan <= 9; dan++) {
			
			for(int num = 1; num <= 9; num++) {
				System.out.printf("%d X %d = %2d  ",dan ,  num , (dan * num));
			}System.out.println();
		}
		
	}
	public void test2() {
		//
		
		
		
		
	}
	
}
