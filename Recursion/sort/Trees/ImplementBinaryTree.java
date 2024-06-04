package Recursion.sort.Trees;

import java.util.Scanner;

public class ImplementBinaryTree {
    public ImplementBinaryTree() {

    }

    private static class Node {
        private int value;
        private Node right;
        private Node left;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node root;

    // insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to enter the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void preetyDisplay() {
        preetyDisplay(root, 0);
    }

    public void preetyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }
        preetyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->" + node.value);
        } else {
            System.out.println(node.value);

        }

        preetyDisplay(node.left, level + 1);
    }

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.value + " ");

        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ImplementBinaryTree tree = new ImplementBinaryTree();
        tree.populate(scanner);
        tree.display();
        // tree.preetyDisplay();
    }
}
