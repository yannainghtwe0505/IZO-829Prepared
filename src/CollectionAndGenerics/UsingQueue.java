package CollectionAndGenerics;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class UsingQueue {
    public static void main(String[] args) {
	//Using Queue
	Queue<Integer> queue=new LinkedList<>();
	System.out.println("Using queue");
	queue.add(50);
	queue.add(20);		
	queue.add(30);
	queue.add(40);		
	System.out.println(queue.remove());
	System.out.println(queue.remove());
	System.out.println(queue.peek());	
	//Using Deque
	Deque<Integer> deque=new LinkedList<>();
	System.out.println("Using Deque");
	deque.offerFirst(10);
	deque.offerLast(40);
	System.out.println(deque.peekFirst());

	System.out.println(deque.pollFirst());
	System.out.println(deque.pollLast());
	System.out.println(deque.pollFirst());
	System.out.println(deque.peek());
	//Using Stack 
	Deque<Integer> stack=new ArrayDeque<>();
	System.out.println("Using Stack");
	stack.push(10);
	stack.push(4);
	System.out.println(stack.peek());
	stack.poll();
	stack.poll();
	System.out.println(stack.peek());
	stack.peek();
    }
}
