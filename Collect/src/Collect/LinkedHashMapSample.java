package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> lhMap1 = new LinkedHashMap<Integer, String>();
		//1. put(K,V)
		lhMap1.put(2, "나다라");
		lhMap1.put(1, "가나다");
		lhMap1.put(3, "다라마");
		System.out.println(lhMap1);
		
		
		Set<Integer> keySet = lhMap1.keySet();
		System.out.println(keySet);
		
		
		//1. 방법 : treeset
//		TreeSet<Integer> tree = new TreeSet<Integer>();
//		for(int i=0; i<keySet.size(); i++) {
//			tree.addAll(keySet);
//		}
//		System.out.println(tree);
//		Map<Integer, String> lhMap3 = new LinkedHashMap<Integer, String>();
//		int a = 0;
//		for(int i=0; i<=tree.size()+1; i++) {
//			a = tree.pollFirst();
//			lhMap3.put(a, lhMap1.get(a));
//			//System.out.println(i);
//		}
//		System.out.println(lhMap3);
		
		
		//2 방법 : arraylist
//		ArrayList<Integer> sortKey = new ArrayList<Integer>(keySet); 
//		Collections.sort(sortKey);
//		
//		Map<Integer, String> lhMap3 = new LinkedHashMap<Integer, String>();
//		for(int i=0; i<=sortKey.size(); i++) {
//			lhMap3.put(sortKey.get(i), lhMap1.get(i+1));
//			//System.out.println(i);
//		}
//		System.out.println(lhMap3);
		
		
		
		//3 방법  
		Map<Integer, String> lhMap3 = new LinkedHashMap<Integer, String>();
		List<Integer> keys = new ArrayList<Integer>(lhMap1.keySet());
		Collections.sort(keys);
		for(Integer i : keys) {
			lhMap3.put(i, lhMap1.get(i));
		}
		System.out.println(lhMap3);
		
		
//		//2. putAll(Map<? extends K, ? extends V> m)
//		Map<Integer, String> lhMap2 = new LinkedHashMap<Integer, String>();
//		lhMap2.putAll(lhMap1);
//		System.out.println(lhMap2);
//		
//		
//		//3. replace(K, V);
//		lhMap2.replace(1, "가가가");
//		lhMap2.replace(4, "가가가");
//		System.out.println(lhMap2);
//		
//		//4. replace(K, V old, V new)
//		lhMap2.replace(1, "가가가", "나나나");
//		lhMap2.replace(2, "가가가", "다다다");
//		System.out.println(lhMap2);
		
	}

}
