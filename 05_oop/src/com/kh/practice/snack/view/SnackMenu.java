package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {

	Scanner sc = new Scanner(System.in);
	
	
	SnackController scr = new SnackController();
	
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		System.out.println("종류 : ");
		String a = sc.next();
		
		System.out.println("이름 : ");
		String b = sc.next();
		
		System.out.println("맛 : ");
		String c = sc.next();
		
		System.out.println("개수 : ");
		int d = sc.nextInt();
		
		System.out.println("가격 : ");
		int e = sc.nextInt();
		
		scr.saveData(a,b,c,d,e);
		
		
		
		
		
		
		System.out.println("저장 완료 되었습니다.");
		
		System.out.println("저장한 정보를 확인하시겠습니까? (y/n)");
		String f = sc.next();
		
		if(f.equals("y")) {
			System.out.printf("\n%s(%s - %s) %d개 %d원",a,b,c,d,e);
		}else {
			
		}
		
	}
}
