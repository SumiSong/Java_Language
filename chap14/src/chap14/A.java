package chap14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class A {

//	public static void main(String[] args) throws InterruptedException {
//		Thread.sleep(1000);
//		
//	}
	
//	public static void main(String[] args) throws ClassNotFoundException {
//		Class cls = Class.forName("java.lang.Object");
//	}
	
//	public static void main(String[] args) throws IOException {
//		InputStreamReader isr = new InputStreamReader(System.in);
//		isr.read();
//	}
	
//	public static void main(String[] args) throws FileNotFoundException {
//		FileInputStream fis = new FileInputStream("text.txt");
//	
//	}
	
//	public static void main(String[] args) {
////		int a = 3;
////		int b = 0;
////		int c = 0;
////		//c = a/b;
////		System.out.println(3/0);
//		//int num = Integer.parseInt("10!");
////		System.out.println(num);
////		String a = null;
////		System.out.println(a.charAt(2));
//		
//		InputStreamReader isr = null;
//		try {
//			isr = new InputStreamReader(System.in);
//			System.out.println(isr.read());
//		}
//		catch(IOException e) {
//			// 예외처리
//		}
//		finally {
//			if(isr != null) {
//				try {isr.close();}
//				catch(IOException e) {
//					//예외처리
//				}
//			}
//		}
//		
//		try(InputStreamReader isr2 = new InputStreamReader(System.in);)
//		{
//			System.out.println(isr2.read());
//		}
//		catch(IOException e) {
//			// 예외처리
//		}
//		catch(Exception e) {
//			//
//		}
//		
//	}
//	public static void main(String[] args) {
//		AClose aa = null;
//		try {
//			aa = new AClose("파일");
//			aa.abc();
//		}
//		catch(Exception e) {
//			System.out.println("예외처리1");
//		}
//		finally {
//			if(aa.rsc != null){
//				try {
//					aa.close();
//				}
//				catch(Exception e) {
////					System.out.println("예외처리");
//				}
//			}
//		}
//		
//		
//		try(AClose aa2 = new AClose("파일2");)
//		{
//			aa2.abc();
//		}
//		catch(Exception e) {
//			System.out.println("예외처리2");
//		}
//	}
	
	
	//public static void main(String[] args) throws MyClass {
////		MyClass my1 = new MyClass();
////		MyClass my2 = new MyClass("예외메세지1");
//		
////		throw my1;
////		throw my2;
////		
////		throw new MyClass();
////		throw new MyClass("예외메세지1-1");
//		
//		EClass my1 = new EClass();
//		my1.bcd_1();
//		
//		RClass my2 = new RClass();
//		my2.bcd_2();
//		
//	}
MyClass<Integer> mys = new MyClass<Integer>();
MyClass2<String, Integer> mys2 = new MyClass2<String, Integer>();
	
class MyClass<T>{
	private T t;
	public T get() {
		return this.t;
	}
	public void set(T t) {
		this.t = t;
	}
}

class MyClass2 <K, V>{
	private K k1;
	private V v1;
	public void setKey(K k) {
		this.k1 = k;
	}
	public V getValue() {
		return this.v1;
	}
}
}
 