package LinkedList;

public class DoublyLinkedList {

  private Node head;

  public void insertFirst(int val) {
    Node node = new Node(val);
    node.next = head;

    node.prev = null;

    if (head != null) {
      head.prev = node;
    }
    head = node;

  }

  public void insertLast(int val) {
    Node node = new Node(val);
    node.next = null;
    if (head == null) {
      node.prev = null;
      head = node;
      return;
    }
    Node temp = head;

    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = node;
    node.prev = temp;

  }

  public void insert(int after, int val) {
    Node node = new Node(val);
    Node p = find(after);

    if (p == null) {
      System.out.println("number is not exists");
      return;
    }

    node.next = p.next;
    p.next.prev = node;
    node.prev = p;
    p.next = node;

  }

  public Node find(int after) {
    Node temp = head;
    while (temp != null) {
      if (temp.val == after) {
        break;
      }
      temp = temp.next;
    }
    return temp;
  }

  public void display() {
    Node temp = head;
    Node last = null;
    while (temp != null) {
      System.out.print(temp.val + " -> ");
      last = temp;
      temp = temp.next;
    }
    System.out.println("END");
    System.out.println("Print Reverse ");
    while (last != null) {
      System.out.print(last.val + " -> ");
      last = last.prev;

    }
    System.out.println("START");

  }

  private class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
      this.val = val;
    }

    public Node(int val, Node next, Node prev) {
      this.val = val;
      this.next = next;
      this.prev = prev;
    }

  }

  public static void main(String[] args) {

  }
}
