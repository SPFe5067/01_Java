package edu.kh.poly.ex1.model.dto;

public class Fish extends Animal{


	
	@Override
	public void eat() {
		System.out.println("수중에서 먹는다.");
		
	}

	@Override
	public void breath() {
		System.out.println("아가미로 호흡한다.");
		
	}

	@Override
	public void move() {
		System.out.println("지느러미로 해엄친다.");
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Fish : " + super.toString();
	}
	
	public Fish() {}

	
	
}
