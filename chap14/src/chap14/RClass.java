package chap14;

public class RClass extends MyRClass{
	public void abc_2(int num) throws MyClass{
		if(num >=70) {
			System.out.println("정상");
		}
		else {
			throw new MyClass("예외처리2");
		}
	}
	
	public void bcd_2() {
		try {
			abc_2(65);
		}
		catch(MyClass e ) {
			System.out.println("abc_2 예외처리 : " + e.getMessage());
		}
	}
}
