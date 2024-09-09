package chap14;

public class EClass {
	public void abc_1(int num){
		try {
			if(num >= 70) {
				System.out.println("정상");
			}
			else {
				throw new MyClass("예외처리1");
			}
		}
		catch(MyClass e) {
			System.out.println("abc_1 예외처리 : " + e.getMessage());
		}
	}
	
	public void bcd_1() {
		abc_1(65);
	}
}
