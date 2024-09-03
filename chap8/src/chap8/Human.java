package chap8;

public class Human {
	int age;
	String name;
	float weight;
	
	
	Human(){}
	
	Human(int age){
		this.age = age;
	}
	
	Human(int age, String name){
		this(age);
		this.name = name;
	}
	
	Human(int age, String name, float weight){
		this(age, name);
		this.name = name;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getWeight() {
		return weight;
	}
	
	public void setWeight(float weight) { 
		this.weight = weight;
	}
	
	public void print() {
		System.out.println("age : " + age + "name : " + name);
	}
	
	public void eat() {
		System.out.println("먹기");
	}
	
	public void sleep() {
		System.out.println("잠자기");
	}
	
	
	
}
