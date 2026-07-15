// Last updated: 7/15/2026, 9:33:54 AM
1class Solution {
2    public ListNode removeNthFromEnd(ListNode head, int n) {
3
4        ListNode dummy = new ListNode(0);
5        dummy.next = head;
6
7        ListNode fast = dummy;
8        ListNode slow = dummy;
9
10        for (int i = 0; i <= n; i++) {
11            fast = fast.next;
12        }
13
14        
15        while (fast != null) {
16            fast = fast.next;
17            slow = slow.next;
18        }
19
20    
21        slow.next = slow.next.next;
22
23        return dummy.next;
24    }
25}