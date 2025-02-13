package edu.kh.control.practice;

import java.util.Scanner;

public class Practice1 {

	Scanner sc = new Scanner(System.in);
	
	
	public void test1() {
		
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
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int i = sc.nextInt();
		
		if(i < 0) {
			System.out.println("양수만 입력해주세요.");
		}else if(i%2 == 0) {
			System.out.println("짝수입니다.");
		}else {
			System.out.println("홀수입니다.");
		}
		
		
	}
	public void test2() {
		/*
		 * 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
	합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
	(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

	합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
	불합격인 경우에는 “불합격입니다.”를 출력하세요.
		 */
		
		System.out.println("국어 점수 :");
		int a = sc.nextInt();
		System.out.println("수학 점수 :");
		int b = sc.nextInt();
		System.out.println("영어 점수 :");
		int c = sc.nextInt();
		
		String result;
		
		
		if(a < 40 && b < 40 && c < 40 && (a+b+c)/3 < 60) {
			System.out.println("불합격 입니다.");
		}else {
			System.out.println("국어 : " + a);
			System.out.println("수학 : " + b);
			System.out.println("영어 : " + c);
			System.out.println("합계 : " + (a+b+c));
			System.out.println("평균 : " + ((a+b+c)/3));
			System.out.println("축하합니다, 합격입니다!");
			
		}
		
	}
	public void test3() {
		/*
	* 1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
	잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)

	[실행화면 1]
	1~12 사이의 정수 입력 : 8
	8월은 31일까지 있습니다.
	[실행화면 2]
	1~12 사이의 정수 입력 : 99
	99월은 잘못 입력된 달입니다.
		 */
		
		System.out.println("1~12 사이의 정수 입력 : ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : System.out.println("1월은 31일까지 있습니다."); break;
		case 2 : System.out.println("2월은 28일까지 있습니다.");break;
		case 3 : System.out.println("3월은 31일까지 있습니다.");break;
		case 4 : System.out.println("4월은 30일까지 있습니다.");break;
		case 5 : System.out.println("5월은 31일까지 있습니다.");break;
		case 6 : System.out.println("6월은 30일까지 있습니다.");break;
		case 7 : System.out.println("7월은 31일까지 있습니다.");break;
		case 8 : System.out.println("8월은 31일까지 있습니다.");break;
		case 9 : System.out.println("9월은 30일까지 있습니다.");break;
		case 10 : System.out.println("10월은 31일까지 있습니다.");break;
		case 11: System.out.println("11월은 30일까지 있습니다.");break;
		case 12: System.out.println("12월은 31일까지 있습니다.");break;
		default : System.out.println(a + "월은 잘못 입력된 달입니다.");
		}
		
	}
	public void test4() {
	/*
	 * 키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
	저체중/정상체중/과체중/비만을 출력하세요.

	BMI = 몸무게 / (키(m) * 키(m))
	BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
	BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
	BMI가 30이상일 경우 고도 비만

	[실행 화면]
	키(m)를 입력해 주세요 : 1.65
	몸무게(kg)를 입력해 주세요 : 58.4
	BMI 지수 : 21.45087235996327
	정상체중
	 */
		
	System.out.print("키(m)을 입력해 주세요 : ");
	double a = sc.nextDouble();
	System.out.print("몸무게(kg)을 입력해 주세요 : ");
	double b = sc.nextDouble();
	
	double q = b / (a * a);
	
	System.out.println("BMI 지수 : " + q);
	
	if(q >=30 ) {
	System.out.println("고도비만");
	
	}else if(q >= 25) {
	System.out.println("비만");
		
	}else if(q >= 23) {
	System.out.println("과체중");
		
	}else if(q >= 18.5) {
	System.out.println("정상체중");
		
	}else {
	System.out.println("저체중");
		
	}
	
	}
	public void test5() {
		
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
		
		System.out.println("중간 고사 점수 : ");
		int a = sc.nextInt();
		System.out.println("기말 고사 점수 : ");
		int b = sc.nextInt();
		System.out.println("과제 점수 : ");
		int c = sc.nextInt();
		System.out.println("출석 횟수 : ");
		int d = sc.nextInt();
		
		double a1 = (a * 0.2);	// a *= 0.2; // a *= (int) a * 0.2
		double b1 = (b * 0.3);	// b *= 0.3; // b *= (int) b * 0.3
		double c1 = (c * 0.3);	// c *= 0.3; // c *= (int) c * 0.3
		
		double o = (a1 + b1 + c1 + d);
		
		String result = "Pass";
		


		
		
		
		
		if(d < (20 * 0.7)) {
			System.out.println("============결과=============");
			System.out.println("Fail [출석횟수 부족 (" + d + "/20)]");

		}else if(o < 70) {
			System.out.println("Fail [점수 미달]");
			System.out.println("============결과=============");
			System.out.printf("중간고사 점수(20) : %.1f \n" ,  a1);
			System.out.printf("기말고사 점수(30) : %.1f \n" ,  b1);
			System.out.printf("과제 점수 (30) : %.1f \n" ,  c1);
			System.out.println("출석 점수 (20) : " + d);
			System.out.println("총점 : " + o);
			
		}else if(o > 70 || d > (20 * 0.7)){
			System.out.println(result);
			System.out.println("============결과=============");
			System.out.printf("중간고사 점수(20) : %.1f \n" ,  a1);
			System.out.printf("기말고사 점수(30) : %.1f \n" ,  b1);
			System.out.printf("과제 점수 (30) : %.1f \n" ,  c1);
			System.out.println("출석 점수 (20) : " + d);
			System.out.println("총점 : " + o);
		}	
		
		
		
		
		
		
		
	}
	public void test6() {
	
		System.out.println("1~12 사이의 정수 입력 : ");
		int a = sc.nextInt();
		
		String result = "월은 잘못 입력된 달입니다.";
		
				
		switch(a) {
		case 1 : result = "1월은 31일까지 있습니다."; break;
		case 2 : result ="2월은 28일까지 있습니다.";break;
		case 3 : result ="3월은 31일까지 있습니다.";break;
		case 4 : result ="4월은 30일까지 있습니다.";break;
		case 5 : result ="5월은 31일까지 있습니다.";break;
		case 6 : result ="6월은 30일까지 있습니다.";break;
		case 7 : result ="7월은 31일까지 있습니다.";break;
		case 8 : result ="8월은 31일까지 있습니다.";break;
		case 9 : result ="9월은 30일까지 있습니다.";break;
		case 10 : result ="10월은 31일까지 있습니다.";break;
		case 11 : result ="11월은 30일까지 있습니다.";break;
		case 12 : result ="12월은 31일까지 있습니다.";break;
		default : System.out.println(a + result);
		
		
	}	System.out.println(result);
	}
}
