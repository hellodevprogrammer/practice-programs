package LinkedList;

import java.util.*;

import org.omg.CORBA.NO_IMPLEMENT;

/**
 * SingleList
 */
public class SingleList {
    private Node head;
    private Node tail;

    private int size;

    public SingleList() {
        this.size = 0;

    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;

    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;

    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node secondNode = get(size - 2);
        int val = tail.value;
        // secondNode.next = null;
        tail = secondNode;
        tail.next = null;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }


    //insert using recursion

    public void insertRec(int val , int index)
    {
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val , int index , Node node)
    {
        if(index == 0)
        {
            Node temp = new Node(val , node);
            size++;
            return temp;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }




    public void posInsert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }
        Node temp = head;
        int i = 1;
        while (i < index) {
            temp = temp.next;
            i++;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public Node getHead() {
        return head;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == (size - 2)) {
            return deleteLast();
        }

        Node prev = get(index - 1);
        int val = prev.next.value;

        prev.next = prev.next.next;
        return val;
    }

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        // LinkedList<Integer> list = new LinkedList<>();
        // list.add(34);

    }
}