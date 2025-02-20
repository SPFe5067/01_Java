package edu.kh.oop.abstraction.model.vo;

public class User {
	// 속성
	// 아이디, 패스워드, 닉네임, 프로필(나이, 성별 등) == 추상화 진행 완료
	// 데이터 직접접근 불가 원칙 -> 필드는 기본적으로 모두 private(캡슐화 진행)
	private String userId;
	private String userPw;
	private String userName;
	private int userAge;
	private char userGender;
	
	
	//기본 생성자 ( -> 매개변수 없는 생성자 )
	public User() {
		// 기능 
		System.out.println("기본 생성자로 User 객체 생성");
		
		//필드 초기화
		userId = "user123";
		userPw = "pass123";
		userName = "가나다";
		userAge = 23;
		userGender = '남';
		
	}
	//매개변수 생성자
	//변수 : 매개변수, Overloading, this
	
	//** 매개변수 : 생성자나 메서드 호출 시 () 안에 작성되어
	// 				전달되어지는 값을 저장하고 있는 변수
	// -> 전달받은 값을 저장하고있는 매개체 역할의 변수
	public User(String userId, String userPw, String userName) {
		System.out.println("매개변수 생성자를 이용하여 User 객체 생성");
		
		//필드 초기화
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		// 필드     = 매개변수
		
		//this  참조변수
		// - 객체가 자기 자신을 참조할 수 있도록 하는 변수
		// 필드명과 매개변수명이 같은 경우, 이를 구분하기 위해서 사용함.
	}
	// 필드를 전부 초기화 하는 목적의 매개변수 생성자
	public User(String userId, String userPw, String userName, int userAge, char userGender) {
		
		//this() 생성자
		//같은 클래스의 다른 생성자를 호출할 때 사용
		this(userId, userPw, userName);
		
		//this.userId = userId;
		//this.userPw = userPw;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}
	//자바는 기복적으로 필드명, 생성자명, 메서드명, 변수명의 중복을 허용하지 않음.
	//예시)
	//private String userId;
	//public User() {}
	/*  **오버로딩**
	 *  - 클래스 내에 동일한 이름의 메서드(생성자도 포함)를
	 *  여러개 작성하는 기법
	 *  
	 *  [오버로딩 조건]
	 *  1. 메서드의 이름이 동일
	 *  2. 매개변수의 개수, 타입(자료형), 순서 중 1개라도 달라야 한다.
	 *  
	 */
	
	public User(String userId) {} //매개변수의 갯수가 다르기에 오버로딩 가능.
	public User(int userAge){} // 매개변수의 갯수는 같지만 타입이 다르기에 오버로딩 가능.
	public User(String userId, int userAge) {}
	//매개변수의 갯수가 동일한 코드는 위에 존재하나 내부의 타입이 다르기에 오버로딩 가능.
	public User(int userAge, String userId) {}
	//매개변수의 갯수와 타입은 동일하나 순서가 다르기에 오버로딩 가능.
	//public User(int userAge, String userName) {}
	//바로 위 코드와 변수명만 다를뿐 갯수와 타입, 타입순서가 같기에 오버로딩 불가능
	//변수명은 다르더라도 오버로딩이 불가능하다.
	
	
	//toString()메서드 : object 최상위 클래스 이미 만들어져있는 메서드
	//객체가 문자열로 변환 될 때 호출되는 메서드
	// 보통 객체 코드값을 출력하는 용도로 오버라이딩 해서 사용함.
	
	// 기능 (생성자 + 메서드)
	public String getUserId() {
		return userId;
	}
	
	//@Override : 메서드가 부모 클래스의 메서드를 "정확히" 재정의(오버라이딩)검사.
	//1. 만약에 오타가 있거나, 부모 클래스에 없는 메서드를 잘못 작성했을 경우 컴파일 오류를 일으킴.
	//2. 이 메서드가 부모 클래스를 재정의 했다는것을 한눈에 알 수 있음.
	
	@Override //@(어노테이션) 컴파일러 인식용 주석.
	public String toString() {
		return "User [userId=" + userId + ", userPw=" + userPw + ", userName=" + userName + ", userAge=" + userAge
				+ ", userGender=" + userGender + "]";
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserpW(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public char getUserGender() {
		return userGender;
	}
	public void setUserGender(char userGender) {
		this.userGender = userGender;
	}
	
/*
 * 생성자(constructor)
 * 
 *  - new 연산자를 통해서 객체를 생성할 때
 *  생성된 객체의 필드값 초기화 + 지정된 기능을 수행하는 역할
 *  
 *  -생성자 작성 규칙
 *  1. 생성자의 이름은 반드시 클래스명과 동일해야 한다.
 *  2. 반환형이 존재하지 않는다.
 *  
 *  -생성자 종료
 *  1. 기본생성자
 *  2. 매개변수 생성자
 *  
 *  
 */
	
	
	
	
	
	
	
	
}
