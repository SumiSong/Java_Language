package collect;

import java.util.Stack;

public class StackSample {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		
		//1. push
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		//System.out.println(stack.get(0));
		System.out.println(stack.peek()); // 가장 위에 있는 것
		System.out.println(stack.size());
		
		//2. peek()
		System.out.println(stack.peek());
		
		//3. search(Object)
		System.out.println(stack.search(3));
		System.out.println(stack.search(4)); // 없는 값이면 -1 
		
		//4.pop()
		System.out.println(stack.pop() + ":" + stack);
		System.out.println(stack.pop() + ":" + stack);
		System.out.println(stack.pop() + ":" + stack);
		System.out.println(stack.pop() + ":" + stack);
		
		//5. empty()
		stack.push(2);
		stack.push(5);
		stack.push(3);
		stack.push(7);
		stack.clear();
		System.out.println(stack.empty());
		

	}

}
