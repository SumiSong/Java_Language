package chap4;

public class example {

	public static void main(String[] args) {
//		int [] a = {1,2,3};
//		int [] b = new int[3];
//		int [] c;
//		
//		
//		int d; //메모리 차지도 안 함 아무것도 아님
//		int v = 3; // 값 할당 메모리에 올림
		
		
//		System.out.println(a);
//		System.out.println(a[0]);
		
//		int a = 3;
//		int b = a;
//		int c = b;
//		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		
//		a = 4;
//		c = 6;
//		System.out.println(a); 
//		System.out.println(b);
//		System.out.println(c);
		
		int[] x = {1,2,3,4};
		int[] z = x;
		
		System.out.println(x[0]);
		System.out.println(z[0]);
		
		x[0] = 10;
		
		System.out.println(x[0]);
		System.out.println(z[0]);


		


	}

}
