// Last updated: 7/15/2026, 8:19:10 PM
1
2
3class Solution {
4    public ListNode deleteDuplicates(ListNode head) {
5
6        ListNode current = head;
7
8        while (current != null && current.next != null) {
9
10            if (current.val == current.next.val) {
11                current.next = current.next.next;
12            } else {
13                current = current.next;
14            }
15        }
16
17        return head;
18    }
19}