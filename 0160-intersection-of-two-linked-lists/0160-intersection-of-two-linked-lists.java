/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode h1, ListNode h2) {
        ListNode t1 = h1, t2 = h2;
        while(t1!=t2){
            if(t1==null){
                t1 = h2;
            }
            else {
                t1=t1.next;
            }
            if(t2==null){
                t2 = h1;
            }
            else{
                t2 = t2.next;
            }
        }
        return t1;
    }
}