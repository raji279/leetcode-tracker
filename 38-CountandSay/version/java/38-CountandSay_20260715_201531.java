// Last updated: 7/15/2026, 8:15:31 PM
1
2class Solution {
3    List<Integer> result = new ArrayList<>();
4
5    public List<Integer> inorderTraversal(TreeNode root) {
6        inorder(root);
7        return result;
8    }
9
10    private void inorder(TreeNode node) {
11        if (node == null) {
12            return;
13        }
14
15        inorder(node.left);      // Left
16        result.add(node.val);    // Root
17        inorder(node.right);     // Right
18    }
19}
20    