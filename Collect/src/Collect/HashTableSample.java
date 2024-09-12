package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashTableSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> htable1 = new Hashtable<Integer, String>();
		
		//1. put(K,V)
		htable1.put(2, "나다라");
		htable1.put(1, "가나다");
		htable1.put(3, "다라마");
		htable1.put(4, "바라사");
		htable1.put(5, "다바아");
//		htable1.put(4, "다라마");
		System.out.println(htable1);
		
		
		String[] valueArray = new String[htable1.size()];
        int index = 0;
        for(int i=0; i<htable1.size(); i++) {
        	valueArray[index++] = htable1.get(i+1);
        }
		for(int i=0; i<htable1.size(); i++) {
			valueArray[i] = htable1.get(i+1);
		}
		System.out.println(Arrays.toString(valueArray));

		for(int i=0; i<valueArray.length; i++) {
			if(valueArray[i].contains("다")) {
				System.out.println(valueArray[i]);
			}
		}
		
		
//		//2. putAll(Map<? extends K, ? extends V> m)
//		Map<Integer, String> htable2 = new Hashtable<Integer, String>();
//		htable2.putAll(htable1);
//		System.out.println(htable2);
//		
//		//3. replace(K, V);
//		String hs1 = htable2.replace(1, "가가가");
//		String hs2 = htable2.replace(4, "라라라");
//		System.out.println(hs1);
//		System.out.println(hs2); //key 값이 없어서 null 리턴
//		System.out.println(htable2);
//		
//		//4. replace(K, V old, V new)
//		boolean bs1 = htable2.replace(1, "가가가", "나나나");
//		boolean bs2 = htable2.replace(2, "다다다", "랄랄랄");
//		boolean bs3 = htable2.replace(4, "라라라", "가가가");
//		System.out.println(bs1); 
//		System.out.println(bs2); // 원래 값이 달라서 false
//		System.out.println(bs3); //키가 존재하지 않음 false
//		
//		//5.get(Object K)
//		System.out.println(htable2.get(1));
//		System.out.println(htable2.get(2));
//		System.out.println(htable2.get(3));
//		
//		//6. containsKey(Object K)
//		System.out.println(htable2.containsKey(1));
//		System.out.println(htable2.containsKey(5)); // 해당 키가 없어서 false
//		
//		//7. containsValue(Object v)
//		System.out.println(htable2.containsValue("나")); //값이 일대일 매칭이니까 없어서
//		System.out.println(htable2.containsValue("다다")); // 해당 값이 없어서 false
//		
//		//8. set<K> keySet()
//		Set<Integer> keySet = htable2.keySet();
//		System.out.println(keySet);
//		
//		//9. Set<Map.Entry<K,V>> entrySet()
//		Set<Map.Entry<Integer, String>> endtrySet = htable2.entrySet();
//		System.out.println(endtrySet);
//		
//		//10. size()
//		System.out.println(htable2.size());
//		
//		//11. remove(Object K)
//		htable2.remove(1);
//		System.out.println(htable2.size());
//		
//		//12. remove(Object K, Object V)
//		htable2.remove(2, "나다라");
//		htable2.remove(4, "가가가");
//		System.out.println(htable2);
//		
//		//13. clear()
//		htable2.clear();
//		System.out.println(htable2);

	}

}


//자바스크립트에서 unshift : 앞에 추가 | shift : 앞에서 빼기
