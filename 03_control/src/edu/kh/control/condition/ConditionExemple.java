//기능제공용

package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExemple {

	Scanner sc = new Scanner(System.in); //필드
	
	
	//생성자 영역
	
	//메서드 역역
	public void ex1() {
		
		//if 문
		//조건식이 true 일때만 내부 코드 수행
		
		//입력받은 정수가 양수인지 검사
		//양수라면 "양수입니다. 출력"
		
		System.out.println("정수 입력 : ");
		int in1 = sc.nextInt();
		
		if(in1 > 0) {
			System.out.println("양수입니다.");
		}
		
		if(in1 <= 0) {
			System.out.println("양수가 아니다");
			
			
		}
		
		
	}
	public void ex2() {
		System.out.println("정수 입력 : ");
		int in1 = sc.nextInt();
		
		if(in1 >= 10000) {
			System.out.println("Over+");
		} else { 
			if(in1 <= -10000)
				System.out.println("Over-");
			
		}
		
		if(in1 % 2 != 0) {
			System.out.println("홀수입니다.");
		
		
		} else {//짝수 또는 0 입력 시 수행 됨.
			
			//중첩 if문
			if(in1 == 0) {
				System.out.println("0입니다.");
			} else {
				System.out.println("짝수입니다.");
			}
		}
		
		
		
	}
	public void ex3() {
		
		//if(조건식) - else if (조건식) - esle
		
		//양수, 음수, 0 판별
		
		System.out.println("정수 입력 : ");
		int i1 = sc.nextInt();
		
		if(i1 >= 10000) {
			System.out.println("Over+");
		} else if(i1 <= -10000) {
			System.out.println("Over_");
		}
		  else if(i1 > 0) {
			System.out.println("양수 입니다.");
		} else if(i1 < 0 ) {
			System.out.println("음수 입니다.");
		} else {
			System.out.println("0 입니다.");
		}
		
	}
	public void ex4() {
		//달을 입력받아 해당 달에 맞는 계절 출력
		//1,2,12 겨울 (-15도 이하 : 한파경보 / -12도 이하 : 한파주의보
		//3,4,5 봄
		//6,7,8 여름 (+35도 이상 : 폭염 경보 / *30도 이상 : 폭염주의보
		//9,10,11 가을
		//1~12 사이가 아닐땐 "해당하는 계절이 없다" 출력
		
		System.out.println("몇 월 입니까? : ");
		int month = sc.nextInt();
		
		String season; //아래 조건문 수행 경ㄹ과를 저장할 변수 선언.
		
		if(month ==12 || month >= 1 && month <=2) {
			season = "겨울";
			System.out.println("온도가 어떻게 됩니까? : ");
			int temp = sc.nextInt();
			
			if(temp <= -15) {
				//겨울 한파 경보
				season += "한파 경보";
				//season = season + "한파 경보";
			}else if (temp <= -12) {
				season += "한파 주의보";
			}
			
		}else if(month >= 3 && month <= 5) {
			season = "봄";
		}else if(month >=6 && month <= 8) {
			season = "여름";
			System.out.println("온도가 어떻게 됩니까? : ");
			int temp = sc.nextInt();
			
			if (temp >= 35) {
				season += "폭염 경보";
			}else if(temp >= 30) {
				season += "폭염 주의보";
			}
		}else if(month >= 9 && month <= 11) {
			season = "가을";
		}else {
			season = "해당하는 계절이 없습니다.";
		}
		
		System.out.println(season);
		
		
	}
	public void ex5() {
		/*나이를 입력받아
		 * 13세 이하면 어린이 입니다
		 * 13세 초과 19세 이하면 청소년 입니다
		 * 19세 초과시 성인입ㄴ디ㅏ
		 */
		System.out.println("나이를 입력하시오. : ");
		int i1 = sc.nextInt();
		
		if(i1 <= 13 && i1 >= 0) {
			System.out.println("어린이 입니다.");
		}else if(i1 >= 14 && i1 <= 19) {
			System.out.println("청소년 입니다.");
		}else if(i1 >= 20 && i1 <= 150) {
			System.out.println("성인 입니다.");
		}else {
			System.out.println("올바른 숫자가 아닙니다.");
		}
	}
	public void ex5_1() {
		
		System.out.println("나이를 입력하시오. : ");
		int i1 = sc.nextInt();
		
		String result;
		
		if(i1 <= 13) result = "어린이 입니다";
		else if (i1 <= 19) result = "청소년 입니다";
		else if (i1 >= 20) result = "성인 입니다";
	}
	public void ex6() {
		/* 점수를 입력받아
		 * 90이상 a
		 * 80 b
		 * 70 c
		 * 60 d
		 * 60미만 f
		 * 0점 미만이나 100점 초과시 : "잘못입력하셨습니다" 출력.
		 */
		
		System.out.print("점수를 입력하시오. : ");
		int i1 = sc.nextInt();
		
		if(i1 > 100 || i1 < 0) {
			System.out.println("잘못 입력하셨습니다.");
		}else if(i1 >= 90) {
			System.out.println("점수 입력 : " + i1);
			System.out.println("A");
		}else if(i1 >= 80) {
			System.out.println("점수 입력 : " + i1);
			System.out.println("B");
		}else if(i1 >= 70) {
			System.out.println("점수 입력 : " + i1);
			System.out.println("C");
		}else if(i1 >= 60) {
			System.out.println("점수 입력 : " + i1);
			System.out.println("D");
		}else if(i1 <= 59 && i1 >= 0) {
			System.out.println("점수 입력 : " + i1);
			System.out.println("F");
		}
	}
	public void ex7() {
		//놀이기구 탑승 제한 검사
		//나이 12 이상 키 140 이상 " 탑승가능"
		//나이 12미만 "적정연령이 아닙니다
		//키가 140미만 "적정 키가 아닙니다
		//나이 0세 미만 100세 초과시 "잘못입력하셨습니다
		
		System.out.println("나이를 입력하세요. : ");
		int i1 = sc.nextInt();
		
		System.out.println("키를 입력하세요. : ");
		double i2 = sc.nextDouble();
		
		if(i1 > 100 || i1 < 0) {
			System.out.println("잘못 입력하셨습니다.");
		}else if(i1 >= 12 && i2 >= 140) {
			
					
			System.out.println("나이 입력 : " + i1);
			System.out.println("키 입력 : " + i2);
			System.out.println("탑승 가능");
		}else if(i1 <= 11 && i2 >= 140){
			System.out.println("적정 연령이 아닙니다");
			System.out.println("탑승 불가능");
		}else if(i1 >= 12 && i2 <= 139){
			System.out.println("적정 키가 아닙니다");
			System.out.println("탑승 불가능");
		}else {
			System.out.println("탑승 불가능");
		}
		
	}
	public void ex8() {
		// 놀이기구 탑승 제한 검사 프로그램
		// 조건 - 나이 : 12세 이상
		// - 키 : 140.0cm 이상
		// 나이를 0~100세 사이로 입력하지 않은 경우 : "나이를 잘못 입력 하셨습니다."
		// 키를 0~250.0cm 사이로 입력하지 않은 경우 : "키를 잘못 입력 하셨습니다."
		// -> 입력이 되자 마자 검사를 진행하여 잘못된 경우 프로그램 종료
		// 나이 O , 키 X : "나이는 적절하나, 키가 적절치 않음";
		// 나이 X , 키 O : "키는 적절하나, 나이는 적절치 않음";
		// 나이 X , 키 X : "나이와 키 모두 적절치 않음";
		// 나이 O , 키 O : "탑승 가능"

		// [실행화면]
		// 나이 입력 : 130
		// 나이를 잘못 입력 하셨습니다

		// 나이 입력 : 30
		// 키 입력 : 300
		// 키를 잘못 입력 하셨습니다

		// 나이 입력 : 20
		// 키 입력 : 110
		// 나이는 적절하나, 키가 적절치 않음

		// 나이 입력 : 10
		// 키 입력 : 150
		// 키는 적절하나, 나이가 적절치 않음

		// 나이 입력 : 10
		// 키 입력 : 110
		// 나이와 키 모두 적절치 않음

		// 나이 입력 : 15
		// 키 입력 : 160
		// 탑승 가능!!!
		
		System.out.println("나이를 입력하세요. : ");
		int i1 = sc.nextInt();
		
				String result;
		
		if(i1 > 100 || i1 < 0) {result = "나이를 잘못 입력하셨습니다.";
		}else { System.out.println("키를 입력하세요. : ");
		}
		double i2 = sc.nextDouble();
		
		if(i2 > 300 || i2 < 0) {result = "키를 잘못 입력하셨습니다.";
		} else {if (i1 >= 12 && i2 < 140){ result = "나이는 적절하나 키는 적절치 않음";
		
		}else if(i1 < 12 && i2 >= 140) {result = "키는 적절하나 나이는 적절하지 않음";
		}else if(i1 < 12 || i2 < 140) {
			result = "나이와 키 모두 적절치 않음";
		}else {result = "탑승 가능";
		}
		
		}
	System.out.println(result);
	
	}
	public void ex9() {
		//switch 문
		//여러 case 중 하나를 선택하여 수행하는 조건문
		
		//요일 번호를 입력 (1(월) ~ 7(일)) : 3 입력시
		//수요일
		
		System.out.println("요일 번호 입력 : ");
		int i1 = sc.nextInt();
		
		switch(i1) {
		case 1 : System.out.println("월요일"); break;
		case 2 : System.out.println("화요일"); break;
		case 3 : System.out.println("수요일"); break;
		case 4 : System.out.println("목요일"); break;
		case 5 : System.out.println("금요일"); break;
		case 6 : System.out.println("토요일"); break;
		case 7 : System.out.println("일요일"); break;
		
		default : System.out.println("올바른 입력이 아닙니다.");
		
		}
		
		
		
	}
	public void ex10() {
	 //점수 입력 (0 ~ 100) : 85
		//학점 B
		
		System.out.println("점수 입력(0~100) : ");
		//점수범위 벗어난 경우x
		int score = sc.nextInt();
		
		switch(score / 10) {
		case 10 :
		case 9 : System.out.println("학점 : A"); break;
		case 8 : System.out.println("학점 : B"); break;
		case 7 : System.out.println("학점 : C"); break;
		case 6 : System.out.println("학점 : D"); break;
		default:System.out.println("학점 : F");	
		}
		
	
	}
	public void test1() {
		
	}



}