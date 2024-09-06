package chap11;

/*
public : 동일 패키지 모든 클래스 + 다른 패키지의 모든 클래스
protected : 동일 패키지 모든 클래스 + 다른 패키지의 자식 클래스 (상속 받은 클래스)
default (아무것도 없을 때) : 동일 패키지의 모든 클래스
private : 동일 클래스에서만 사용 가능
*/

public class Sample {
	public static void main(String[] args) {
		//반드시 아우터클래스를 먼저 적은 후 이너클래스 작성
		// 인터페이스에 정의되어 있는 함수 외에 사용 불가
		InnerClass aa = new InnerClass();
		InnerClass.B bb = aa.new B();
		
		 //int zzz;
		 //System.out.println(zzz); // 지역변수 일 땐 초기화되지 않아서 
		//System.out.println(aa.a); // 3 출력  만약 클래스(aa)의 프로퍼티일 때 초기화하지 않고 사용한다면 기본값은 0으로 사용(참조 자료형을 객체화 하는 순간). 참조자료형은 null 할당
		bb.abc();
		
		
		// 익명 이너클래스
		//인터페이스를 상속받지 않고 바로 사용하는 방법
	
		E e = new E() {
			@Override
			public void abc() {
				test1();
				test2();
			
			}
			
			public void test1() {System.out.println("test1"); }
			public void test2() {System.out.println("test2");}
			public void test3() {System.out.println("test3");}
		};
		e.abc();
		
		// e.test1() 안됨(E 에는 test1() 정의되지 않음)
		
	}
}
