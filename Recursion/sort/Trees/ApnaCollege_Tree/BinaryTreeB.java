package Recursion.sort.Trees.ApnaCollege_Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.math.*;

public class BinaryTreeB {
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

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;
        }

        public static void preOrder(Node root) {// o(n)
            if (root == null) {
                return;
            }
            System.out.println(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }

        public static void inOrder(Node root) {// o(n)
            if (root == null) {
                return;
            }
            preOrder(root.left);
            System.out.println(root.data + " ");
            preOrder(root.right);

        }

        public static void postOrder(Node root) {// o(n)
            if (root == null) {
                return;
            }
            preOrder(root.left);
            preOrder(root.right);
            System.out.print(root.data + " ");

        }

        // level order travsersal
        public static void levelOrder(Node root) {
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

        // height

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh, rh) + 1;
        }

        // count

        public static int count(Node root) {
            if (root == null) {
                return 0;
            }
            int lcount = count(root.left);
            int rcount = count(root.right);
            return lcount + rcount + 1;
        }

        // diameter of tree(number of nodes in the longest path between 2 leaves)

        public static int diameter(Node root) {
            if (root == null) {
                return 0;
            }
            int ld = diameter(root.left);
            int rd = diameter(root.right);
            int lheight = height(root.left);
            int rheight = height(root.right);
            int selfdia = lheight + rheight + 1;
            return Math.max(selfdia, Math.max(ld, rd));
        }

        static class Info {
            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter2(Node root) {// o (n)
            if (root == null) {
                return new Info(0, 0);
            }
            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int dia = Math.max(leftInfo.ht + rightInfo.ht + 1, Math.max(leftInfo.diam,
                    rightInfo.diam));
            Info selfInfo = new Info(dia, Math.max(leftInfo.ht, rightInfo.ht) + 1);
            return selfInfo;

        }

    }

    public static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }

        if (!isIdentical(root.left, subRoot.left)) {
            return false;
        }
        if (!isIdentical(root.right, subRoot.right)) {
            return false;
        }
        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        boolean leftAns = isSubtree(root.left, subRoot);
        boolean rightAns = isSubtree(root.right, subRoot);
        return leftAns || rightAns;
    }
 
    // static class Info {
    // Node node;
    // int hd;// horizontal distance of node

    // public Info(Node node, int hd) {
    // this.hd = hd;
    // this.node = node;
    // }
    // }

    // public static void topView(Node root) {
    // Queue<Info> q = new LinkedList<>();
    // HashMap<Integer, Node> map = new HashMap<>();

    // int min = 0, max = 0;
    // q.add(new Info(root, 0));
    // q.add(null);

    // while (!q.isEmpty()) {
    // Info cur = q.remove();
    // if (cur == null) {
    // if (q.isEmpty()) {
    // break;
    // } else {
    // q.add(null);
    // }
    // } else {
    // if (!map.containsKey(cur.hd)) {// first time horizontal distance occur
    // map.put(cur.hd, cur.node);
    // }
    // if (cur.node.left != null) {
    // q.add(new Info(cur.node.left, cur.hd - 1));
    // min = Math.min(min, cur.hd - 1);
    // }
    // if (cur.node.right != null) {
    // q.add(new Info(cur.node.right, cur.hd + 1));
    // max = Math.max(max, cur.hd + 1);
    // }
    // }
    // }

    // for (int i = min; i <= max; i++) {
    // System.out.println(map.get(i).data);
    // }
    // }

    public static void kOrder(Node root, int count, int k) {
        if (root == null) {
            return;
        }
        if (count == k) {
            System.out.print(root.data);
            return;
        }
        kOrder(root.left, count + 1, k);
        kOrder(root.right, count + 1, k);
    }

    public static boolean getPath(Node node, int n, ArrayList<Node> path) {

        if (node == null) {
            return false;
        }
        path.add(node);
        if (node.data == n) {
            return true;
        }
        boolean left = getPath(node.left, n, path);
        boolean right = getPath(node.right, n, path);
        if (left || right) {
            return true;

        }
        path.remove(path.size() - 1);
        return false;
    }

    public static Node lca(Node node, int n1, int n2) {
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();
        getPath(node, n1, path1);
        getPath(node, n2, path2);

        // lase common ancestor
        int i = 0;
        for (; i < path1.size() && i < path2.size(); i++) {
            if (path1.get(i) != path2.get(i)) {
                break;
            }

        }

        // last equal node -> i-1th
        Node lca = path1.get(i - 1);

        return lca;

    }
    // public static boolean search(Node node,int n1,int n2)
    // {
    // return node.data == n1 || node.data == n2;
    // }
    // public static Node lca2(Node node,int n1, int n2)
    // {
    // if(node == null)
    // {
    // return null;
    // }
    // boolean leftsearch = search(node.left,n1,n2);
    // boolean rightsearch = search(node.right,n1,n2);
    // if(rightsearch && leftsearch)
    // {
    // return node;
    // }
    // Node leftlca = lca(node.left, n1, n2);
    // Node rightlca =lca(node.right, n1, n2);

    // if(leftlca == null)
    // {
    // return rightlca;
    // }
    // if(rightlca == null)
    // {
    // return leftlca;
    // }
    // return null;
    // }

    public static Node lca2(Node node, int n1, int n2) {
           
        if (node == null || node.data == n1 || node.data == n2) {
            return node;
        }
        Node leftlca = lca2(node.left, n1, n2);
        Node rightlca = lca2(node.right, n1, n2);
        if (rightlca == null) {
            return leftlca;
        }
        if (leftlca == null) {
            return rightlca;
        }
        return node;
    }

    public static void main(String[] args) {
        // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        // Node root = bt.buildTree(nodes);
        // // System.out.println(root.data);
        // // bt.postOrder(root);

        // // bt.inOrder(root);
        // // bt.levelOrder(root);
        // // System.out.println(bt.height(root));
        // // System.out.println(bt.count(root));
        // System.out.println(bt.diameter2(root).ht);

        // 1
        // / \
        // 2 3
        // /\ /\
        // 4 5 6 7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(lca2(root, 4, 7).data);
        // bt.preOrder(root);

        // kOrder(root, 1, 3);
        // topView(root);

        // 2
        // / \
        // 4 5

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);
        // System.out.println(isSubtree(root, subRoot));
    }
}
