package edu.kh.control.practice;

import java.util.Scanner;

public class Test1 {

	
	Scanner sc = new Scanner(System.in);
	
	public void tests1(){
	
	/*
	 * 메소드 명 : public void practice1(){}
	키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
	짝수가 아니면 “홀수입니다.“를 출력하세요.
	양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

	[실행 화면 1]
	숫자를 한 개 입력하세요 : 8
	짝수입니다.

	[실행 화면 2]
	숫자를 한 개 입력하세요 : 17
	홀수입니다.
	
	[실행 화면 3]
	숫자를 한 개 입력하세요 : -3
	양수만 입력해주세요.
*/
		
		System.out.println("숫자를 입력해주세요");
		int a = sc.nextInt();
		String result;
		
		if(a < 0) {
			result = "양수만 입력해 주세요";
		}else if(a%2 != 0) {
			result = "홀수 입니다.";
		}else {
			result = "양수 입니다.";
		}
		
		
		
		
		System.out.print(result);
		
		
		
	}
	public void tests2() {
		/*
		 * 중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
		 * 
		평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		70점 이상일 경우 Pass,
		 *[실행 화면 1]
		중간 고사 점수 : 80
		기말 고사 점수 : 30
		과제 점수 : 60
		출석 횟수 : 18
		================= 결과 =================
		중간 고사 점수(20) : 16.0
		기말 고사 점수(30) : 9.0
		과제 점수 (30) : 18.0
		출석 점수 (20) : 18.0
		총점 : 61.0
		Fail [점수 미달]
		 */
		
		System.out.print("중간 고사 점수 : ");
		double a = sc.nextDouble();
		System.out.print("기말 고사 점수 : ");
		double b = sc.nextDouble();
		System.out.print("과제 점수 : ");
		double c = sc.nextDouble();
		System.out.print("출석 횟수 : ");
		int d = sc.nextInt();
		
		
		
		 a *= 0.2;
		 b *= 0.3;
		 c *= 0.3;
		
		
		if(d < (20 * 0.7)) {
			System.out.println("==============결과============");
			System.out.println("출석 횟수 부족 [( " + d + "/20)] 입니다.");
		}else if((a + b + c + d) < 70) {
			System.out.println("==============결과============");
			System.out.printf("중간 고사 점수 (20) : %.1f \n" , a);
			System.out.printf("기말 고사 점수 (30) : %.1f \n" , b);
			System.out.printf("과제 점수 (30) : %.1f \n" , c);
			System.out.println("출석 점수 (20) : " + d);
			System.out.println("총점 : " + (a + b + c + d));
			System.out.println("Fail [점수미달]");
			
			
		}else {
			System.out.println("==============결과============");
			System.out.printf("중간 고사 점수 (20) : %.1f \n" , a);
			System.out.printf("기말 고사 점수 (30) : %.1f \n" , b);
			System.out.printf("과제 점수 (30) : %.1f \n" , c);
			System.out.println("출석 점수 (20) : " + d);
			System.out.println("총점 : " + (a + b + c + d));
			System.out.println("축하합니다. 합격입니다.");
		}
		
		
		
		
		
		
		
	}
	public void tests3() {
		System.out.println("1~3 사이의 숫자를 입력 : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : System.out.println(4); break;
		case 2 : System.out.println(5); break;
		case 3 : System.out.println(6); break;
		default : System.out.println("오류");
		}
	}
	
}
