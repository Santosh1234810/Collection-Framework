package javaFullstack.Collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {
	public static void main(String[] args) {
		/*Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println("Elements are: "+queue);
		queue.offer(40);
		queue.offer(50);
		System.out.println("After offer() method: "+queue);
		System.out.println(queue.peek()); //this method returns the first element of the queue
		
		queue.poll(); //this method removes the head element of the queue
		System.out.println(queue);
		*/
		
		Queue<Integer> queue2 = new PriorityQueue<Integer>();
		queue2.add(11);
		queue2.add(22);
		queue2.add(33);
		System.out.println(queue2);
		queue2.offer(44);
		queue2.offer(55);//offer() method returns the elements at the end
		System.out.println("After offer method: "+queue2);
		
		System.out.println("After poll() method: "+queue2.poll()); // this method return the head of the queue
		System.out.println(queue2);
		System.out.println("After peek() method: "+queue2.peek());
		
		
	}
}
