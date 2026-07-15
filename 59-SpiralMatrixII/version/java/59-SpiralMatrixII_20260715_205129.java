// Last updated: 7/15/2026, 8:51:29 PM
1
2
3class Solution {
4    public ListNode rotateRight(ListNode head, int k) {
5
6        if (head == null || head.next == null || k == 0)
7            return head;
8
9       
10        int length = 1;
11        ListNode tail = head;
12
13        while (tail.next != null) {
14            tail = tail.next;
15            length++;
16        }
17
18        
19        k = k % length;
20
21        if (k == 0)
22            return head;
23
24        tail.next = head;
25
26        
27        int steps = length - k;
28        ListNode newTail = head;
29
30        for (int i = 1; i < steps; i++) {
31            newTail = newTail.next;
32        }
33
34        ListNode newHead = newTail.next;
35
36      
37        newTail.next = null;
38
39        return newHead;
40    }
41}