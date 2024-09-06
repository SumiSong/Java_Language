package chap11;

public class ExecInteraface implements D {
	ExecInteraface(){
		
	}

	@Override
	public String getConnetion(String ip, int port) {
		System.out.println(C.ip);
		return "CONN";
	}
	
	@Override
	public void print() {
		System.out.println("aaa");
	}
	
	
	public void test() {
		System.out.println("");
	}
}
