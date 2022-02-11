package kr.green.maven.Java1206;

import java.util.LinkedList;
import java.util.PriorityQueue;
// Queue : FIFO(First in First Out, 선입선출)의 자료 구조
public class QueueEx {
	public static void main(String[] args) {
		LinkedList<Integer> queue = new LinkedList<>();
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5); // 넣기
		queue.add(6);
		System.out.println(queue.size() + " : " + queue);

		System.out.println(queue.poll());
		System.out.println(queue.size() + " : " + queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.size() + " : " + queue);
		
		System.out.println(queue.poll()); // 꺼내기
		System.out.println(queue.size() + " : " + queue);
		
		// 우선 순위 큐 : 제일 작은값부터 꺼내진다.
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.offer(4);
		priorityQueue.offer(1);
		priorityQueue.offer(5);
		priorityQueue.offer(2);
		System.out.println(priorityQueue.size() + "개 : " + priorityQueue);
		
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue.size() + "개 : " + priorityQueue);

		while(!priorityQueue.isEmpty()) System.out.println(priorityQueue.poll());
		
	}
}
