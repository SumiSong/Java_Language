package chap5;

public class UnivStudent extends Student {

	public UnivStudent() {
		//this.name = "홍길동";
	}

	public UnivStudent(int g, char gn) {
		super(g, gn); //super()는 부모클래스의 생성자를 호출 ---> super는 부모꺼 사용할 때 | this는 내꺼
		//super.grade --> 부모의 속성을 사용할 때 super. 사용

	}
	
	public UnivStudent(String name) {
		this.name = name;
	}
	
	public String name;
	
	public String getRide() {
		return "승용차를 탑니다";
	}
	
	public String getName() { 
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

}
