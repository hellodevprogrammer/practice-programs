/**
 * PalindromeLinkedList
 */
package LinkedList;

public class PalindromeLinkedList {
  public static void main(String[] args) {
    SingleList l1 = new SingleList();
    l1.insertFirst(1);
    l1.insertFirst(2);
    l1.insertFirst(2);
    l1.insertFirst(1);
    System.out.println(isPalindrome(l1.getHead()));
  }
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


    boolean static checkPalindrome(String s)
    {
       int start = 0;
       int end = s.length() -1;
       while(start <= end)
       {
        //    int mid = start + (end - start)/2;
           if(s.charAt(start) != s.charAt(end))
           {
                 return false;
           }

       }
       return true;
    }
    public static boolean isPalindrome(ListNode head) {
        ListNode temp = head ;
        // ArrayList<Integer> a1 = new ArrayList<>();
        String s = "";
        while(temp != null)
        {
              s = s+temp.val;  
              temp = temp.next;
        }

      return checkPalindrome(s);

    }
}
