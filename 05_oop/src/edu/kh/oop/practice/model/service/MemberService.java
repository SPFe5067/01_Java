package edu.kh.oop.practice.model.service;

import java.util.Scanner;

import edu.kh.oop.practice.model.vo.Member;

public class MemberService {

	//속성(필드)
	private Scanner sc= new Scanner(System.in);
	
	private Member memberInfo = null; // 가입한 회원의 정보를 저장할 변수
	
	private Member loginMember = null; //로그인한 회원의 정보를 저장할 변수
	//기능(생성자, 메서드)
	
	//메뉴 화면 출력 기능
	public void displaymenu() {
		
		int menuNum = 0; //메뉴 선택용 변수
		do {
			System.out.println("==========회원 정보 관리 프로그램==========");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			
			switch(menuNum) {
					//내가 호출한 메서드가 return 하는 값 잘 생각하기.
			case 1 : System.out.println(signUp()); break;
			case 2 : System.out.println(login());break;
			case 3 : System.out.println(selectMember());break;
			case 4 : System.out.println(UpdateMember());break;
			case 0 : System.out.println("프로그램 종료."); break;
			default : System.out.println("메뉴에 없는 번호 입니다.");
			}
			
		} while(menuNum != 0); //menuNum이 0이 되면 반복 종료
	
	}
	
	public String signUp() {
		System.out.println("\n==========회원가입==========");
		
		System.out.print("아이디 : ");
		String memverId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memverPw = sc.next();
		
		System.out.print("비밀번호 확인 : ");
		String memverPw2 = sc.next();
		
		System.out.print("이름 : ");
		String memverName = sc.next();
		
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();
		
		//비밀번호, 비밀번호 확인이 일치하면 회원가입
		//아닐시 실패
		if(memverPw.equals(memverPw2)) {//일치하는 경우
			
			//회원 가입은 새로운 회원 객체가 생성되었다는 것.
			// Member 클래스 이용해서 새로운 객체 생성
			// 매개변수 생성자 이용.
			
			memberInfo = new Member(memverId, memverPw, memverName, memberAge);
			
			return "회원 가입 성공!!!";
			
		}else {//일치하지 않는 경우
			return "회원 가입 실패!! (비밀번호 불일치)";
		}
		
		
		
		
		
		
	}
	
	public String login() {
		//회원가입이 되어있는 사람이 있는지 없는지 검사
		//내가 입력한 아이디와 비밀번호로 가입한 사람의 정보가 있는지 없는지 확인!
		
		System.out.println("\n==========로그인==========");
		//회원가입을 했는지부터 확인
		// == memberInfo가 객체를 참조하고 있는지 확인
		//즉 null인지 아닌지 확인
		
		if(memberInfo == null) {//회원가입을 안한 경우
			//null : 아무것도 참조하고 있지 않음
			return "회원가입부터 진행해주세요.";
			//현제 메서드를 종료하고 해당 메서드를 호출한 쪽으로 되돌아감.
		}
		//회원가입 했다면, 해당 라인으로 도달할 수 있음
		//로그인 기능 수행
		System.out.print("아이디 : ");
		String memverId = sc.next();
		
		System.out.print("비밀번호 : ");
		String memverPw = sc.next();
		
		if(memverId.equals(memberInfo.getMemberId()) && memverPw.equals(memberInfo.getMemverPw())) {
			
			//로그인 한 사람 기억하기.
			// loginMember에 현재 로그인 한 사람의 정보를 기억시키기
			// == loginmember에 memberInfo가 참조하고 있는 객체의 주소 대입
			
			//회원가입 정보를 loginMember에 대힙하여
			//어떤 회원이 로그인했는지를 구분할 수 있게함!
			
			
			return memberInfo.getMemverName() + "님 환영합니다.";
		}else {
			
			return "아이디 또는 비밀번호가 일치하지 않습니다.";
			
		}
			
		
		
		
		
		
	}

	
		//회원 정보 조회 기능
		// 조회하려면
		// 로그인 했는지 안했는지
		// 1. 로그인 했으면 현재로그인한 사람의 정보를  저장하고 있는 객체에서
		//	정보 얻어오기
		//2. 로그인 안했으면 해라
	public String selectMember() {
			System.out.println("\n==========회원 정보 조회==========");
			
			if(loginMember == null) {
				return "로그인 하세요.";
						
			}
			else {
			String str = "이름 : " + loginMember.getMemverName();
			str += "\n아이디 : " + loginMember.getMemberId();
			str += "\n나이 : " + loginMember.getMemberAge();
			
			return str;}
			
			
		
		
		
	
}

	public String UpdateMember() {
		System.out.println("\n==========회원 정보 수정==========");
		
		//로그인 여부 판별
		
		if(loginMember == null) {
			return "로그인 하세요";
					
		}
		System.out.print("수정할 이름 입력 : ");
		String inputName = sc.next();
		
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		if(inputPw.equals(loginMember.getMemverPw())){
			loginMember.setMemverName(inputName);
			loginMember.setMemberAge(inputAge);
			loginMember.setMemverPw(inputPw);
			
			return "변경되었습니다";
		}else {
			return "틀렸습니다";
		}
		
		
	}







}

	
	

	
	
	

	
	

