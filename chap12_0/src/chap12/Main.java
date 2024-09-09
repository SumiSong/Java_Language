package chap12;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		C cc= new C();
//		A a1 = new B();
//		cc.bcd(a1);
//		
//		cc.bcd(new B());
		
		//익명 이너 클래스 이용
//		A a2 = new A() {
//			public void abc() {
//				System.out.println("a2 --> abc()");
//			}
//		};
//		cc.bcd(a2);
//		
//		//익명 이너 클래스 이용2
//		cc.bcd(new A() {
//			public void abc() {
//				System.out.println("a2 --> abc()");
//			}
//		});
		
		// 익명 이너인터페이스 사용
//		G gg = new G();
//		gg.abc();
//		
//		E.F b = new E.F() {
//			
//			@Override
//			public void abc() {
//				// TODO Auto-generated method stub
//				System.out.println("E.F b -> abc()");
//			}
//		};
//		
//		b.abc();
		
//		new E.F() {
//			@Override
//			public void abc() {
//				System.out.println("E.F b -> abc()");
//			}
//		}.abc();
		
		// 일반적인 UIAPI 구조 예(버튼)
		Button btn1 = new Button();
		btn1.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("버튼1 클릭 >> 재생");
			}
		});
		btn1.onClick();
		
		Button btn2 = new Button();
		btn2.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("버튼2 클릭 >> 종료");
			}
		});
		btn2.onClick();
	}

}
