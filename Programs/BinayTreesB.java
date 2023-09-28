import java.util.*;
import java.util.LinkedList;

public class BinayTreesB {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinayTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // public static void preorder(Node root) { // O(n)
        // if (root == null) {
        // // System.out.print(-1 + " ");
        // return;
        // }
        // System.out.print(root.data + " ");
        // preorder(root.left);
        // preorder(root.right);
        // }

        // public static void inorder(Node root) { // O(N)
        // if (root == null) {
        // return;
        // }

        // preorder(root.left);
        // System.out.print(root.data + " ");
        // preorder(root.right);
        // }

        // public static void postorder(Node root) { // O(N)
        // if (root == null) {
        // return;
        // }

        // postorder(root.left);
        // postorder(root.right);
        // System.out.print(root.data + " ");
        // }

        public static void levelOrder(Node root) { // (NlogN)
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        // public static int height(Node root) { // O(N)
        // if (root == null) {
        // return 0;
        // }

        // int lh = height(root.left);
        // int rh = height(root.right);

        // return Math.max(lh, rh) + 1;
        // }

        // public static int countNodes(Node root) { // O(N)
        // if (root == null) {
        // return 0;
        // }

        // int lc = countNodes(root.left);
        // int rc = countNodes(root.right);
        // return lc + rc + 1;
        // }

        // public static int sumOfNodes(Node root) { // O(N)
        // if (root == null) {
        // return 0;
        // }

        // int ls = sumOfNodes(root.left);
        // int rs = sumOfNodes(root.right);
        // int sum = ls + rs + root.data;

        // return sum;
        // }

        // public static int diameter2(Node root) { // O(N^2)
        // if (root == null) {
        // return 0;
        // }

        // int leftDiam = diameter2(root.left);
        // int leftHt = height(root.left);
        // int rightDiam = diameter2(root.right);
        // int rightHt = height(root.right);

        // int selfDiam = leftHt + rightHt + 1;

        // return Math.max(selfDiam, Math.max(rightDiam, leftDiam));

        // }

        // static class Info {
        // int ht;
        // int diam;

        // Info(int ht, int diam) {
        // this.diam = diam;
        // this.ht = ht;
        // }
        // }

        // public static Info diameter(Node root) { // O(N)

        // if (root == null) {
        // return new Info(0, 0);
        // }

        // Info leftInfo = diameter(root.left);
        // Info rightInfo = diameter(root.right);

        // int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht +
        // rightInfo.ht + 1);
        // int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        // return new Info(ht, diam);
        // }

        // }

        // public static boolean isIdentical(Node node, Node subRoot) {
        // if (node == null && subRoot == null) {
        // return true;
        // } else if (node == null || subRoot == null || node.data != subRoot.data) {
        // return false;
        // }

        // if (!isIdentical(node.left, subRoot.left)) {
        // return false;
        // }
        // if (!isIdentical(node.right, subRoot.right)) {
        // return false;
        // }
        // return true;
        // }

        // public static boolean isSubtree(Node root, Node subRoot) {
        // if (root == null) {
        // return false;
        // }
        // if (root.data == subRoot.data) {
        // if (isIdentical(root, subRoot)) {
        // return true;
        // }
        // }
        // return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        // }
    }

    // static class Info {
    // Node node;
    // int hd;

    // public Info(Node node, int hd) {
    // this.node = node;
    // this.hd = hd;
    // }
    // }

    // public static void topView(Node root) {
    // Queue<Info> q = new LinkedList<>();
    // HashMap<Integer, Node> map = new HashMap();

    // int min = 0, max = 0;
    // q.add(new Info(root, 0));
    // q.add(null);

    // while (!q.isEmpty()) {
    // Info curr = q.remove();
    // if (curr == null) {
    // if (q.isEmpty()) {
    // break;
    // } else {
    // q.add(null);
    // }
    // } else {
    // if (!map.containsKey(curr.hd)) { // 1st time hd occuring
    // map.put(curr.hd, curr.node);
    // }

    // if (curr.node.left != null) {
    // q.add(new Info(curr.node.left, curr.hd - 1));
    // min = Math.min(min, curr.hd - 1);
    // }

    // if (curr.node.right != null) {
    // q.add(new Info(curr.node.right, curr.hd + 1));
    // max = Math.max(curr.hd + 1, max);
    // }
    // }

    // }

    // for (int i = min; i <= max; i++) {
    // System.out.print(map.get(i).data + " ");
    // }
    // System.out.println();

    // }

    // kth level of a tree
    public static void KLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
            return;
        }
        KLevel(root.left, level + 1, k);
        KLevel(root.right, level + 1, k);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> path) {
        if (root == null) {
            return false;
        }
        path.add(root);

        if (root.data == n) {
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundLeft || foundRight) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n1, path2);

        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }
        }
        Node lca = path1.get(i - 1);
        return lca;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinayTree tree = new BinayTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        tree.levelOrder(root);
        // System.out.println(tree.height(root));
        // System.out.println(tree.countNodes(root));
        // System.out.println(tree.sumOfNodes(root));
        // System.out.println(tree.diameter(root).diam);

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(4);

        // System.out.println(isSubtree(root, subRoot));
        // topView(root);
        // int k = 2;
        // KLevel(root, 1, 0);
        int n1 = 4;
        int n2 = 6;
        System.out.println(lca(root, n1, n2).data);
    }
}
