
public class DoubleLL {
    class Node1 {
        int data;
        Node1 next;
        Node1 prev;

        public Node1(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;

        }
    }

    public static Node1 head;
    public static Node1 tail;
    public static int size;

    // add
    public void addFirst1(int data) {

        Node1 newNode = new Node1(data);
        size++;
        if (head == null) {
            head = tail = null;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // remove first
    public int removeFirst1() {
        if (head == null) {
            return Integer.MIN_VALUE;
        }
        int value = head.data;
        if (size == 1) {

            head = tail = null;
            size--;
            return value;
        }

        head = head.next;
        head.prev = null;
        size--;
        return value;
    }

    // reverse
    public void reverse() {
        Node1 curr = head;
        Node1 prev = null;
        Node1 next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // print
    public void print1() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        // System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst1(3);
        dll.addFirst1(2);
        dll.addFirst1(1);
        // dll.print1();
        // System.out.println(dll.size);

        // dll.removeFirst1();
        dll.print1();
        // System.out.println(size);
        dll.reverse();
        dll.print1();

    }
}
