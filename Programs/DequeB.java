import java.util.*;
import java.util.LinkedList;

public class DequeB {

    // implementing stack using deque

    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        // creating push method
        public void push(int data) {
            deque.addLast(data);
            ;
        }

        // creating pop method
        public int pop() {
            return deque.removeLast();
        }

        // creating peek method
        public int peek() {
            return deque.getLast();
        }
    }

    // implementing queue using deque
    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        // creating add method
        public void add(int data) {
            deque.addLast(data);
        }

        // creating remove method
        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // deque.addFirst(1);
        // deque.addLast(2);
        // deque.addFirst(3);
        // deque.addLast(4);

        // System.out.println(deque);

        // System.out.println(deque.getFirst());
        // System.out.println(deque.getLast());

        // Stack s = new Stack();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.peek());

        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());

    }
}
