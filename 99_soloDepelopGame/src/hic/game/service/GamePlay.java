package hic.game.service;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import hic.game.date.User;

public class GamePlay {

	public GamePlay() {}
	private List<User> UserList = new LinkedList<>();
	Scanner sc = new Scanner(System.in);
	
	public void DisplayMenu() {
		
		int menuNum = 0;
		do {
			System.out.println("1. 시작");
			System.out.println("2. 로그인");
			System.out.println("3. 회원가입");
			System.out.println("4. 설정");
			System.out.println("0. 종료");
			
			System.out.print("번호 선택 : ");
		try {
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum){
			case 1 : break;
			case 2 : break;
			case 3 : System.out.println(Registration());; break;
			case 4 : break;
			case 0 : System.out.println("종료합니다."); break;
			}
			
		}catch(InputMismatchException e) {
			
		}
			
		}while(menuNum != 0);
	
	}
	
	
	public String Registration() {
		System.out.println("=========회원가입=======");
		System.out.println("ID : ");
		String id = sc.next();
		System.out.println("Password : ");
		String password = sc.next();
		System.out.println("Gender (M/F): ");
		char gender = sc.next().charAt(0);
		System.out.println("Age : ");
		int age = sc.nextInt();
	
		if(UserList.add(new User(id,password,gender,age))) {
			return "회원가입 성공";
		}return "회원가입 실패";
		
	}
	

}
