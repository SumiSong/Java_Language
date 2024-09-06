package chap11;

public class InnerClass { // 아우터클래스(이너클래스 입장에서)
	//아우터 클래스의 프로퍼티
	public int aa[];
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;
	static int cc = 18; 
	
	
	//아우터클래스 메서드
	public void ma () {
		
	}
	
	protected void mb () {
			
		}
	
	void mc () {
		
	}
	
	private void md () {
		
	}
	
	// 이너클래스
	class B { //이건 static으로 가능하지만 이 안에 있는 건 static으로 선언 불가
		public int a = 10;
		public void ma () {
			
		}
		//이너클래스 메서드
		void abc() { //메서드는 static으로 선언할 수 없음
			System.out.println("this a" + this.a);
//			System.out.println("Outer a" + InnerClass.this.a);
//			System.out.println("Outer b" + b);
//			System.out.println("Outer c" + c);
//			System.out.println("Outer d" + d);
//			
//			ma();
//			mb();
//			mc();
//			md();
		}
		
		class C extends B{ //가능
			
		}
	}
}
