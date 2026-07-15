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

        Stack<ListNode> st=new Stack<>();
        ListNode it = head;

        while(it!=null)
        {
            st.push(it);
            it=it.next;
        }
        int len=st.size();

        if(len==1 ) return null;
       //  System.out.println(st.peek().val+ "n="+n );
        for(int i=1;i<n;i++)
        {
          //  System.out.println("hello");
            st.pop();
        }
        ListNode it1 = head;
        if(it1==st.peek())
        {
            return head.next;
        }
        while(it1.next!=st.peek())
        {
            it1=it1.next;
        }
      //  System.out.println(st.peek().val+"-"+it1.val);
      it1.next=st.peek().next;
      return head;
    }
}
