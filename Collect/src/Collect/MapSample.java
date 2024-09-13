package collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {

	public static void main(String[] args) {
		Map<Integer, String> hMap1 = new HashMap<Integer, String>();
		
		//1. put(k,v)
		hMap1.put(2, "가나다");
		hMap1.put(1, "나다라");
		hMap1.put(3, "다라마");
		System.out.println(hMap1); //오버라이딩 되어 있어서 자동으로 됨
		
		//2.putAll(Map<? extends K, ? extends V> M)
		Map<Integer, String> hMap2 = new HashMap<Integer, String>();
		hMap2.putAll(hMap1);
		System.out.println(hMap2);
		
		// 3. replace(k,v) -  이전의 값 출력
		String s1 = hMap2.replace(1, "가가가");
		String s2 = hMap2.replace(4, "라라라");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(hMap2);
		
		//4. replace(k, v old, v new); - 성공 여부만 출력
		boolean b1 = hMap2.replace(1, "가가가", "나나나");
		boolean b2 = hMap2.replace(2, "다다다", "랄랄랄"); // 원래 있던 값이 틀려서 (인덱스도 동일해야함) -비밀번호 변경할 때 사용
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(hMap2);
		
		//5. v get(Object key)
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		
		//6. containsKey(Object k) - 게시판 입력, 출력 할 때 내용이 있는지 | 사용자로 부터 아이디를 받았을 때 db에서 가져와서 이를 hashmap에 넣어서 맞는지 확인 즉 해당 키카 있는지 확인
		System.out.println(hMap2.containsKey(1));
		System.out.println(hMap2.containsKey(5));
		// 사용 예시
//		if(hMap2.containsKey(1)) {
//			boolean tb = hMap2.replace(1,  "1234", "4567");
//			if(! tb) {
//				System.out.println("");
//			}
//		}	
		
		//7. containsValue(Object v)
		System.out.println(hMap2.containsValue("나나나"));
		System.out.println(hMap2.containsValue("다다다"));
		
		//8. Set<K> keySet() - Map 데이터들 중에서 Key 만 뽑아서 Set 객체로 리턴
		Set<Integer> keySetList = hMap2.keySet();
		System.out.println(keySetList.toString());
		
		//9. Set<Map.Entry<K,V>> entrySet() - 키, 값 모두 출력
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet.toString()); // 데이터 자료형이 set 이여서 []
		
		//10, size()
		System.out.println(hMap2.size());
		
		//11. remove(Object k)
		System.out.println(hMap2.remove(3));
		System.out.println(hMap2);
		hMap2.put(3, "다라마");
		System.out.println(hMap2);
		
		//12.remove(Object K, Object V)
		hMap2.remove(1, "나나나");
		hMap2.remove(3, "다다다");
		System.out.println(hMap2);
		
		//13. clear()
		hMap2.clear();
		System.out.println(hMap2); //Object 객체에 만들어져 있어서 가져온거임
		
		 
		 
		

	}

}

//[] -> set, list
// {} -> map 
