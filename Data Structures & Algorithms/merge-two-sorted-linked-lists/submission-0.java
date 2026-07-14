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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode it1 = list1;
        ListNode it2 = list2;
        ListNode res = new ListNode(0);
        ListNode it = res;
        while(it1!= null && it2 !=null)
        { 
          if(it1.val < it2.val)
          {
            it.next = it1;
            it1=it1.next;
            
          }else {
            it.next=it2;
            it2=it2.next;

          }
         
          it=it.next;

        }
        if(it1 !=null)
        {
            it.next=it1;
        }
        if(it2!=null)
        {
            it.next = it2;
        }
        return res.next;
    }
}