package collect;

import java.util.LinkedList;
import java.util.Queue;

public class QueueSample {

	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<Integer>(); // 클래스의 다형성으로 가능 부모와 자식 관계
//		if(q1 != null && !q1.isEmpty()) {
//			System.out.println(q1.element());
//		}
		try {
			System.out.println(q1.element());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		q1.add(3);
		q1.add(4);
		q1.add(5);
		System.out.println(q1.element());
		
		//System.out.println(q1.remove(q1));
		
		Queue<Integer> q2 = new LinkedList<Integer>();
		Queue<Integer> q3 = new LinkedList<Integer>();
//		q3.add(1);
//		q3.add(3);
//		q3.add(5);
//		q3.add(7);
//		q3.add(9);
//		
//		q2.add(1);
//		q2.add(12); 
//		q2.add(13);
//		q2.add(3);
//		q2.add(2);
//		q2.addAll(q1);
//		System.out.println(q2);
//		//q2.remove(); // 가장 앞에 내용 삭제
//		//q2.remove(5); // 가장 앞에서 해당하는 내용 삭제s
//		q2.removeAll(q1);
//		System.out.println(q2);
		
		//offer
		q2.offer(1);
		q2.offer(2);
		q2.offer(3);
		q2.offer(4);
		q2.offer(5);
		System.out.println(q2);
		
		//peek()
		System.out.println(q2.peek());
		
//		q2.clear();
//		System.out.println(q2.peek()); // 자동으로 예외 처리함 
		
		//poll()
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		System.out.println(q2.poll());
		
		

	}

}
