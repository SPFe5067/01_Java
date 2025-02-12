//기능제공용
package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {

		public void practice1() {
			
	//모든 사람이 사탕을 골고루 나눠가지려고 한다.
	//인원 수와 사탕 개수를 키보드로 입력 받고
	//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.		
			
	// 인원 수 : 29 
	// 사탕개수 : 100
			
	// 1인당 사탕 개수 3개 
	// 남는 사탕 개수 13개
			
	Scanner sc = new Scanner(System.in);
	
	
	
	System.out.println("인원 수 를 입력하시오. :");
	int i1 = sc.nextInt();
	
	System.out.println("사탕 수 를 입력하시오. :");
	int i2 = sc.nextInt();
	
	String str = "1인당 사탕 개수 : ";
	String str1 = "남는 사탕 개수 : ";
	
	int va = (i2 / i1);
	int qa = (i2 % i1);
	
	System.out.println("인원 수 : " + i1 + "\n사탕개수 : " + i2);
	
	System.out.println();
	
	System.out.println(str + va);
	System.out.println(str1 + qa);
	
		}
		
		public void practice2() {
			
		/*
		 * 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.

			ex.
			이름 : 홍길동
			학년(정수만) : 3
			반(정수만) : 4
			번호(정수만) : 15
			성별(남학생/여학생) : 남학생
			성적(소수점 아래 둘째 자리까지) : 85.75
			3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
		 */
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("이름을 입력하시오. : ");
			String str3 = sc.next();
			
			System.out.println("학년을 입력하시오. : ");
			int h = sc.nextInt();
			
			System.out.println("반을 입력하시오. : ");
			int c = sc.nextInt();
			
			System.out.println("번호를 입력하시오. : ");
			int n = sc.nextInt();
			
			System.out.println("성별을 입력하시오. : ");
			String mf = sc.next();
			
			System.out.println("성적을 입력하시오. : ");
			double t = sc.nextDouble();
			
			System.out.println(h + "학년 " + c + "반 " + n + "번 " + str3 + " " + mf + "의 " + "성적은 " + t + "이다.");
					
			System.out.printf("%d %d %d %s %s %.2f", h, c, n, str3, mf, t);
					
			
		}

		public void practice3(){
			
		/*
		 * 	국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
			세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.

			[실행화면]
			국어 : 60
			영어 : 80
			수학 : 40
			합계 : 180
			평균 : 60.0
		 */
			Scanner sc = new Scanner(System.in);
			
			System.out.println("국어 성적 : ");
			int g = sc.nextInt();
			System.out.println("영어 성적 : ");
			int e = sc.nextInt();
			System.out.println("수학 성적 : ");
			int m = sc.nextInt();
			
			System.out.println("국어 : " + g);
			System.out.println("영어 : " + e);
			System.out.println("수학 : " + m);
			System.out.println("합계 : " + (g+e+m));
			System.out.println("평균 : " + ((g+e+m)/3));
			
			
					
			
			
			
		}
		
		public void practice4() {
			/*
			 * 마트에서 고객에게 할인 혜택을 제공하려고 한다
				물건의 총 가격과 회원 여부를 입력받아, 
				회원이라면 10% 할인을 적용하고, 그렇지 않다면 5% 할인을 적용한 최종 가격을 출력해라

				메서드 : public void practice1() {}

				[실행화면]
				가격을 입력 하세요 : 10000
				멤버십 있으세요? (있으면 true / 없으면 false 입력) : true
				할인을 포함한 최종금액 : 9000.0원


				가격을 입력 하세요 : 10000
				멤버십 있으세요? (있으면 true / 없으면 false 입력) : false
				할인을 포함한 최종금액 : 9500.0원
			 */
			
			Scanner sc = new Scanner(System.in);
			System.out.println("가격을 입력하세요 : ");
			int q = sc.nextInt();
			System.out.println("멤버십이 있으세요? (있으면 true / 없으면 false 입력) : " );
			boolean t = true;
			boolean f = !t;
			String w = sc.next();
			System.out.println("할인을 포함한 최종금액 : " + (q * 0.9));
			
			System.out.println();
			System.out.println();
			
			System.out.println("가격을 입력하세요 : ");
			int e = sc.nextInt();
			System.out.println("멤버십이 있으세요? (있으면 true / 없으면 false 입력) : " );
			String r = sc.next();
			System.out.println("할인을 포함한 최종금액 : " + (e * 0.95));
			
			
			
			
		}
}
