package edu.kh.oop.cls.model.service;

import edu.kh.oop.abstraction.model.vo.Studant;
import edu.kh.oop.abstraction.model.vo.User;

public class ClsService /*extends Studant*/{
		   //  (자식)  상속받기 (부모)
	public void ex1() {
		//클래스 접근제한자 확인하기
		Studant sT =new Studant();
		//public class인 Studant는 import 가능(어디서든 접근가능)
		
//		TestingVo tV = new TestingVo();
		// (default) class인 TestingVo는 import 불가능(다른 패키지라서 불가능)
		
		//필드 접근제한자 확인하기
		
		System.out.println(sT.v1);
		// -> 전체에서 직접 접근 가능한 public인 v1만 에러발생 X
		//System.out.println(v2);
		//System.out.println(sT.v3);
		//System.out.println(sT.v4);
		
		//상속 관계에서 직접 접근 가능 범위 테스트
		// * 상속받으면 부모의 것도 마치 내것처럼 사용.
		//System.out.println(v1);
		//System.out.println(v2);
		//Studant 클래스를 ClsService가 상속 받았으므로
		//Student의 protected 변수인 v2는 직접 접근 가능.
		//System.out.println(v3); // 다른 패키지 X
		//System.out.println(v4); // 해당클래스 내부가 아닌 다른클래스 X
		
		
	}
	public void ex2() {
		// static 필드 확인 예제
		
		//학생 객체 2개
		Studant std1 = new Studant();
		Studant std2 = new Studant();
	
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
	//schoolName에 노란줄이 뜨는 이유(경고) => 제대로 작성 안되서
		
		//***static 이 붙은 변수(필드)는 '클래스명.변수명'으로 사용해야 함.
		System.out.println(Studant.schoolName);
		
		Studant.schoolName = "KH정보교육원";
		
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		System.out.println(Studant.schoolName);
		/*
		 * sttic
		 * 
		 * 공유 메모리 영역(또는 정적 메모리 영역)이라고 함
		 * 
		 * ->프로그램 시작 시 static이 붙은 코드들이 모두
		 * static 영역에 생성되고,
		 * 프로그램이 종료될 때까지 사라지지 않음(정적)
		 * 그리고, static영역에 생성된 변수는 어디서든지 공유 가능(공유)
		 * 
		 * 
		 */
		
		
	}
	public void ex3() {
		//생성자 확인 테스트
		
		//User 기본 생성자를 이용해서 u1 객체 생성
		User u1 = new User();
		
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		User u2 = new User();
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		// 문제점 : u1이 참조하고 있는 user 객체와
		//			u2가 참조하고 있는 user 객체의 필드값이 모두 동일함
		//			왜? 같은 기본생성자로 user 객체를 생성했기 때문에.
		
		System.out.println("=====================================================");
		//해결방법 1 : setter를 이용해서 새로운 값 재대입
		u2.setUserId("user456");
		u2.setUserpW("pass456");
		u2.setUserName("라마바");
		u2.setUserAge(27);
		u2.setUserGender('여');
		
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		System.out.println("=====================================================");	
		//해결방법 2 : 매개변수 생성자를 이용해서
		//객체가 생성될 때 부터 다른 값으로 필드를 초기화
		User u3 = new User("user789","pass789","마바사");
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		
		
		
	}
	public void ex4() {
		//매개변수 생성자 예제
		User u1 = new User();
		User u2 = new User("user456","pass456","마바사");
		User u3 = new User("user000","pass000","타파하",89,'남');
		//매개변수 5개짜리 생성자(전부 초기화)
		
		System.out.printf("u1 : %s / %s / %s /%d /%c\n",u1.getUserId(),u1.getUserPw(),u1.getUserName(),u1.getUserAge(),u1.getUserGender());
		System.out.printf("u2 : %s / %s / %s /%d /%c\n",u2.getUserId(),u2.getUserPw(),u2.getUserName(),u2.getUserAge(),u2.getUserGender());
		System.out.printf("u3 : %s / %s / %s /%d /%c\n",u3.getUserId(),u3.getUserPw(),u3.getUserName(),u3.getUserAge(),u3.getUserGender());
		
		System.out.println(u1);
		System.out.println(u1.toString());
		
		
	}
}
