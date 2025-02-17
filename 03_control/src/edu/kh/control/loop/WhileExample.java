package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {

	
	Scanner sc = new Scanner(System.in);
	/*
	 * while문
	 * 
	 * -별도의 초기식, 증감식이 존재하지 않고
	 * 반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 * **확실히 얼마만큼 반복후에 끝날지는 모르지만
	 * 언젠가 반복 조건이 falese가 되는 경우 반복을 종료함.
	 */
	
	public void ex1() {
		int i=9;
		
		while(i != 0) {
			//i 는 0 이 아니면 무한반복, 0이면 멈춤
			System.out.println("========메뉴 선택========");
			
			System.out.println("1 . 제육볶음");
			System.out.println("2 . 돈까스");
			System.out.println("3 . 라면");
			System.out.println("0. 종료");
			
			System.out.print("메뉴 선택 >>");
			i = sc.nextInt();
			
			switch(i) {
			case 1 : System.out.println("제육볶음 : 9000원"); break;
			case 2 : System.out.println("돈까스 : 8000원"); break;
			case 3 : System.out.println("라면 : 4500원"); break;
			case 0 : System.out.println("종료"); break;
			default : System.out.println("잘못 입력하셨습니다.");
			}
			
			
		}
		
		
		
	}
	public void ex2() {
		//입력되는 모든 정수의  합 구하기.
		//단, 0이 입력되면 반복 종료 후 결과 출력
		
		int i = 0;
		int sum = 0;
		
		do {
			System.out.print("수를 입력하시오.(종료는 0번) : ");
			i = sc.nextInt();
			sum += i;
			
		}while(i != 0);
		
		System.out.print("합계 : " + sum);
		
		
	}
	public void ex3() {
		
	}
	
	
}
