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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
      ListNode temp = head;

      int cnt=0;

      while(temp!=null)
      {
        cnt++;
        temp=temp.next;
      }

      int nodedeleted = (cnt-n)+1;
      System.out.println(nodedeleted);

      ListNode temp1=head; 
      ListNode pre=null;
      while(nodedeleted !=1)
      {  
          pre=temp1;
          temp1=temp1.next;
           System.out.println(temp1.val);
          nodedeleted--;
      }

      //System.out.println(pre.val);
      if(temp1==head) return head.next;

      pre.next=temp1.next;
      return head;
}
}
