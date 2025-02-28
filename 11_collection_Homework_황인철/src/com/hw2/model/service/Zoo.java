package com.hw2.model.service;

import java.util.ArrayList;
import java.util.List;

import com.hw2.model.dto.Animal;
import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;

public class Zoo {

	Tiger tiger = new Tiger();
	Monkey monkey = new Monkey();
	
	private List<Animal> animal = new ArrayList<>();
	
	
	public Zoo() {}
	
	
	public void addAnimal(Animal animal) {
	// animal.add(animal);이 작동하지 않은 이유:
	// animal이라는 리스트명과 Animal 자료형의 매개변수 animal의 이름이 같아서
	// 둘다 매개변수 애니멀로 인식함!
	// -> 수정 방법 : 둘 중 하나의 변수명을 변경한다. ex) List<Animal> animals
	 
	 addAnimal(animal);
	}
	
	
	public void showAnimals() {
		System.out.println(tiger.getName());
	}
	
	
	public void displayMenu() {
		
	}

}
