package edu.kh.poly.ex1.model.dto;

public abstract class Animal {
	//추상클래스
	//1. 미완성 메서드를 보유하고 있는 클래스
	//2. 객체로 만들 수 없는 클래스
	// -> 여러 타입들을 관리하기 위한 상위 타입의 목적
		private String type;
		private String eatType;
		
		
		public Animal(){}
		
		public String getType() {
			return type;
		}



		public void setType(String type) {
			this.type = type;
		}



		public String getEatType() {
			return eatType;
		}



		public void setEatType(String eatType) {
			this.eatType = eatType;
		}



		@Override
		public String toString() {
			return "Animal [type=" + type + ", eatType=" + eatType + "]";
		}



		public Animal(String type, String eatType) {
			super();
			this.type = type;
			this.eatType = eatType;
		}
		
		//동물 공통기능 추출(추상화)
		//미완성 상태로 만들어 상속받은 지식이 해당메서드를
		//자식 본인에게 맞는 정의를 하도록 오버라이딩 강제화 시킴.
		//추상메서드로 작성
		
		//먹다
		public abstract void eat();
		
		//숨쉬다
		public abstract void breath();
		
		//움직이다
		public abstract void move();
		
		//추상클래스는 일반 멤버(필드, 메서드도 작성가능)
		public void ex() {
			System.out.println("평범");

		}
		
		
		
}
