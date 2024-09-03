package chap7.java7.chunjae;

public class Person {
	int age;
	String name;
	
	Person(){}
	
	Person(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void eat() {
		System.out.println("먹기");
	}
	
	public void sleep() {
		System.out.println("잠자기");
	}

}

class Student extends Person {
    public String schoolNo;
    Student() {
        super();
    }
    Student(int age, String name, String schoolNo){
        super(age, name);  // 부모 클래스의 매개변수가 있는 생성자 호출
        this.schoolNo = schoolNo;  
    }
    public void goToSchool() {
        System.out.println("학교가기");
    }
    
}

class Job extends Person {
    public String jobNo;
    Job() {
        super();
    }
    Job(int age, String name, String jobNo) {
        super(age, name);  // 부모 클래스의 매개변수가 있는 생성자 호출
        this.jobNo = jobNo; 
    }
    public void goToCompany() {
        System.out.println("회사가기");
    }
    
    
}

  


//public class Main {
//    public static void main(String[] args) {
//        // Student 객체 생성
//        Student student = new Student(18, "Alice", "S1234");
//        student.eat();         
//        student.sleep();       
//        student.goToSchool();  
//        System.out.println("학생 이름: " + student.name + ", 학번: " + student.schoolNo);
//        
//        // Job 객체 생성
//        Job job = new Job(30, "Bob", "J5678");
//        job.eat();          
//        job.sleep();        
//        job.goToCompany();   
//        System.out.println("직업 이름: " + job.name + ", 직업 번호: " + job.jobNo);
//    }
//}

