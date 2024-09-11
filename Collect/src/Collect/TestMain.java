package Collect;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class TestMain extends Object{

	public static void main(String[] args){
//		H h = new H();
//		//System.out.println(h);

		A a1 = new A(3);
		A a2 = new A(3);
		String b1 = "abc";
		String b2 = "abc";
		String b3 = new String("abc");
		String b4 = new String("abc");
		Integer a = 3;
		Integer b = 3;
	
		
		System.out.println(a1==a2); //메모리 주소 비교 다른 객체로 생성되었기 때문에 다름 
		System.out.println(a1.equals(a2)); // 객체 값 비교   값, 위치 둘 다 비교
		System.out.println(a1.hashCode() + ":" + a2.hashCode());
		
		System.out.println(b1==b2); //  문자열 비교 ? 
		System.out.println(b1.equals(b2)); // 문자열 값 비교 , string의 값만 비교
		System.out.println(b1.hashCode() + ":" + b2.hashCode());
		
		System.out.println(b3==b4); //false
		System.out.println(b3.equals(b4)); //true
		System.out.println(b3.hashCode() + ":" + b4.hashCode());
//
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a.hashCode() + ":" + b.hashCode());
		
		
//		Set<A> hset1 = new HashSet<A>();
//		A a1 = new A(3);
//		A a2 = new A(3);
//		hset1.add(a1);
//		hset1.add(a2);
//		System.out.println(a1==a2); // 해쉬코드 비교
//		System.out.println(a1.equals(a2)); // 객체 값 비교   값, 위치 둘 다 비교
//		System.out.println(a1.hashCode() + ":" + a2.hashCode());
//		System.out.println(hset1.size());
//		
//		
//		B b1 = new B(3);
//		B b2 = new B(3);
//		System.out.println(b1==b2);
//		System.out.println(b1.equals(b2)); // 객체 값 비교   값, 위치 둘 다 비교
//		System.out.println(b1.hashCode() + ":" + b2.hashCode());
//		
//		Set<B> hset2 = new HashSet<B>();
//		hset2.add(b1);
//		hset2.add(b2);
//		System.out.println(hset2.size());
		
	}

}

class H{}

class A{
	int data;
	public A(int data) {
		this.data = data;
	}
}

class B{
	int data;
	public B(int data) {
		this.data = data;
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(data);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof B) {
			if(this.data == ((B)obj).data) {
				return true;
			}
		}
		return false;
	}
}