package chap5;
import chap5.Car;
import chap5.Bus;
import chap5.Truck;



public class Student {
	// 기본 생성자는 사용자가 정의하지 않았을 경우 시스템이 객체 생성시에 자동 생성
	// 기본 생성자 : 클래스명() {}
	//		1. 리턴타입이 없다.
	//		2. 사용자가 정의하지 않아도 시스템 자동으로 생성해 줌.
	//		3. 사용자가 정의한 생성자가 존재할 경우 반드시 기본 생성자를 앞에 선언해 줘야 한다.
	// 생성자는 객체를 메모리에 할당하는 역할
	// 객체명 변수명 = new 객체명();
	
	 
	// 함수 사용법
	//		리턴타입이 없을 때 : 함수명();
	//		리턴타입이 있을 때 : 자료형 변수명 = 함수명();
	
	
	static int serialNo;
	int studentNo;
	String studentName;
	int grade;
	private char gender;
	String rider;
	
	static private int testNo;
	
	
	// 기본 생성자
	Student() {
		
	}
	
	Student getStudent() {
		return this;
	}
	
	
	
	// 사용자 정의 생성자
	// 사용자 정의 생성자를 사용하려면 무조건 위에 빈 껍데기를 만들어야 함.
	// 입력받은 값으로 초기화
	Student(int g, char gn) {
		this.grade = g;
		this.gender = gn;
	}
	
	
	
	
	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getGender() {
		// char gender; 그러므로 이걸 가져오지 못함
		return this.gender; // this 를 사용하게 되면 클래스인 Student 에서 gender 를 찾게 된다.
	}
	
	public String getStudentInfo() {
		return this.studentName + ":" + this.gender + ":" + this.grade;
	}
	
	public String[] getStudentInfo2() {
		return null;
	}
	
	
	public String getRider() {
		return this.rider;
	}
	
	public void setRider(String rider) {
		this.rider = rider; 
	}
	
	static public int getSeriallNO() {
		return serialNo; // static으로 선언했기 때문에
	}
	
//	static public int getTestNO() {
//		return testNO;
//	}
	
// 맴버 변수나 매서드들의 Default : Public
}
