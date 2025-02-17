package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {

	
	Scanner sc= new Scanner(System.in);
	
	public void test1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작석
		//단, 5를 출력하면 반복문 종료
		//1 2 3 4 5 
		
		for(int i = 1; i<=10; i++) {
			
			System.out.print(i + " ");
			
			if(i==5) {break;}
		}
	}
	public void test2() {
		//입력받은 문자열을 모두 누적
		//단 "exit@" 입력시 문자열 누적을 종료하고 결과 출력
		
		int i = 0;
		String str = "";
		
		while(true) {
			
			System.out.print("문자열 입력(exit@ 입력 시 종료) : ");
			String input = sc.nextLine();
			
			//자바에서 문자열(String) 비교는 == 연산자 사용 불가!
			//비교연산자(==)는 보통 기본자료형끼리의 연산에서만 사용
			//String은 기본자료형이 아닌 참조형
			
			//equals() 메서드
			//문자열 1.equals(문자열2)
			//문자열1과 문자열2가 같으면 true / 다르면 false
			
			if(input.equals("exit@")) {
				break;
			}
			
			str += input + "\n";
			
			
		}
		
		System.out.print(str);
		
		
	}
	public void test3() {
		//continue : 다음 반복으로 넘어감
		
		//1 ~ 10 까지 1씩 증가하며 출력
		//단, 3의 배수는 제외하고 출력
		
		for(int i = 1; i <= 10; i++) {
			
			if(i % 3 == 0) {continue;}
			
			System.out.print(i + " ");
		}
		
		
		
	}
	public void test4() {
	//1 ~ 100까지 1씩 증가하며 출력하는 반복문
		//단, 5의 배수는 건너뛰고
		//증가하는 값이 40이 되었을때 반복중지
		
		/*1
		 * 2
		 * 3
		 * 3
		 * 4
		 * 6
		 * 7
		 * 8
		 * 9
		 * 11
		 * ...
		 * 39
		 */
		
		
		for(int i = 1; i <= 100; i++) {
			if(i == 40) {break;
			}
			if(i % 5 == 0) {continue;
			
			
		}	
			
			System.out.println(i);
		
		
	}
	
	
	
	
}
	public void testgame() {
		//[가위바위보 게임]
		//판 수 입력
		//입력받은 판수 만큼 반복
		
		//컴퓨터는 : Math.random() : 0.0 ~ 1.0 사이 난수 생성
		//1~3 사이의 난수 생성
		//1이면 가위, 2이면 바위, 3이면 보 지정.
		//컴퓨터와 플레이어 가위바위보 판별
		//플레이어 승리! 출력 / 패배! / 무승부
		//매판마다 - 스코어 출력
		
		
		System.out.print("몇 판 ? : ");
		int pansu = sc.nextInt();
		
		int sungli = 0;	//승패 기록용 변수
		int musungbu = 0;
		int pebe = 0;
		
		
		
		for(int i = 1; i <= pansu; i++) {
			System.out.println("\n" + i + "번째 게임.");
			System.out.print("가위/바위/보 중에서 골라보자 : ");
			String a = sc.next();
			
			int random = (int)(Math.random() * 3 + 1);
			
			String com = null;
			// null : 아무것도 참조하고 있지 않음.
			
			switch(random) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			}
			
			System.out.printf("컴퓨터는 [%s]를 선택했습니다.\n", com);
			
			if(a.equals(com)) {
				System.out.println("비겼습니다");
				musungbu++;
				
			}else {
				boolean sungli1 = a.equals("가위") && com.equals("보");
				boolean sungli2 = a.equals("바위") && com.equals("가위");
				boolean sungli3 = a.equals("보") && com.equals("바위");
				
				if(sungli1 || sungli2 || sungli3) {
					System.out.println("승리!");
					sungli++;
				}else {
					boolean pebe1 = a.equals("가위") && com.equals("바위");
				boolean pebe2 = a.equals("바위") && com.equals("보");
				boolean pebe3 = a.equals("보") && com.equals("가위");
					System.out.println("패배!");
					pebe++;
				}
				
			}
			
			System.out.printf("스코어 : %d승 %d무 %d패\n", sungli, musungbu, pebe);
			
			
			
			
		}
		
		
		
		
	}
	public void testgametest() {
		
		System.out.print("판 수 :");
		int pan = sc.nextInt();
		
		int m = 0;
		int w = 0;
		int l = 0;
		
		
		for(int i = 1; i <= pan; i++) {
			System.out.print("가위/바위/보 선택 : ");
			String cho = sc.next();
			
			int random = (int)(Math.random() * 3 + 1);
			
			String com = null;
			
			switch(random) {
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보위"; break;
			}
			
			if(cho.equals(com)) {
				System.out.println("무승부");
				m++;
				
			}else {
				boolean w1 = cho.equals("가위") && com.equals("보");
				boolean w2 = cho.equals("바위") && com.equals("가위");
				boolean w3 = cho.equals("보") && com.equals("바위");
				
				if(w1 || w2 || w3) {
					System.out.println("승");
					w++;
				}
				
			 else {
				boolean l1 = cho.equals("가위") && com.equals("바위");
				boolean l2 = cho.equals("바위") && com.equals("보");
				boolean l3 = cho.equals("보") && com.equals("가위");
				System.out.println("패");
				l++;
			}
			
			
			
		}System.out.printf("스코어 : %d승 %d패 %d무\n\n", w, l, m);
		
	}

	}
}