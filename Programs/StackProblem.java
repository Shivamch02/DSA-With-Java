import java.util.*;

public class StackProblem {

    // public static void pushAtBottom(Stack<Integer> s, int data) {
    // if (s.isEmpty()) {
    // s.push(data);
    // return;
    // }

    // int top = s.pop();
    // pushAtBottom(s, data);
    // s.push(top);
    // }

    // public static String reverseString(String str) {
    // Stack<Character> s = new Stack<>();

    // int idx = 0;
    // while (idx < str.length()) {
    // s.push(str.charAt(idx));
    // idx++;
    // }

    // StringBuilder result = new StringBuilder();
    // while (!s.isEmpty()) {
    // char curr = s.pop();
    // result.append(curr);
    // }
    // return result.toString();
    // }

    // public static void reverseStack(Stack<Integer> s) {
    // if (s.isEmpty()) {
    // return;
    // }

    // int top = s.pop();
    // reverseStack(s);
    // pushAtBottom(s, top);

    // }

    // public static void printStack(Stack<Integer> s) {
    // while (!s.isEmpty()) {
    // System.out.println(s.pop());

    // }
    // }

    // public static void stockSpan(int stock[], int span[]) {
    // Stack<Integer> s = new Stack<>();
    // span[0] = 1;
    // s.push(0);
    // for (int i = 1; i < stock.length; i++) {
    // int currPrice = stock[i];
    // while (!s.isEmpty() && currPrice > stock[s.peek()]) {
    // s.pop();
    // }
    // if (s.isEmpty()) {
    // span[i] = i + 1;
    // } else {
    // int prevHigh = s.peek();
    // span[i] = i - prevHigh;
    // }
    // s.push(i);
    // }

    // }

    // sort a stack
    // public static void insertSorted(Stack<Integer> s, int target) {
    // if (s.isEmpty()) {
    // s.push(target);
    // return;
    // }
    // if (s.peek() >= target) {
    // s.push(target);
    // return;
    // }
    // int topElement = s.peek();
    // s.pop();

    // insertSorted(s, target);
    // s.push(topElement);
    // }

    // public static void sortStack(Stack<Integer> s) {
    // if (s.isEmpty()) {
    // return;
    // }
    // int top = s.peek();
    // s.pop();

    // sortStack(s);
    // insertSorted(s, top);
    // }

    // redundent parenthesis
    // public static Boolean isDuplicate(String str) {
    // Stack<Character> s = new Stack<>();
    // for (int i = 0; i < str.length(); i++) {
    // char ch = str.charAt(i);

    // if (ch == ')') {
    // int count = 0;
    // while (s.pop() != '(') {
    // count++;
    // }
    // if (count < 1) {
    // return true;
    // }
    // } else {
    // s.push(ch);
    // }
    // }
    // return false;
    // }

    // max area in histogram
    public static int maxArea(int arr[]) {
        int maxArea = 0;
        Stack<Integer> s = new Stack<>();
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // next smaller right

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);

        }
        return maxArea;

    }

    // private static boolean isEmpty() {
    // return false;
    // }

    public static void main(String[] args) {
        System.out.println("hello world");
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // sortStack(s);

        // reverseStack(s);
        // printStack(s);
        // String str = "(a+b)";
        // System.out.println(isDuplicate(str));
        System.out.println(maxArea(arr));

        // int stock[] = { 100, 80, 60, 70, 60, 85, 100 };
        // int span[] = new int[stock.length];

        // stockSpan(stock, span);
        // for (int i = 0; i < span.length; i++) {
        // System.out.println(span[i]);
        // }

    }
}
