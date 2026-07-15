// Last updated: 7/15/2026, 8:10:36 PM
1class Solution {
2    public ListNode reverseKGroup(ListNode head, int k) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode prevGroup = dummy;
8
9        while (true) {
10
11            // Find the kth node
12            ListNode kth = prevGroup;
13            for (int i = 0; i < k && kth != null; i++) {
14                kth = kth.next;
15            }
16
17            if (kth == null)
18                break;
19
20            ListNode groupNext = kth.next;
21
22            // Reverse the group
23            ListNode prev = groupNext;
24            ListNode curr = prevGroup.next;
25
26            while (curr != groupNext) {
27                ListNode temp = curr.next;
28                curr.next = prev;
29                prev = curr;
30                curr = temp;
31            }
32
33            // Connect reversed group
34            ListNode temp = prevGroup.next;
35            prevGroup.next = kth;
36            prevGroup = temp;
37        }
38
39        return dummy.next;
40    }
41}