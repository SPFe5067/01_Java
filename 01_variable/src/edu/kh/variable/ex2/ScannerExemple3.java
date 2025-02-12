package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExemple3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//문자열(String) 입력
		//문자열을 3번 입력받아 한줄로 출력하기
		
		//ex)
		//입력 1 : 안녕
		//입력 2 : 환영한다
		//입력 3 : 어서와라
		// 안녕 환영한다 어서와라
		
		//sc.next()		: 다음 입력된 한 단어를 읽어옴
		//				: 공백(스페이스바, 탭 등) 만나면 입력 중단
		//sc.nextLine() : 다음 입력된 한 줄을 읽어옴
		// 				: 공백과 함께 입력된 모든 내용을 입력받음
		
		System.out.print("안녕 을 입력하시오. : ");
		String i1 = sc.next();
		
		System.out.print("환영한다 를 입력하시오. : ");
		String i2 = sc.next();
		
		System.out.print("어서와라 를 입력하시오. : ");
		String i3 = sc.next();
		
		System.out.printf("%s %s %s",i1, i2, i3);
	}
}
