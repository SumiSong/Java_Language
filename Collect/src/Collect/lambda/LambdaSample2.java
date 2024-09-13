package collect.lambda;

interface LA2 {
	void abc();
}

class LB2 {
	void bcd() {
		System.out.println("B 메서드1");
	}
}

public class LambdaSample2 {

	public static void main(String[] args) {
		// 1. A를 구현한 클래스에서 abc() 내부에서 B 객체를 접근하는 익명 이너 클래스 
		LA2 a1 = new LA2() {
			@Override
			public void abc() {
				LB2 b1 = new LB2();
				b1.bcd();
			}
		};
		a1.abc();
		
		//2. 람다로 변경
		LA2 a2 = () ->{
			LB2 b1 = new LB2();
			b1.bcd();
		};
		a2.abc();
		
		
	
	}

}
