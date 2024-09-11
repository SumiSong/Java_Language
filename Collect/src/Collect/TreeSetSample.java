package Collect;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class TreeSetSample {

	public static void main(String[] args) {
		//TreeSet<String> tset1 = new TreeSet<String>();
//		tset1.add("가");
//		tset1.add("나");
//		tset1.add("다");
		
//		List<String> arrList = new ArrayList<String>();
//		arrList.add("가");
//		arrList.add("나");
//		arrList.add("다");
//		arrList.add("가");
//		arrList.add("나");
//		arrList.add("다");
//		System.out.println(arrList);
//		
//		tset1.addAll(arrList); //들어가는 타입이 컬렉션, 동일한 제네릭 타입이면 가능
//		System.out.println(tset1);
//		
//		arrList.clear();
//		arrList.addAll(tset1);
//		System.out.println(arrList);
		
		TreeSet<Integer> tset1 = new TreeSet<Integer>();
		for(int i=0; i<50; i++) {
			tset1.add(i);
		}
		
//		//1. first()
//		System.out.println(tset1.first());
//		
//		//2. last()
//		System.out.println(tset1.last());
//		
//		//3. lower()
//		System.out.println(tset1.lower(25)); //24
//		
//		//4. higher()
//		System.out.println(tset1.higher(25)); //26
//		
//		//5. floor()
//		System.out.println(tset1.floor(25)); //25
//		
//		//6. ceiling()
//		System.out.println(tset1.ceiling(25)); //25
//		System.out.print(tset1);
		
		//데이터를 꺼내는 방법
		//7. pollFirst()
		System.out.println(tset1.size());
		System.out.println("tset1.pollFirst(:) " + tset1.pollFirst() + " ");
		for(int i=0; i<tset1.size() ; i++) {
			System.out.print(tset1.pollFirst() + " "); //25까지만 나오는 이유
		}
		System.out.println(tset1.size());
		System.out.println();
		
		// 초기화
		
		
		//8. pollLast()
//		System.out.println();
//		System.out.println(tset1.size());
//		System.out.println(tset1);
//		System.out.println("tset1.pollLast(:) " + tset1.pollLast() + " ");
//		
//		for(int i=0; i<tset1.size(); i++) {
//			System.out.print(tset1.pollLast() + " ");
//		}
//		
		
	}

}
