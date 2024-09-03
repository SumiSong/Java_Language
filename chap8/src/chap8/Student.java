package chap8;

public class Student extends Human{
	int studentNo;
	int grade;
	
	Student(){
		super();
	}
	
	Student(int age, String name, int grade){
		super(age, name); //부모 클래스의 동일한 시그니처를 호출하라 / super는 부모클래스에 있는 속성이나 메서드 사용할 때
		this.grade = grade;
	}

	
	public int getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	public int getGrade() {
		return this.grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void goToSchool() {
		System.out.println(super.getName());
		System.out.println("Go to School");
	}
	
	
}
