public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add first fxn
    public void addFirst(int data) {
        // step -1 = create new node
        Node newNode = new Node(data);
        size++;

        // base case if single element
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step -2 = newNode next = head
        newNode.next = head; // link

        // step -3 = head = newNode ;
        head = newNode;
    }

    public void addLast(int data) {
        // step 1 create new node
        Node newNode = new Node(data);
        size++;

        // base case if single element
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 newNode next = tail
        tail.next = newNode;

        // step 3 tail = newNode
        tail = newNode;
    }

    // add node in middle
    public void add(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;

        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;// tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;

    }

    public int itrSearch(int key) { // tc = o(n)
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {// key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1; // key not found
    }

    public int helper(Node head, int key) {// o(n)
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;

    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeNthfromEnd(int n) {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // base case
        if (n == size) {
            head = head.next;// removeFirst;
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;

    }

    // slow fast approach
    public Node findMid(Node head) {// helper
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow; // slow is my mid node
    }

    public boolean checkPalindrome() {
        // base case
        if (head == null || head.next == null) {
            return true;
        }
        // find mid
        Node midNode = findMid(head);

        // 2nd half reverse
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        Node right = prev;// right half head
        Node left = head;

        // check if left half == right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    public static boolean isCycle() { // floyd's cycle finding algorithm
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static void removeCycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // set prev.next = null
        prev.next = null;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.add(2, 3);

        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(4));
        // System.out.println(ll.itrSearch(10));

        // System.out.println(ll.recSearch(4));
        // System.out.println(ll.recSearch(10));

        // ll.reverse();
        // ll.print();

        // ll.removeNthfromEnd(3);
        // ll.print();
        // System.out.println(ll.checkPalindrome());

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

    }

}
