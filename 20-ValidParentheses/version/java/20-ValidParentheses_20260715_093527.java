// Last updated: 7/15/2026, 9:35:27 AM
1class Solution {
2    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
3
4        ListNode dummy = new ListNode(-1);
5        ListNode current = dummy;
6
7        while (list1 != null && list2 != null) {
8
9            if (list1.val <= list2.val) {
10                current.next = list1;
11                list1 = list1.next;
12            } else {
13                current.next = list2;
14                list2 = list2.next;
15            }
16
17            current = current.next;
18        }
19
20     
21        if (list1 != null) {
22            current.next = list1;
23        } else {
24            current.next = list2;
25        }
26
27        return dummy.next;
28    }
29}