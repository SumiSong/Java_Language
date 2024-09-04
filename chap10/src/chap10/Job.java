package chap10;

public class Job implements Human {
	int age;
	String name;
	
	public void goToCompany() {
		System.out.println("회사에 간다.");
	}
	
	@Override
	public void eat() {
		System.out.println("회사에서 먹는다");

	}

	@Override
	public void sleep() {
		System.out.println("회사에서 잔다");

	}

}
