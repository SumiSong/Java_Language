package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetSample {

	public static void main(String[] args) {
		Set<String> hset1 = new HashSet<String>();
		
		//1. add(E)
		hset1.add("가");
		hset1.add("나");
		hset1.add("다");
		System.out.println(hset1);
		
		//2. addAll(Collection <? extneds E> c)
		Set<String> hset2 = new HashSet<String>();
		hset2.add("A");
		hset2.add("B");
		hset2.addAll(hset1);
		System.out.println(hset2);
		
		//3. remove(Object o)
		hset1.remove("나");
		System.out.println(hset1);
		
		//4. clear
		hset2.clear();
		System.out.println(hset2);
		
		System.out.println(hset2.isEmpty());
		
		
		Set<String> hset3 = new HashSet<String>();
		hset3.add("가");
		hset3.add("나");
		hset3.add("다");
		hset3.add("다");
		hset3.add("다");
		hset3.add("다");
		System.out.println(hset3);
		System.out.println(hset3.contains("가"));
		System.out.println(hset3.size());
		
		
		//iterator()
		Iterator<String> iterator  = hset3.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next() + "");
		}
		System.out.println();
		
		//toArray
		Object[] obj = hset3.toArray();
		System.out.println(Arrays.toString(obj));
		
		//toArray(t[] t)
		String[] arrstr = hset3.toArray(new String[0]);
		System.out.println(Arrays.toString(arrstr));
		
		String[] arrstr2 = hset3.toArray(new String[5]);
		System.out.println(Arrays.toString(arrstr2));
		
		
		
		// 중복 제거
		List<String> arrList = new ArrayList<String>();
		arrList.add("가");
		arrList.add("나");
		arrList.add("다");
		arrList.add("다");
		arrList.add("다");
		arrList.add("다");
		System.out.println(arrList);
		
	
		Set<String> test = new HashSet<String>();
		test.addAll(arrList);
		arrList.clear();
		arrList.addAll(test);
		System.out.println(test);
	}

}
