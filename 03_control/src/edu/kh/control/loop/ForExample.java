//기능제공용
package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

	Scanner sc = new Scanner(System.in);
	
	public void st1() {
		for(int  a = 1;  a <= 10;  a++ ) {
			System.out.println(a);
		}
	}public void st2() {
		//영어 알파벳 A 부터 Z까지 한줄로 출력
		for(int i = 'A'; i <= 'Z' ; i++) {
			System.out.print((char)i);
		}
		
		System.out.println("\n===========================");
		
		for(char i = 'a'; i <= 'z' ; i++) {
			System.out.print(i);
		}
			
	}public void st3() {
		//1부터 입력받은 수 까지 1씩 증가하며 출력
		
		System.out.print("수를 입력하시오. : ");
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			System.out.println(i);
		}
		
		
		
	}public void st4() {
		
		int sum = 0;
		
		
		
		for(int i = 1; i <= 5; i++) {
			System.out.print("수를 입력하세요 : ");
			int q = sc.nextInt();
			
			sum = sum + q;
			
		}System.out.println("합계 : " + sum);
		
	}public void st5() {
		//조건문과 반복문 복합.
		//1~20까지 1씩 증가하며 출력
		//단,입력받은 수의 배수는 양쪽에 ()표시
		//[실행화면]
		//괄호를 표시할 배수 : 3
		//1 2 (3) 4 5 (6)...20
		
		System.out.print("입력 : ");
		int a = sc.nextInt();
				
		for(int i = 1; i <= 20; i++) {
			if(i%a ==0) {
				System.out.print("(" + i + ")" + " ");
			}else {
				System.out.print(i + " ");
			}
			
			
				
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}public void st6() {
		//구구단 출력 2~9단 사이중 하나를 입력받기
		//해당 단을 출력
		//단 입력받은 수가 2~9가 아닐시 "잘못" 출력
		
		System.out.print("단 입력 : ");
		int dan = sc.nextInt();
		
		if(dan > 1 && dan < 10) {
			for(int i = 1; i <= 9; i++) {
				System.out.printf("%d X %d = %d\n", dan, i , (dan * i));
		}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		
		
	}public void st7() {
		//숫자 세기 count
		
		//1~20까지 1씩 증가하면서
		//입력받은 수의 배수의 총 개수 출력
		//입력받은 수의 배수의 합계 출력
		
		//예시 배수입력 : 3
		//3 6 9 12 15 18 : 6개
		//3의 배수 합계 : 63
		
		System.out.print("배수 입력 : ");
		int a = sc.nextInt();
		
		int count = 0;
		
		int sum = 0;
		
		String result = "";
		
		
		for(int i = 1; i <=20; i++) {
			if(i % a == 0) {
				result += i + " ";
				count++;
				sum += i;
			}
		}System.out.println(result + " : " + count);
		System.out.println(a + "의 배수 합계 : " + sum);
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
	}

