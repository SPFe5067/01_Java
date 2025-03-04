package edu.kh.pactory.service;

import java.awt.RenderingHints.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.pactory.dto.Pactory;





public class Service {
	
	Scanner sc = new Scanner(System.in);
	
	private List<Pactory> damagochi = new ArrayList<Pactory>();
	Map<Integer,String> map = new HashMap<Integer, String>();
	Set<String> i = new HashSet<>();
	Pactory p = new Pactory();
	
	
	
	public Service() {
		map.put(1, "면직물");
		map.put(2, "플라스틱");
		map.put(3, "유리");
		map.put(4, "고무");
	
		
		damagochi.add(new Pactory("마미롱레그",8,36000,"분홍색","19950805",material(1, 4) ));
		damagochi.add(new Pactory("허기워기",5,36000,"파란색","19940315",material(1, 2)));
		damagochi.add(new Pactory("키시미시",5,36000,"분홍색","19940505",material(1, 2)));
		damagochi.add(new Pactory("캣냅",8,36000,"보라색","19960128",material(1, 2)));
		damagochi.add(new Pactory("파피",12,36000,"빨간색","19931225",material(1, 2, 4)));
	
	}
	
	

	public void service1() {
		try {
			int menuNum = 0;
			
			
			do {
				System.out.println("1. 전체 장난감 조회하기"); 
				System.out.println("2. 새로운 장난감 만들기");
				System.out.println("3. 장난감 삭제하기");
				System.out.println("4. 장난감 제조일 순으로 조회하기");
				System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
				System.out.println("6. 재료 추가");
				System.out.println("7. 재료 제거");
				System.out.println("0. 종료");
				
				System.out.print("선택 : ");
				menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 1 :showdamagochilist();break;
				case 2 :maketoy(); break;
				case 3 :exittoy(); break;
				case 4 :break;
				case 5 :break;
				case 6 :newnewmaterial(); break;
				case 7 :exitmaterial(); break;
				case 0 : System.out.println("종료되었습니다.");break;
				default : System.out.println("메뉴에 있는 번호가 아닙니다.");break;
				}
				
				
				
			}while(menuNum != 0);
			
			
			
		}catch(Exception e){
			System.out.println("오류");
			e.printStackTrace();
		}
		
		
		
	}
	public void showdamagochilist () {
		for(Pactory temp : damagochi) {
			System.out.println(temp);
		}
	}
	
	
	
	
	public void maketoy() {
		System.out.print("장난감 이름 : ");
		String newname = sc.next();
		
		for(int i = 0; i < damagochi.size(); i++ ) {
			if(newname.equals(damagochi.get(i).getName())) {
				
				System.out.println("이미 존재하는 장난감 입니다.");
				return;
			}
		}
		
		System.out.print("사용가능연령 : ");
		int newage = sc.nextInt();
		
		System.out.print("가격 : ");
		int newprice = sc.nextInt();
	
		System.out.print("색상 : ");
		String newcolor = sc.next();
		
		System.out.print("제조일(YYYYMMDD 형식으로 입력) : ");
		String newmake = sc.next();
		
		
		for(int i = 0; i < 1; i++) {
			System.out.print("재료를 입력하세요(종료하려면 q를 입력하세요) : ");
			String newmaterial = sc.next();
			
			
			
			
			
			if(newmaterial.equals("q")) {
				
				damagochi.add(new Pactory(newname, newage,newprice, newcolor,newmake,material()));
				System.out.println("새로운 장난감이 추가되었습니다.");
				break;
			}i--;
			for (Integer key : map.keySet()) {
			  
			    if (newmaterial.equals(map.get(key))) {
			       
			        System.out.println("이미 추가한 재료입니다.");
			       
			       
			    }map.put(key, newmaterial);
			    damagochi.add(new Pactory(newname, newage,newprice, newcolor,newmake, material()));
			}
		}
			
		}
		
		
	
		
		
		
	

	public void newnewmaterial() {
		System.out.println("======현제 등록된 재료======");
		for(int i = 1; i < map.size()+1; i++) {
		System.out.println(i + " : " + map.get(i));
		}
		System.out.println("============================");
		System.out.print("추가할 재료를 입력하세요. : ");
		String newmaterial2 = sc.next();
		
		
		//이미 존재하는 재료를 입력했을 때
		for (Integer key : map.keySet()) {
			  //맵에 저장되어있는 key의 수만큼 반복한다
		    if (newmaterial2.equals(map.get(key))) {
		       //입력값과 맵에 저장되어있는 키의 String값이 같다면
		        System.out.println("이미 존재하는 재료입니다.");
		        //이미 존재하는 재료입니다 출력
		        return;
		    }
		    //일치하지 않는다면 쨋든 저장됨.
		    //앞쪽에 맞지 않는 값이 있으면 쨋든 저장됨.(저장되면 안됨)
		    //그러므로 for문 밖에 만들어야함.
		    //이유는 저장되야할 시기는 for문이 끝난 이후여야 하기 때문임.
		}map.put(map.size() + 1, newmaterial2);
	    //아니라면 맵에 저장된 가장 큰 key +1 의 자리에 입력값 저장
	    
	
	
	}private Set<String> material(int...j) {
	    Set<String> materialSet = new HashSet<>();

	   
	   String material = map.get(j);
	    
	   for(int key : j) {
		   String material1 = map.get(key);
		 
		   if (material1 != null) {
			      
		        materialSet.add(material1);
		    } else {
		      
		        materialSet.add("없음");
		    }
	   }

	    return materialSet;
	}
	public void exitmaterial() {
		System.out.println("제거할 재료를 입력하세요. : ");
		String exit = sc.next();
		
		for (Integer key : map.keySet()) {
			  //맵에 저장되어있는 key의 수만큼 반복한다
		    if (exit.equals(map.get(key))) {
		       //입력값과 맵에 저장되어있는 키의 String값이 같다면
		    	
		        System.out.println("재료 " + exit + "가 성공적으로 제거 되었습니다.");
		       //성공적으로 제거되었습니다 출력
		        
		        
		        return;
		    }
		   
		}System.out.println("해당 이름의 재료가 존제하지 않습니다.");
	  
		
		
		
	}
	public void exittoy() {
		System.out.println("삭제할 장난감을 입력하세요. : ");
		String exitto = sc.next();
		
		//자료형 (정수) 를 반복한다. (:) 해당 객체 수 만큼.
		for(Pactory na : damagochi) {
			exitto.equals()
			
			
		}
		
		
	}
	
	
	
}