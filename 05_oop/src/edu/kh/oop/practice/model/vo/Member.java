package edu.kh.oop.practice.model.vo;

public class Member {

	
	// 속성 + 기능
	
	
	
	// 필드(==속성)
	private String memverId;
	private String memverPw;
	private String memverName;
	private int memberAge;
	

	
		  
		  
 
	//생성자(==기능)
	//생성자 규칙 : 반환형이 없고, 클래스명과 이름이 같아야 한다.
	public Member() {}
	//기본생성자가 없으면 컴파일러가 자동으로 생성해주지만,
	//매개변수생성자가 하나라도 있다면 기본생성자 자동생성 안해줌.
	
	//매개변수 생성자(모든 필드 초기화
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		super();
		//오버로딩 적용중(1. 이름이 같은 상태 2. 매개변수의 개수, 타입, 순서중 하나라도 달라야함.)
		this.memverId = memberId;
		this.memverPw = memberPw;
		this.memverName = memberName;
		this.memberAge = memberAge;
	}
	
	
	
	//메서드(==기능)
	//getter / setter
	public String getMemberId() {
		return memverId;
	}

	public String getMemverId() {
		return memverId;
	}

	public void setMemverId(String memverId) {
		this.memverId = memverId;
	}

	public String getMemverPw() {
		return memverPw;
	}

	public void setMemverPw(String memverPw) {
		this.memverPw = memverPw;
	}

	public String getMemverName() {
		return memverName;
	}

	public void setMemverName(String memverName) {
		this.memverName = memverName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
