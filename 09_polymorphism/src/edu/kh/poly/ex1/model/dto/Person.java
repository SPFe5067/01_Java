package edu.kh.poly.ex1.model.dto;

public class Person extends Animal {

	private String name;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}


/*
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
*/


	@Override
	public void eat() {
		System.out.println("도구를 사용하여 먹는다.");
		
	}

	@Override
	public void breath() {
	System.out.println("코와 입으로 호흡한다.");
		
	}

	@Override
	public void move() {
		System.out.println("두 발로 걷는다.");
		
	}

	

	
}
