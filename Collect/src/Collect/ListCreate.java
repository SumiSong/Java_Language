package Collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCreate {

	public static void main(String[] args) {
		List<Integer> arrList1 = new ArrayList<Integer>(); //capacity : 10이 디폴트 , 사이즈 10개의 공간을 가지고 있지만 값은 없음 null은 아님
		List<Integer> arrList2 = new ArrayList<Integer>(); //capacity : 30
		arrList1.add(1);
		arrList1.add(2);
		arrList1.add(3);
		arrList1.add(4);
		arrList1.add(5);
		arrList1.add(6);
		arrList1.add(7);
		arrList1.add(8);
		arrList1.add(9);
		arrList1.add(10);
		
		//arrList1.remove(13); // 안됨 범위 넘어감
		//System.out.println(arrList1.size());
		//System.out.println(arrList1);
		//arrList1.clear(); // arrList1 [] = null과 동일함 , clear는 값을 초기화
		//System.out.println(arrList1.size());
		//System.out.println(arrList1);
		
		
		//List<Integer> arrList3 = Arrays.asList(1,2,3,4,5); //... -> 몇 개 넣을건지 모름 6.0 안됨 자동형변환이 일어나지 않음
		//arrList3.add(10); // 런타임 오류 발생함 동작이 허용되지 않음
		//arrList3.set(1, 8); // set은 특정 인덱스의 값을 바꾸는 것
		//arrList3.remove(0); // 안됨 ArrayList가 아니고 Arrays이기 때문에. 
		//System.out.println(arrList3);
		
		//addAll(Collection <? extends E> c) 
		arrList2.add(1); //요소1
		arrList2.add(2);
		arrList2.add(3);
		System.out.println(arrList1.size());
		//System.out.println(arrList2);
		
		//addAll(int index, Collection <? extends E> c)
		arrList2.addAll(1, arrList1); // 내용 다 넣을 때
		System.out.println(arrList2);
		
		
  
	}

}



//2. Arrays 방법 변경은 가능하나 삭제 추가 불가능
//1. ArrayList  변경 삭제 추가 가능
