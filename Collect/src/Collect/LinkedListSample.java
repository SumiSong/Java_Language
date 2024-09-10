package Collect;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {

	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<Integer>();
		
		//1. add(E)
		linkedList.add(1);
		linkedList.add(2);
		linkedList.add(3);
		//System.out.println(linkedList); 
		
		//2.add(index, E)
		linkedList.add(1, 4);
		linkedList.add(2, 6);
		//System.out.println(linkedList); 
		
		List<Integer> linkedList2 = new LinkedList<Integer>();
		linkedList2.add(10);
		linkedList2.add(11);
		linkedList2.addAll(linkedList);
		//System.out.println(linkedList2); 
		
		linkedList2.addAll(4,linkedList);
		//System.out.println(linkedList2);
		
		linkedList.remove(1);
		//System.out.println(linkedList);
		
		List<Integer> linkedList3 = new LinkedList<Integer>();
		linkedList3.add(1);
		linkedList3.add(3);
		linkedList3.add(5);
		linkedList3.add(7);
		linkedList3.add(9);
		linkedList3.add(11);
		linkedList3.add(13);
		System.out.println(linkedList2);
		linkedList2.removeAll(linkedList3);
		//linkedList2.removeAll(null); // 객체가 들어와야함 null은 안됨
		//linkedList2.removeAll(new Integer[0]); //안됨
		System.out.println(linkedList2);
		
		
	}

}

//arraylist 는 검색이 빠르고 linkedlist는 추가 삭제가 빠름 왜냐 인덱스가 아닌 앞뒤로 체크함
//즉 linkedlist 하고 arraylist 변경
// 베열에서 내용 정렬하기