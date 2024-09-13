package collect.lambda;
interface A{
	void method1();
}
interface B{
	void method2(int a);
}
interface C{
	int method3();
}
interface D{
	double method4(int a, double b);
}

public class LambdaTest2 {

	public static void main(String[] args) {
		// 1. 익명 이너 클래스 방식으로 구현
		A a1 = new A() {
			@Override
			public void method1() {
				System.out.println("입력 매개변수 X, 리턴값 X");
			}
		};
		a1.method1();
		
		B b1 = new B() {
			@Override
			public void method2(int a) {
				System.out.println("입력 매개변수 O, 리턴값 X" + a);
			}
		};
		b1.method2(2);
		
		C c1 = new C() {
			@Override
			public int method3() {
				System.out.println("입력 매개변수 X, 리턴값 O");
				return 3;
			}
		};
		c1.method3();
		
		D d1 = new D() {
			@Override
			public double method4(int a, double b) {
				System.out.println("입력 매개변수 O, 리턴값 O" + a +  " " + b);
				return a+b;
			}
		};
		d1.method4(4, 4.0);
		 
		System.out.println("===========================================");
		
		// 2. 람다식 표현
		A a2 = () -> {System.out.println("입력 매개변수 X, 리턴값 X");};
		
		B b2 = (int a) -> {System.out.println("입력 매개변수 O, 리턴값 X" + a);};
		
		C c2 = () -> {
			System.out.println("입력 매개변수 X, 리턴값 O");
			return 3;
		};
		
		D d2 = (int a, double b) -> {
			System.out.println("입력 매개변수 O, 리턴값 O" + a +  " " + b);
			return a+b;
		};
		
		a2.method1();
		b2.method2(2);
		c2.method3();
		d2.method4(4, 4.0);

	}

}
