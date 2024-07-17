package sub2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 날짜 : 2024.07.17
 * 이름 : 정지현
 * 내용 : 스택, 큐 실습하기
 * 
 */
public class StackQueueTest {
	public static void main(String[] args) {
		
		//스택
		Stack<Integer> stack = new Stack<>(); //push , pop
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		while(!stack.empty()) { //empty 메서드는 스택이 비어있는지 확인, !가 붙어서 비어있지 않으면 pop하라는 의미
			System.out.print(stack.pop() + ", ");
		}
		System.out.println();
		// 큐
		Queue<Integer> queue = new LinkedList<Integer>(); //offer , poll
		queue.offer(1); 
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);
		
		while(!queue.isEmpty()) {
			System.out.print(queue.poll() + ", ");
		}
	}
}
