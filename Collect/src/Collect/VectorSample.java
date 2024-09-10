package Collect;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class VectorSample {

	public static void main(String[] args) {
		List<Integer> vt1 = new Vector<Integer>();
		
		// 1. add(E)
		vt1.add(3);
		vt1.add(4);
		vt1.add(5);
		//System.out.println(vt1);
		
		//2. add(index, E)
		vt1.add(1,6);
		//System.out.println(vt1);
		
		vt1.remove(1);
		//System.out.println(vt1);
		
		List<Integer> vt2 = new Vector<Integer>();
		vt2.add(1);
		vt2.add(2);
		vt2.addAll(vt1);
		//System.out.println(vt2);
		
		//vt2.removeAll(vt1); //이때 락이 걸림. ()안에 컬렉션 만들어서 넣는거임
		//System.out.println(vt1);
		//System.out.println(vt2);
		
		//리스트 --> 배열
		//toArray()
		Object[] obj = vt2.toArray();
		//System.out.println(obj.toString()); // 주소 리턴
		//System.out.println(Arrays.toString(obj)); // 배열의 요소 값을 문자열로 리턴
		
		
		//toArray(T[] t)
		Integer[] arrInt = vt2.toArray(new Integer[0]); // 사이즈가 0이면 자기 자신을 넣음
		System.out.println(Arrays.toString(arrInt)); // 배열의 요소 값을 문자열로 리턴
		
		
		//toArray(T[] t)
		Integer[] arrInt2 = vt2.toArray(new Integer[7]); // new Integer[7]은 크기가 7인 Integer 배열을 생성함. 
		System.out.println(Arrays.toString(arrInt2)); 
		
		
		//채팅일 땐 사용. 게시판은 사용하지 않음
	}

}
