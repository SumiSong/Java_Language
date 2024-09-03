package chap8;

public class SuperSample {

	public static void main(String[] args) {
		//1. Human 객체 생성
		Human h = new Human();
		h.setAge(20);
		h.setName("홍길동");  //h.name = "홍길동";
		h.eat();
		h.sleep();
		
		Student s = new Student();
		s.setName("홍길순");
		s.setAge(21);
		s.eat();
		s.sleep();
		s.goToSchool();
		
		Job j = new Job();
		j.setName("가나다");
		j.setAge(31);
		j.jobNo = "J123456";
		j.eat();
		j.sleep();
		j.goToCompany();
		
		Human hh1 = new Human();
		Human hh2 = new Student();
		Human hh3 = new Job();
		
		Human ss1 = new Student();
		Student ss2 = null; 
		// Student ss1 = new Student();
		// Student ss2 = new Human(); // 자식 요소에 부모 요소를 넣으면 오류
		// Student ss2 = (Student) new Human(); //자식의 형태로 바꾸어서 선언
//		ss2.setName("홍길순");
//		ss2.setAge(21);
		//Student ss3 = new Job(); //형제이기 때문에 오류
		

		Student ss3 = (Student) ss1;
		ss3.sleep();
		
		
		if(ss2 instanceof Human) { //형변환 가능한지 확인
			ss2 = (Student) new Human(); 
		}
	}

}
