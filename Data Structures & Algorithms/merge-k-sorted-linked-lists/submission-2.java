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
    public ListNode mergeKLists(ListNode[] lists) {
      if(lists.length==0)return null;
      return divideandmerge(lists,0,lists.length-1);
    }
    public ListNode divideandmerge(ListNode[] lists, int left , int right)
    {
        if(left == right) return lists[left];

        int mid = left + (right-left)/2;

        ListNode leftmerge = divideandmerge(lists, left,mid);
        ListNode rightmerge = divideandmerge(lists,mid+1,right);

        return sorttolist(leftmerge,rightmerge);



    }
    public ListNode sorttolist(ListNode list1,ListNode list2)
    {
        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        ListNode it = dummy;
        ListNode it1 = list1;
        ListNode it2 = list2;

        while(it1!=null && it2!=null)
        {
            if(it1.val <=it2.val)
            {
               it.next=it1;
               it1=it1.next;
            }
            else{

                it.next=it2;
                it2=it2.next;
            }
            it=it.next;
        }

        if(it1 != null){
            it.next = it1;
        }
        if(it2 != null)
        {it.next=it2;}

        return dummy.next;

    }
}
