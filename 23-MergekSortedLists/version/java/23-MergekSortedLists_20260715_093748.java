// Last updated: 7/15/2026, 9:37:48 AM
1class Solution {
2    public ListNode swapPairs(ListNode head) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode prev = dummy;
8
9        while (prev.next != null && prev.next.next != null) {
10
11            ListNode first = prev.next;
12            ListNode second = first.next;
13
14          
15            first.next = second.next;
16            second.next = first;
17            prev.next = second;
18
19            
20            prev = first;
21        }
22
23        return dummy.next;
24    }
25}