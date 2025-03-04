package edu.kh.pactory.dto;

import java.util.Objects;
import java.util.Set;

public class Pactory {

	private String name;
	private int price;
	private String color;
	private int age;
	private String make;
	private Set<String> material;
	
	public Pactory() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(age, color, make, material, name, price);
	}




	@Override
	public String toString() {
		return "이름 : " + name + " / 가격 : " + price + " / 색상 : " + color + " / 사용가능연령 : " + age + " / 제조년월일 : " + make
				+ " / 재료 : " + material + "";
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pactory other = (Pactory) obj;
		return age == other.age && Objects.equals(color, other.color) && Objects.equals(make, other.make)
				&& Objects.equals(material, other.material) && Objects.equals(name, other.name) && price == other.price;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public int getAge() {
		return age;
	}




	public void setAge(int age) {
		this.age = age;
	}




	public String getMake() {
		return make;
	}




	public void setMake(String make) {
		this.make = make;
	}








	public Set<String> getMaterial() {
		return material;
	}




	public void setMaterial(Set<String> material) {
		this.material = material;
	}




	public Pactory(String name, int age, int price, String color,  String make, Set<String> material) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.make = make;
		this.material = material;
	}
	
	
	
	

}
