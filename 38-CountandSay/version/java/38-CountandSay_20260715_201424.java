// Last updated: 7/15/2026, 8:14:24 PM
1class Solution {
2    public boolean isSameTree(TreeNode p, TreeNode q) {
3       
4        if (p == null && q == null) {
5            return true;
6        }
7
8      
9        if (p == null || q == null) {
10            return false;
11        }
12
13        
14        if (p.val != q.val) {
15            return false;
16        }
17
18        
19        return isSameTree(p.left, q.left) &&
20               isSameTree(p.right, q.right);
21    }
22}