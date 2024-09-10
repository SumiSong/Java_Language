package Collect;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] arr = new String[] {"가", "나", "다", "라", "마", "바", "사"};
		arr[2] = null;
		arr[5] = null;
		System.out.println(arr.length);
		
		//제네릭을 사용하여 문자열(String)을 저장할 수 있는 리스트(ArrayList)**를 생성하는 코드
		List<String> arrList = new ArrayList<>(); //인터페이스에 부모요소로 자료형 선언하고 자식요소(List 인터페이스를 구현하는 대표적인 클래스 :ArrayList, LinkedList)로 객체 만들어서 할당함
		arrList.add("가");
		arrList.add("나");
		arrList.add("다");
		arrList.add("라");
		arrList.add("마");
		arrList.add("바");
		arrList.add("사");
		arrList.remove("다");
		arrList.remove("바");
		System.out.println(arrList.size());
		System.out.println(arrList);
	}

}
