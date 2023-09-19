import java.util.*;
import java.util.LinkedList;

public class QueueB {

    // ***********************stack using two queue ****************************

    static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        // creating isEmpty method
        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        // creating push method
        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        // creating pop method
        public static int pop() {
            // if (isEmpty()) {
            // System.out.println("empty stack");
            // return -1;
            // }

            int top = -1;
            // case 1
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q2.add(top);
                }
            } else { // case 2
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q1.isEmpty()) {
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }

        // creating peek method
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;

            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;

        }

    }

    // *********************Queue using two stacks**********************

    // static class Queue {
    // static Stack<Integer> s1 = new Stack<>();
    // static Stack<Integer> s2 = new Stack<>();

    // // creating isEmpty method
    // public static boolean isEmpty() {
    // return s1.isEmpty();
    // }

    // // creating add method o(n)
    // public static void add(int data) {
    // while (!s1.isEmpty()) {
    // s2.push(s1.pop());
    // }
    // s1.push(data);
    // while (!s2.isEmpty()) {
    // s1.push(s2.pop());
    // }
    // }

    // // creating remove method o(1)
    // public static int remove() {
    // if (s1.isEmpty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }

    // return s1.pop();
    // }

    // // creating peek method o(1)
    // public static int peek() {
    // if (s1.isEmpty()) {
    // System.out.println("queue is empty");
    // }

    // return s1.peek();
    // }
    // }

    // *******************************Implementing queue using Linked
    // List********************************

    // static class Node {
    // int data;
    // Node next;

    // Node(int data) {
    // this.data = data;
    // this.next = null;

    // }
    // }

    // static class Queue {

    // static Node head = null;
    // static Node tail = null;

    // public static boolean isEmpty() {
    // return head == null && tail == null;
    // }

    // // creating add method using linked list in queue
    // public static void add(int data) {
    // Node newNode = new Node(data);
    // if (head == null) {
    // head = tail = newNode;
    // return;
    // }
    // tail.next = newNode;
    // tail = newNode;
    // }

    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }

    // int front = head.data;
    // // single element in queue
    // if (head == tail) {
    // head = tail = null;
    // } else {
    // head = head.next;
    // }
    // return front;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("empty queue");
    // return -1;
    // }

    // return head.data;
    // }
    // }

    // ***************************Implementing queue using
    // Array*************************************

    // static class Queue {
    // static int arr[];
    // static int size;
    // static int rear;
    // static int front; // for circular queue

    // Queue(int n) {
    // arr = new int[n];
    // size = n;
    // rear = -1;
    // front = -1;

    // }

    // // creating isEmpty method to check if array is empty or not
    // public static boolean isEmpty() {
    // return rear == -1 && front == -1;
    // }

    // public static boolean isFull() {
    // return (rear + 1) % size == front;
    // }

    // // creating add method in queue
    // public static void add(int data) {
    // // if (rear == size - 1) {
    // if (isFull()) { // for circular queue
    // System.out.println("queue is full");
    // return;
    // }
    // // add first element
    // if (front == -1) {
    // front = 0;
    // }
    // rear = (rear + 1) % size;
    // arr[rear] = data;
    // }

    // // creating remove method
    // public static int remove() {
    // if (isEmpty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }

    // int result = arr[front];

    // // last element
    // if (rear == front) {
    // rear = front = -1;
    // } else {
    // front = (front + 1) % size;
    // }
    // return result;
    // }

    // // creating peek method
    // public static int peek() {
    // if (isEmpty()) {
    // System.out.println("queue is empty");
    // return -1;
    // }
    // return arr[front];
    // }
    // }

    public static void main(String[] args) {
        System.out.println("hello world");

        // Queue q = new Queue();

        // import queue from jcf
        // Queue<Integer> q = new LinkedList<>();
        // Queue<Integer> q = new ArrayDeque<>();
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}