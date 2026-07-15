// Last updated: 7/15/2026, 8:03:11 PM
1import java.util.PriorityQueue;
2
3class Solution {
4    public ListNode mergeKLists(ListNode[] lists) {
5
6        PriorityQueue<ListNode> pq = new PriorityQueue<>(
7            (a, b) -> a.val - b.val
8        );
9
10        // Add first node of every list
11        for (ListNode node : lists) {
12            if (node != null) {
13                pq.offer(node);
14            }
15        }
16
17        ListNode dummy = new ListNode(0);
18        ListNode current = dummy;
19
20        while (!pq.isEmpty()) {
21
22            ListNode node = pq.poll();
23
24            current.next = node;
25            current = current.next;
26
27            if (node.next != null) {
28                pq.offer(node.next);
29            }
30        }
31
32        return dummy.next;
33    }
34}
35