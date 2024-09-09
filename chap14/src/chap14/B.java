package chap14;

public class B {
	void abc() {
		try {
			bcd();
		}
		catch(Exception e) {
			//예외처리
		}
	}
	
	void bcd() throws InterruptedException{
		Thread.sleep(1000);
	}
}
