package Collect;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetSample {

	public static void main(String[] args) {
		Set<String> lset1 = new LinkedHashSet<String>();
		
		//1. add(E)
		lset1.add("가");
		lset1.add("나");
		lset1.add("다");
		lset1.add("가");
		lset1.add("나");
		lset1.add("다");
		System.out.println(lset1);
		
		Set<String> lset2 = new LinkedHashSet<String>();
		lset2.add("A");
		lset2.add("B");
		lset2.add("C");
		lset2.add("가");
		lset2.add("나");
		System.out.println(lset2);
		
		lset2.addAll(lset1); // 동일한 건 지우고 추가
		System.out.println(lset2);
		
		
		//3. remove(Object)
		lset2.remove("나");
		System.out.println(lset2);
		
		lset2.remove(lset2); // 안됨 
		System.out.println(lset2);
		
		//4. clear
		lset2.clear();
		System.out.println(lset2);
		
		//isEmpty
		System.out.println(lset2.isEmpty());
		
		//contains
		Set<String> lset3 = new LinkedHashSet<String>();
		lset3.add("가나다1");
		lset3.add("가나다2");
		lset3.add("가나다3");
		System.out.println(lset3);
		System.out.println(lset3.contains("가나")); //안됨 요소 하나를 비교하는 것임
		
		//size()
		System.out.println(lset3.size());
		//System.out.println(lset3.get); // 인덱스 사용할 수 없어서 get으로 접근하지 못 함
		
		//iterator
		Iterator<String> iterator = lset3.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next());
		}
		
		//set --> 배열
		//toArray
		Object[] obj = lset3.toArray(); //컬렉션 객체의 요소들을 배열로 변환
		System.out.println(obj); // 메모리 주소가 아닌 객체 아이디를 뽑은 것
		System.out.println(Arrays.toString(obj)); //배열의 내용을 문자열로 변환
		
		//toArray(T[] t)
		String[] arrstr = lset3.toArray(new String[0]);
		System.out.println(Arrays.toString(arrstr));
		
		//toArray(T[] t)
		String[] arrstr2 = lset3.toArray(new String[5]);
		System.out.println(Arrays.toString(arrstr2));
		System.out.println(arrstr2.length);
		
		
	}

}
