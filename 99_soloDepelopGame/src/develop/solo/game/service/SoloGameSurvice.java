package develop.solo.game.service;

import java.util.Random;
import java.util.Scanner;

import develop.solo.game.vo.Sologame;

public class SoloGameSurvice {
Scanner sc = new Scanner(System.in);
Sologame ga = new Sologame();




	public void game1() {
		System.out.println("Wellcome to Game!");
		System.out.print("이름을 입력해주세요.");
		String n = sc.next();
		ga.setName(n);
		
		
		
		
		
		int pde = 100;
		int ajc = 150;
		int iljin = 400;
		
		
		
		
		
		
		
		
		
		
		
		
		String a = "전사";
		String b = "궁수";
		String c = "도적";
		String d = "마법사";
		
		String pas = "";
		
		for(int i = 1; i <=1; i++ ) {
			System.out.println(ga.getName() + "님 직업을 선택해 주세요");
			System.out.println("=============================");
			System.out.printf("%s   %s   %s   %s\n",a,b,c,d);
			System.out.println("=============================");
			String j = sc.next();
			ga.setJop(j);
			if(a.equals(j) || b.equals(j) || c.equals(j) || d.equals(j)) {
				
				
			}else {
				System.out.println("다시 선택하세요.");
				i--;
				
			}
			System.out.println("즐거운 여행 되시길...");
			
			System.out.println();
			
			if(j.equals(a)) {
				ga.setHp(100);
				ga.setMp(10);
				ga.setSpeed(15);
				ga.setLuck(8);
				ga.setLevel(1);
				pas += "강력";
				ga.setPesive(pas);
				System.out.println("특성 : 강력 획득");
			}
			if(j.equals(b)) {
				ga.setHp(70);
				ga.setMp(30);
				ga.setSpeed(25);
				ga.setLuck(10);
				ga.setLevel(1);
				pas += "사격";
				ga.setPesive(pas);
				System.out.println("특성 : 사격 획득");
			}
			if(j.equals(c)) {
				ga.setHp(80);
				ga.setMp(30);
				ga.setSpeed(20);
				ga.setLuck(20);
				ga.setLevel(1);
				pas += "육감";
				ga.setPesive(pas);
				System.out.println("특성 : 육감 획득");
			}
			if(j.equals(d)) {
				ga.setHp(50);
				ga.setMp(100);
				ga.setSpeed(10);
				ga.setLuck(5);
				ga.setLevel(1);
				pas += "마나감응";
				ga.setPesive(pas);
				System.out.println("특성 : 마나감응 획득");
			}
			System.out.println();
			System.out.println("정보");
			System.out.println("직업 : " + ga.getJop());
			System.out.println("Level : " + ga.getLevel());
			System.out.println("Hp : " + ga.getHp());
			System.out.println("Mp : " + ga.getMp());
			System.out.println("Louk : " + ga.getLuck());
			System.out.println("Speed : " + ga.getSpeed());
			System.out.println("보유 특성 : " + ga.getPesive());
			
			
			int attack = (ga.getHp() + ga.getMp()) / ga.getSpeed() * ga.getLuck();
			
			int difence = 5;
			
			
			
			
			
			for(int stage = 1; stage < 15; stage++ ) {
				int random = (int)(Math.random()*3 +1);
			
			switch(random) {
			case 0 : System.out.println("사망 - 의?문?사"); break;
			
			
			case 1 : System.out.println(" - 행운의 낙엽 - ");
					 System.out.println("걸어가는 당신에게 행운의 낙엽이 보였습니다.");
					 System.out.println();
					 System.out.println("당신은 행운의 낙엽을 줍겠습니까?");
					 System.out.println("     줍는다   /   아니다");
					 String choice = sc.next();
					 if(choice.equals("줍는다")) {
						 System.out.println();
						 System.out.println("행운의 낙엽이당! 기쁘당!");
						 pas += ", 좋은 기분";
						 System.out.println();
						 System.out.println("특성 : 좋은 기분 을 획득하셨습니다");
					 } break;
					 
					 
					 
			case 2 : System.out.println("    적이 나타났다!");
					 System.out.println("싸운다     /     도망간다");
					 String choic = sc.next();
					 if(choic.equals("싸운다")) {
						for(int pde1 = pde; pde1 >= 0; pde1--) {
							System.out.println("공격 / 도망");
							String toattack = sc.next();
							if(toattack.equals("공격")) {
							pde1 -= attack;
							pde1++;
							
							System.out.println("가한 피해 : " + attack);
							System.out.println("받은 피해 : " + (10 - difence));
							System.out.println("편돌쿤의 HP = " + pde1);
							int hhp = (ga.getHp() - (10 - difence));
							System.out.println(ga.getName() + "의 HP" + hhp);
							System.out.println();
							}
							if(pde1 == 0) {
								System.out.println();
								System.out.println("승리!");
							}
						}
					 }
			case 3 : System.out.println();
			case 4 : System.out.println();
			case 5 : System.out.println();
			}
			
			}
			System.out.println();
			System.out.println("모든 여행이 종료되었습니다.");
			
}
	}
	}