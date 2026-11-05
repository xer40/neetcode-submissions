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
        if (list1 == null || list2 == null) {
            if (list1 != null) {
                return list1;
            } else if (list2 != null) {
                return list2;
            } else {
                return null;
            }
        }
        ListNode curr = new ListNode();
        ListNode head = curr;
        while (list1 != null && list2 != null) {
            if (list2.val > list1.val) {
                System.out.print("List1 val: " + list1.val);
                curr.next = list1;
                list1 = list1.next;
                curr = curr.next;
            } else {
                System.out.print("List2 val: " + list2.val);
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            }
            if (list1 != null) {
                curr.next = list1;
            } else {
                curr.next = list2;
            }
        }
        return head.next;
    }
}