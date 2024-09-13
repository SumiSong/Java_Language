package collect.lambda;

interface AA{
	void abc();
}

class BB implements AA{

	@Override
	public void abc() {
		System.out.println("메서드 내용 1");
	}
	
}

public class LambdaSample {

	public static void main(String[] args) {
		
		//1. 일반 클래스 인스턴스 생성
		AA a1 = new BB();
		a1.abc();
		
		//2. 익명 이너 클래스 사용
		AA a2 = new AA(){
			@Override
			public void abc() {
				System.out.println("메서드 내용2");
			}
		};
		a2.abc();
		
		//3. 람다식으로 표현
		AA a3 = () -> {System.out.println("메서드 내용 3");};
		a3.abc();
		

	}

}


