package pe.joedayz.samples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(4);
        queue.add(1);
        queue.add(2);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println("===================");

        Deque<Integer> deque = new LinkedList<>();

        deque.offerFirst(10);
        System.out.println(deque);
        deque.offerLast(4);
        System.out.println(deque);
        deque.peekFirst();
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.peekFirst());

        System.out.println("===================");

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
