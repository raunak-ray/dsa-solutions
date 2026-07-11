/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode find = findNode(root, val);
        
        return find;
    }

    public TreeNode findNode(TreeNode root, int val) {
        if (root == null) return null;

        Queue<TreeNode> qu = new LinkedList<>();

        qu.offer(root);

        while (!qu.isEmpty()) {
            TreeNode temp = qu.poll();

            if (temp.val == val) return temp;

            if (temp.left != null) qu.offer(temp.left);
            if (temp.right != null) qu.offer(temp.right);
        }

        return null;
    }
}