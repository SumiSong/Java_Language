package chap11;

public interface C {
	public static final int a = 1;
	public String ip = "192.168.1.254";
	public int port = 3306;
	public abstract String getConnetion(String ip, int port);
	default void print() {
		System.out.println("aaa");
	}
	
	//default void ddd() {};
	
	//static void eee() {};
	
}
