public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size;
    SingleLinkedList(){
        this.size=0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;

    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }   
    public int deleteLast(){
      if(size <= 1){
        return deleteFirst();
        
      }
      int val = tail.value;
       Node secondLasNode = get(size -2);
       secondLasNode.next = null;
       tail = secondLasNode;
       return val;
       
    }

    public Node get(int index){
        Node ans = head;
        for (int i = 0; i < index; i++) {
            ans = ans.next;

        }
        return ans;
    } 
    
    public void posInsert(int val , int index){
        if(index == 0){
            insertFirst(val);
        }
        if(index == size){
            insertLast(val);
        }
        Node temp = get(index -1);
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++; 

    }
    public void display(){
        Node temp = head;
        while(temp != null ){
            System.out.print(temp.value + "->");
            temp =  temp.next;
        }
        System.out.println("End");
    }
    public int posDelete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size -1){
            return deleteLast();
        }
        Node prev = get(index -1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;

    }
    private class Node{
        private int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
    
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }        
    }
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.insertFirst(10); 
        s.insertFirst(20); 
        s.insertFirst(30);
        // s.deleteFirst();
        s.posInsert(15, 2);
        s.display(); 

        s.posDelete(3);
        s.display(); 
    }
}
