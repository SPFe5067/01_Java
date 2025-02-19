package edu.kh.oop.abstraction.model.vo;

//model - 프로그램 로직과 관련되어 있는 데이터를 저장하는 용도, + 비즈니스 로직
//VO (Value Objext) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지



//MVC패턴 : M = Mode		- 데이터와 비즈니스 로직을 처리하는 부분(DB, 서비스, 객체)
//			V = View		- 사용자에게 보여지는 화면을 담당하는 부분(UI - HTML,JSP..)
//			C = Controller  - 사용자의 요청을 받고, 모델과 뷰를 연결하는 역할(응답)

//			애플리케이션의 역팔을 세가지로 분리하는 설계 패턴.


public class People {//국민 클래스

	//클래스란? 객체의 특성(속성과 기능)을 정의한 것.
	// == 객체를 만둘기 위한 설계도
	
	//속성 == 값 == data
	//값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화
	//이름, 성별, 주민번호 등
	//필드 == 필드변수 == 멤버변수
	
	//캡슐화
	// - 데이터(속성)와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터의 직접적인 접근을 제한하는 것이 원칙이다.
	// -> 직접접근 못하기 때문에
	//    클래스 내부에 간접 접근 방법을 제공하는
	//	  기능(메서드) 작성해둔다.
	// -> getter. / setter.
	
	/* 데이터 직접 접근 제안
	 * 
	 * public 공공의 -> private 개인적인
	 */
	
	//접근제한자 + 자료형 + 변수명;
	private String name;
	private char gender;
	private  String pNum;
	private String address;
	private String phone;
	private int age;
	
	//기능 == 행동/동작 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다.");
	}
	public void vote() {
		System.out.println("투표를 합니다.");
	}
	// 캡슐화에서 사용할 간접 접근 기능 (getter/setter)
	// [접근제한자] 반환형 메서드명() {}
	
	//name 변수의 값을 호출한 쪽으로
	//돌려 보내주는 간접 접근 기능 중 getter.
	
	public String getName() {
		return name;                                                
		//return : 반환, 되돌려주다
		//return : 현제 메서드를 종료하고 호출한 쪽으로 되돌아감.
		//return 값/변수 : 현제 메서드를 종료하고 값/변수를 가지고 호출한 쪽으로 되돌아감.
		
	}
	
	//getter() : 반환형이 무조건 있음
			   //getter는 필드에 작성된 변수값을 호출한 쪽으로 되돌려주는 것.
			   //변수는 자료형이 있을 것.
			   //그 변수를 되돌려준다면 당연히 반환형도 존재할 것.
	
	//name 변수에 값을 세팅하는 간접 접근 기능 중 setter
								//매개변수
	public void setName(String name) {

		// ** this : 현제 객체
		this.name = name;
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String getPNum() {
		return pNum;
	}
	public void setPNum(String pNum) {
		this.pNum = pNum;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getage() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
}
