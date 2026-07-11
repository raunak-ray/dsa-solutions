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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> qu = new LinkedList<>();
        int ans = 1;

        qu.offer(root);

        while (!qu.isEmpty()) {
            int size = qu.size();

            for (int i = 0; i<size; i++) {
                TreeNode temp = qu.poll();

                if (temp.left == null && temp.right == null)
                    return ans;


                if (temp.left != null) qu.offer(temp.left);
                if (temp.right != null) qu.offer(temp.right);
            }

            ans++;
        }

        return ans;
    }
}