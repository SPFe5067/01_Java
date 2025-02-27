package hic.game.date;

public class User {

	private String id;
	private String password;
	private char gender;
	private int age;
	
	
	public User(String id, String password, char gender, int age) {
		super();
		this.id = id;
		this.password = password;
		this.gender = gender;
		this.age = age;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public User() {}

}
